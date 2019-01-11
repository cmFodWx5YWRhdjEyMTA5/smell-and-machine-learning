// isComment
package org.geometerplus.fbreader.network;

import org.geometerplus.zlibrary.core.network.*;
import org.geometerplus.zlibrary.core.util.MimeType;
import org.geometerplus.fbreader.network.tree.NetworkItemsLoader;
import org.geometerplus.fbreader.network.urlInfo.UrlInfo;

public class isClassOrIsInterface extends SearchItem {

    public isConstructor(INetworkLink isParameter) {
        super(isNameExpr, isNameExpr.isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod().isMethod("isStringConstant", isNameExpr.isMethod()));
    }

    @Override
    public void isMethod(ZLNetworkContext isParameter, NetworkItemsLoader isParameter, String isParameter) throws ZLNetworkException {
        final NetworkOperationData isVariable = isNameExpr.isMethod(isNameExpr);
        ZLNetworkRequest isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        while (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod()) {
                return;
            }
            isNameExpr = isNameExpr.isMethod();
        }
    }

    @Override
    public MimeType isMethod() {
        final UrlInfo isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr != null ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod(String isParameter) {
        final UrlInfo isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr != null && isNameExpr.isFieldAccessExpr != null ? isNameExpr.isFieldAccessExpr.isMethod("isStringConstant", isNameExpr) : null;
    }
}
