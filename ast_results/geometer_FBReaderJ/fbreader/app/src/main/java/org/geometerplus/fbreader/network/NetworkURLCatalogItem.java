// isComment
package org.geometerplus.fbreader.network;

import org.geometerplus.fbreader.network.urlInfo.UrlInfo;
import org.geometerplus.fbreader.network.urlInfo.UrlInfoCollection;

public abstract class isClassOrIsInterface extends NetworkCatalogItem {

    /**
     * isComment
     */
    protected isConstructor(INetworkLink isParameter, CharSequence isParameter, CharSequence isParameter, UrlInfoCollection<?> isParameter, Accessibility isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public boolean isMethod() {
        return isMethod() != null;
    }

    @Override
    public String isMethod() {
        String isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr != null ? isNameExpr : isNameExpr.isMethod(isMethod());
    }
}
