package org.schabi.newpipe.extractor.services.youtube.stream;

import org.junit.BeforeClass;
import org.junit.Test;
import org.schabi.newpipe.downloader.DownloaderFactory;
import org.schabi.newpipe.extractor.NewPipe;
import org.schabi.newpipe.extractor.StreamingService;
import org.schabi.newpipe.extractor.services.DefaultStreamExtractorTest;
import org.schabi.newpipe.extractor.services.youtube.YoutubeParsingHelper;
import org.schabi.newpipe.extractor.services.youtube.extractors.YoutubeStreamExtractor;
import org.schabi.newpipe.extractor.stream.StreamExtractor;
import org.schabi.newpipe.extractor.stream.StreamType;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import static org.schabi.newpipe.extractor.ServiceList.YouTube;

public class YoutubeStreamExtractorLivestreamTest extends DefaultStreamExtractorTest {
    private static final String RESOURCE_PATH = DownloaderFactory.RESOURCE_PATH + "services/youtube/extractor/stream/";
    private static final String ID = "5qap5aO4i9A";
    private static final int TIMESTAMP = 1737;
    private static final String URL = YoutubeStreamExtractorDefaultTest.BASE_URL + ID + "&t=" + TIMESTAMP;
    private static StreamExtractor extractor;

    @BeforeClass
    public static void setUp() throws Exception {
        YoutubeParsingHelper.resetClientVersionAndKey();
        YoutubeParsingHelper.setNumberGenerator(new Random(1));
        YoutubeStreamExtractor.resetDeobfuscationCode();
        NewPipe.init(new DownloaderFactory().getDownloader(RESOURCE_PATH + "live"));
        extractor = YouTube.getStreamExtractor(URL);
        extractor.fetchPage();
    }

    @Override
    @Test
    public void testUploaderName() throws Exception {
        super.testUploaderName();
    }

    @Override public StreamExtractor extractor() { return extractor; }
    @Override public StreamingService expectedService() { return YouTube; }
    @Override public String expectedName() { return "lofi hip hop radio - beats to relax/study to"; }
    @Override public String expectedId() { return ID; }
    @Override public String expectedUrlContains() { return YoutubeStreamExtractorDefaultTest.BASE_URL + ID; }
    @Override public String expectedOriginalUrlContains() { return URL; }

    @Override public StreamType expectedStreamType() { return StreamType.LIVE_STREAM; }
    @Override public String expectedUploaderName() { return "Lofi Girl"; }
    @Override public String expectedUploaderUrl() { return "https://www.youtube.com/channel/UCSJ4gkVC6NrvII8umztf0Ow"; }
    @Override public List<String> expectedDescriptionContains() {
        return Arrays.asList("Lofi Girl merch",
                "Thank you for listening, I hope you will have a good time here");
    }
    @Override public boolean expectedUploaderVerified() { return true; }
    @Override public long expectedLength() { return 0; }
    @Override public long expectedTimestamp() { return TIMESTAMP; }
    @Override public long expectedViewCountAtLeast() { return 0; }
    @Nullable @Override public String expectedUploadDate() { return "2020-02-22 00:00:00.000"; }
    @Nullable @Override public String expectedTextualUploadDate() { return "2020-02-22"; }
    @Override public long expectedLikeCountAtLeast() { return 825000; }
    @Override public long expectedDislikeCountAtLeast() { return 15600; }
    @Override public boolean expectedHasSubtitles() { return false; }
    @Nullable @Override public String expectedDashMpdUrlContains() { return "https://manifest.googlevideo.com/api/manifest/dash/"; }
    @Override public boolean expectedHasFrames() { return false; }
    @Override public String expectedLicence() { return "YouTube licence"; }
    @Override public String expectedCategory() { return "Music"; }
    @Override public List<String> expectedTags() {
        return Arrays.asList("beats to relax", "chilled cow", "chilled cow radio", "chilledcow", "chilledcow radio",
                "chilledcow station", "chillhop", "hip hop", "hiphop", "lo fi", "lo fi hip hop", "lo fi hip hop radio",
                "lo fi hiphop", "lo fi radio", "lo-fi", "lo-fi hip hop", "lo-fi hip hop radio", "lo-fi hiphop",
                "lo-fi radio", "lofi", "lofi hip hop", "lofi hip hop radio", "lofi hiphop", "lofi radio", "music",
                "lofi radio chilledcow", "music to study", "playlist", "radio", "relaxing music", "study music",
                "lofi hip hop radio - beats to relax\\/study to");
    }
}
