// isComment
package org.geometerplus.fbreader.network;

import org.geometerplus.zlibrary.core.network.ZLNetworkContext;
import org.geometerplus.zlibrary.core.network.ZLNetworkException;
import org.geometerplus.zlibrary.core.util.MimeType;
import org.geometerplus.fbreader.network.tree.NetworkItemsLoader;
import org.geometerplus.fbreader.network.urlInfo.*;

public abstract class isClassOrIsInterface extends NetworkCatalogItem {

    private String isVariable;

    protected isConstructor(INetworkLink isParameter, String isParameter) {
        super(isNameExpr, isNameExpr.isMethod().isMethod("isStringConstant").isMethod(), isNameExpr, new UrlInfoCollection<UrlInfo>(), isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr != null;
    }

    @Override
    public void isMethod(NetworkItemsLoader isParameter) throws ZLNetworkException {
    }

    public abstract void isMethod(ZLNetworkContext isParameter, NetworkItemsLoader isParameter, String isParameter) throws ZLNetworkException;

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    public abstract MimeType isMethod();

    public abstract String isMethod(String isParameter);
}
