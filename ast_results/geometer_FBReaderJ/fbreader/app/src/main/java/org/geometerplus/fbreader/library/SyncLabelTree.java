// isComment
package org.geometerplus.fbreader.library;

import org.fbreader.util.Pair;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.fbreader.book.Book;
import org.geometerplus.fbreader.book.Filter;

public class isClassOrIsInterface extends FilteredTree {

    public final String isVariable;

    private final ZLResource isVariable;

    isConstructor(SyncTree isParameter, String isParameter, Filter isParameter, ZLResource isParameter) {
        super(isNameExpr, isNameExpr, -isIntegerConstant);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
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
        return "isStringConstant" + isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Status isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected boolean isMethod(Book isParameter) {
        return isMethod(isNameExpr);
    }
}
