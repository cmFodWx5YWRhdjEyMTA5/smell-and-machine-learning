// isComment
package org.geometerplus.fbreader.network.tree;

import org.fbreader.util.Pair;
import org.geometerplus.zlibrary.core.image.ZLImage;
import org.geometerplus.zlibrary.core.network.ZLNetworkContext;
import org.geometerplus.zlibrary.core.util.MimeType;
import org.geometerplus.fbreader.network.*;
import org.geometerplus.fbreader.network.urlInfo.UrlInfo;

public class isClassOrIsInterface extends NetworkCatalogTree {

    public isConstructor(RootTree isParameter, SearchItem isParameter) {
        super(isNameExpr, null, isNameExpr, -isIntegerConstant);
        isNameExpr.isMethod(null);
    }

    public isConstructor(NetworkCatalogTree isParameter, SearchItem isParameter) {
        super(isNameExpr, isNameExpr.isMethod(), isNameExpr, -isIntegerConstant);
        isNameExpr.isMethod(null);
    }

    public void isMethod(String isParameter) {
        ((SearchItem) isNameExpr).isMethod(isNameExpr);
    }

    @Override
    protected boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public String isMethod() {
        final String isVariable = ((SearchItem) isNameExpr).isMethod();
        if (isNameExpr != null && isNameExpr.isMethod(this) == null) {
            return isNameExpr.isMethod().isMethod("isStringConstant").isMethod();
        }
        return super.isMethod();
    }

    @Override
    public Pair<String, String> isMethod() {
        return new Pair(isMethod(), null);
    }

    @Override
    public String isMethod() {
        final String isVariable = ((SearchItem) isNameExpr).isMethod();
        if (isNameExpr != null) {
            return isNameExpr.isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod().isMethod("isStringConstant", isNameExpr);
        }
        if (isNameExpr.isMethod(this) != null) {
            return isNameExpr.isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod();
        }
        return super.isMethod();
    }

    public MimeType isMethod() {
        return ((SearchItem) isNameExpr).isMethod();
    }

    public String isMethod(String isParameter) {
        return ((SearchItem) isNameExpr).isMethod(isNameExpr);
    }

    public void isMethod(ZLNetworkContext isParameter, String isParameter) {
        new Searcher(isNameExpr, this, isNameExpr).isMethod();
    }

    @Override
    public ZLImage isMethod() {
        final INetworkLink isVariable = isMethod();
        if (isNameExpr == null) {
            return null;
        }
        final UrlInfo isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr != null ? isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr) : null;
    }
}
