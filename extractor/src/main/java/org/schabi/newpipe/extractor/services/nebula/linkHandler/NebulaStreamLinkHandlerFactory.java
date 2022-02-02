package org.schabi.newpipe.extractor.services.nebula.linkHandler;

import org.schabi.newpipe.extractor.ServiceList;
import org.schabi.newpipe.extractor.exceptions.ParsingException;
import org.schabi.newpipe.extractor.linkhandler.LinkHandlerFactory;

public class NebulaStreamLinkHandlerFactory extends LinkHandlerFactory {

    private static final String VIDEO_PATH = "videos/";

    @Override
    public String getId(final String url) throws ParsingException {
        return url.split(ServiceList.Nebula.getBaseUrl() + "videos/")[1];
    }

    @Override
    public String getUrl(final String id) {
        return ServiceList.Nebula.getBaseUrl() + "videos/" + id;
    }

    @Override
    public boolean onAcceptUrl(String url) throws ParsingException {
        return false;
    }
}
