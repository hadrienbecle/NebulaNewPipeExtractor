package org.schabi.newpipe.extractor.services.nebula;

import org.schabi.newpipe.extractor.StreamingService;
import org.schabi.newpipe.extractor.channel.ChannelExtractor;
import org.schabi.newpipe.extractor.comments.CommentsExtractor;
import org.schabi.newpipe.extractor.exceptions.ExtractionException;
import org.schabi.newpipe.extractor.kiosk.KioskList;
import org.schabi.newpipe.extractor.linkhandler.*;
import org.schabi.newpipe.extractor.playlist.PlaylistExtractor;
import org.schabi.newpipe.extractor.search.SearchExtractor;
import org.schabi.newpipe.extractor.stream.StreamExtractor;
import org.schabi.newpipe.extractor.subscription.SubscriptionExtractor;
import org.schabi.newpipe.extractor.suggestion.SuggestionExtractor;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;

import static org.schabi.newpipe.extractor.StreamingService.ServiceInfo.MediaCapability.*;

public class NebulaService extends StreamingService {

    public NebulaService(int id) {
        super(id, "Nebula", Collections.singletonList(VIDEO));
    }

    @Override
    public String getBaseUrl() {
        return "https://nebula.app/";
    }

    @Override
    public LinkHandlerFactory getStreamLHFactory() {
        throw new NotImplementedException();
    }

    @Override
    public ListLinkHandlerFactory getChannelLHFactory() {
        throw new NotImplementedException();
    }

    @Override
    public ListLinkHandlerFactory getPlaylistLHFactory() {
        throw new NotImplementedException();
    }

    @Override
    public SearchQueryHandlerFactory getSearchQHFactory() {
        throw new NotImplementedException();
    }

    @Override
    public ListLinkHandlerFactory getCommentsLHFactory() {
        throw new NotImplementedException();
    }

    @Override
    public SearchExtractor getSearchExtractor(SearchQueryHandler queryHandler) {
        throw new NotImplementedException();
    }

    @Override
    public SuggestionExtractor getSuggestionExtractor() {
        throw new NotImplementedException();
    }

    @Override
    public SubscriptionExtractor getSubscriptionExtractor() {
        throw new NotImplementedException();
    }

    @Override
    public KioskList getKioskList() throws ExtractionException {
        throw new NotImplementedException();
    }

    @Override
    public ChannelExtractor getChannelExtractor(ListLinkHandler linkHandler) throws ExtractionException {
        throw new NotImplementedException();
    }

    @Override
    public PlaylistExtractor getPlaylistExtractor(ListLinkHandler linkHandler) throws ExtractionException {
        throw new NotImplementedException();
    }

    @Override
    public StreamExtractor getStreamExtractor(LinkHandler linkHandler) throws ExtractionException {
        throw new NotImplementedException();
    }

    @Override
    public CommentsExtractor getCommentsExtractor(ListLinkHandler linkHandler) throws ExtractionException {
        throw new NotImplementedException();
    }
}
