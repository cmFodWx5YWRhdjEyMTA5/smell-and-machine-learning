// isComment
package org.geometerplus.fbreader.library;

import org.fbreader.util.Pair;
import org.geometerplus.zlibrary.core.resources.ZLResource;

abstract class isClassOrIsInterface extends LibraryTree {

    private final String isVariable;

    private final ZLResource isVariable;

    isConstructor(RootTree isParameter, int isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isMethod().isMethod(isNameExpr);
    }

    isConstructor(RootTree isParameter, String isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isMethod().isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public Pair<String, String> isMethod() {
        return new Pair(isMethod(), null);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod("isStringConstant").isMethod();
    }

    @Override
    protected String isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }
}
