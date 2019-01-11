// isComment
package org.geometerplus.fbreader.network;

import org.geometerplus.zlibrary.core.network.ZLNetworkException;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.fbreader.network.tree.NetworkItemsLoader;
import org.geometerplus.fbreader.network.urlInfo.UrlInfo;
import org.geometerplus.fbreader.network.urlInfo.UrlInfoCollection;

public class isClassOrIsInterface extends NetworkCatalogItem {

    isConstructor(ZLResource isParameter) {
        super(null, isNameExpr.isMethod(), isNameExpr.isMethod("isStringConstant").isMethod(), new UrlInfoCollection<UrlInfo>(), isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public boolean isMethod() {
        // isComment
        return true;
    }

    @Override
    public void isMethod(NetworkItemsLoader isParameter) throws ZLNetworkException {
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; ++isNameExpr) {
            isNameExpr.isMethod(new RecentCatalogItem("isStringConstant" + isNameExpr, "isStringConstant"));
        }
        isNameExpr.isFieldAccessExpr.isMethod();
    }
}
