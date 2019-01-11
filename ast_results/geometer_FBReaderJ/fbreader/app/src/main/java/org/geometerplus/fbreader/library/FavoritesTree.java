// isComment
package org.geometerplus.fbreader.library;

import org.fbreader.util.Pair;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.fbreader.book.*;

public class isClassOrIsInterface extends FilteredTree {

    private final ZLResource isVariable;

    isConstructor(RootTree isParameter) {
        super(isNameExpr, new Filter.ByLabel(isNameExpr.isFieldAccessExpr), -isIntegerConstant);
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

    @Override
    public Status isMethod() {
        return isNameExpr.isMethod(new Filter.ByLabel(isNameExpr.isFieldAccessExpr)) ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod() {
        return isMethod() == isNameExpr.isFieldAccessExpr ? "isStringConstant" : super.isMethod();
    }

    @Override
    protected boolean isMethod(Book isParameter) {
        return isMethod(isNameExpr);
    }
}
