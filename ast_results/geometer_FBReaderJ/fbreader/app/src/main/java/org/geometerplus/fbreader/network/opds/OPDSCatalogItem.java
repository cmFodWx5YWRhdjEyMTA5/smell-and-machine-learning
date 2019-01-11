// isComment
package org.geometerplus.fbreader.network.opds;

import java.util.*;
import org.geometerplus.zlibrary.core.network.ZLNetworkException;
import org.geometerplus.zlibrary.core.network.ZLNetworkRequest;
import org.geometerplus.zlibrary.core.util.MimeType;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.urlInfo.*;
import org.geometerplus.fbreader.network.tree.NetworkItemsLoader;

public class isClassOrIsInterface extends NetworkURLCatalogItem {

    static class isClassOrIsInterface extends NetworkOperationData {

        public String isVariable;

        public final HashSet<String> isVariable = new HashSet<String>();

        public isConstructor(OPDSNetworkLink isParameter, NetworkItemsLoader isParameter) {
            super(isNameExpr, isNameExpr);
        }
    }

    private State isVariable;

    private final Map<String, String> isVariable;

    isConstructor(OPDSNetworkLink isParameter, RelatedUrlInfo isParameter) {
        this(isNameExpr, isNameExpr.isFieldAccessExpr, null, isMethod(isNameExpr.isFieldAccessExpr));
    }

    isConstructor(OPDSNetworkLink isParameter, CharSequence isParameter, CharSequence isParameter, UrlInfoCollection<?> isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, null);
    }

    protected isConstructor(OPDSNetworkLink isParameter, CharSequence isParameter, CharSequence isParameter, UrlInfoCollection<?> isParameter, Accessibility isParameter, int isParameter, Map<String, String> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    private static UrlInfoCollection<UrlInfo> isMethod(String isParameter) {
        final UrlInfoCollection<UrlInfo> isVariable = new UrlInfoCollection<UrlInfo>();
        isNameExpr.isMethod(new UrlInfo(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr));
        return isNameExpr;
    }

    private void isMethod(ZLNetworkRequest isParameter) throws ZLNetworkException {
        try {
            super.isMethod(isNameExpr, isNameExpr);
        } catch (ZLNetworkException isParameter) {
            isNameExpr = null;
            throw isNameExpr;
        }
    }

    @Override
    public final Map<String, String> isMethod() {
        return isNameExpr;
    }

    @Override
    public final void isMethod(NetworkItemsLoader isParameter) throws ZLNetworkException {
        final OPDSNetworkLink isVariable = (OPDSNetworkLink) isNameExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(), isNameExpr));
    }

    @Override
    public final boolean isMethod() {
        return true;
    }

    @Override
    public final boolean isMethod() {
        return isNameExpr != null && isNameExpr.isFieldAccessExpr != null;
    }

    @Override
    public final void isMethod(NetworkItemsLoader isParameter) throws ZLNetworkException {
        if (isMethod()) {
            isNameExpr.isFieldAccessExpr = isNameExpr;
            ZLNetworkRequest isVariable = isNameExpr.isMethod();
            isMethod(isNameExpr);
        }
    }
}
