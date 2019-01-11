// isComment
package org.geometerplus.fbreader.network.rss;

import org.geometerplus.zlibrary.core.xml.ZLStringMap;
import org.geometerplus.fbreader.network.atom.ATOMFeedHandler;

public abstract class isClassOrIsInterface implements ATOMFeedHandler<RSSChannelMetadata, RSSItem> {

    public RSSChannelMetadata isMethod(ZLStringMap isParameter) {
        return new RSSChannelMetadata(isNameExpr);
    }

    public RSSItem isMethod(ZLStringMap isParameter) {
        return new RSSItem(isNameExpr);
    }

    public RSSLink isMethod(ZLStringMap isParameter) {
        return new RSSLink(isNameExpr);
    }
}
