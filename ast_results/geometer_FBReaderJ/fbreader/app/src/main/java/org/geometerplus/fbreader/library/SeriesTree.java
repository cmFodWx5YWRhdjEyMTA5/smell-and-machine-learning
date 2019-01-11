// isComment
package org.geometerplus.fbreader.library;

import java.util.Collections;
import org.geometerplus.fbreader.book.*;
import org.geometerplus.fbreader.formats.PluginCollection;

public final class isClassOrIsInterface extends FilteredTree {

    public final Series isVariable;

    private static Filter isMethod(Series isParameter, Author isParameter) {
        final Filter isVariable = new Filter.BySeries(isNameExpr);
        return isNameExpr != null ? new Filter.And(isNameExpr, new Filter.ByAuthor(isNameExpr)) : isNameExpr;
    }

    isConstructor(IBookCollection isParameter, PluginCollection isParameter, Series isParameter, Author isParameter) {
        super(isNameExpr, isNameExpr, isMethod(isNameExpr, isNameExpr));
        isNameExpr = isNameExpr;
    }

    isConstructor(LibraryTree isParameter, Series isParameter, Author isParameter, int isParameter) {
        super(isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected String isMethod() {
        return "isStringConstant" + isMethod();
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected boolean isMethod(Book isParameter) {
        final BookInSeriesTree isVariable = new BookInSeriesTree(isNameExpr, isNameExpr, isNameExpr);
        int isVariable = isNameExpr.isMethod(isMethod(), isNameExpr);
        if (isNameExpr >= isIntegerConstant) {
            return true;
        } else {
            new BookInSeriesTree(this, isNameExpr, -isNameExpr - isIntegerConstant);
            return true;
        }
    }
}
