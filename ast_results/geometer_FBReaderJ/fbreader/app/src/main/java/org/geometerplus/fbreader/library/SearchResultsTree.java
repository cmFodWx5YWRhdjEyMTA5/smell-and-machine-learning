// isComment
package org.geometerplus.fbreader.library;

import org.fbreader.util.Pair;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.fbreader.book.*;

public class isClassOrIsInterface extends FilteredTree {

    public final String isVariable;

    private final String isVariable;

    private final ZLResource isVariable;

    isConstructor(RootTree isParameter, String isParameter, String isParameter, int isParameter) {
        super(isNameExpr, new Filter.ByPattern(isNameExpr), isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isMethod().isMethod(isNameExpr);
        isNameExpr = isNameExpr != null ? isNameExpr : "isStringConstant";
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
    protected String isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod("isStringConstant").isMethod().isMethod("isStringConstant", isNameExpr);
    }

    @Override
    protected boolean isMethod(Book isParameter) {
        return isMethod(isNameExpr);
    }
}
