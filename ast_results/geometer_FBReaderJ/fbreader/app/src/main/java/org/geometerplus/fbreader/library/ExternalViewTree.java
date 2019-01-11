// isComment
package org.geometerplus.fbreader.library;

import org.geometerplus.zlibrary.core.resources.ZLResource;

public class isClassOrIsInterface extends LibraryTree {

    private final ZLResource isVariable;

    isConstructor(RootTree isParameter) {
        super(isNameExpr);
        isNameExpr = isMethod().isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected String isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod("isStringConstant").isMethod();
    }
}
