// isComment
package org.geometerplus.fbreader.network.rss;

import java.util.HashSet;
import org.geometerplus.zlibrary.core.network.ZLNetworkException;
import org.geometerplus.zlibrary.core.network.ZLNetworkRequest;
import org.geometerplus.zlibrary.core.util.MimeType;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.tree.NetworkItemsLoader;
import org.geometerplus.fbreader.network.urlInfo.UrlInfoCollection;

public class isClassOrIsInterface extends NetworkURLCatalogItem {

    static class isClassOrIsInterface extends NetworkOperationData {

        public String isVariable;

        public final HashSet<String> isVariable = new HashSet<String>();

        public isConstructor(RSSNetworkLink isParameter, NetworkItemsLoader isParameter) {
            super(isNameExpr, isNameExpr);
        }
    }

    private State isVariable;

    protected isConstructor(INetworkLink isParameter, CharSequence isParameter, CharSequence isParameter, UrlInfoCollection<?> isParameter, Accessibility isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(NetworkItemsLoader isParameter) throws ZLNetworkException {
        final RSSNetworkLink isVariable = (RSSNetworkLink) isNameExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(), isNameExpr));
    }

    private void isMethod(ZLNetworkRequest isParameter) throws ZLNetworkException {
        try {
            super.isMethod(isNameExpr, isNameExpr);
        } catch (ZLNetworkException isParameter) {
            isNameExpr = null;
            throw isNameExpr;
        }
    }
}
