// isComment
package org.geometerplus.fbreader.library;

import java.util.Collections;
import org.geometerplus.fbreader.book.*;
import org.geometerplus.fbreader.formats.PluginCollection;

public class isClassOrIsInterface extends FilteredTree {

    public final Author isVariable;

    isConstructor(IBookCollection isParameter, PluginCollection isParameter, Author isParameter) {
        super(isNameExpr, isNameExpr, new Filter.ByAuthor(isNameExpr));
        isNameExpr = isNameExpr;
    }

    isConstructor(AuthorListTree isParameter, Author isParameter, int isParameter) {
        super(isNameExpr, new Filter.ByAuthor(isNameExpr), isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) ? isMethod().isMethod("isStringConstant").isMethod() : isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected String isMethod() {
        return "isStringConstant" + isMethod();
    }

    @Override
    protected String isMethod() {
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return null;
        }
        return new StringBuilder().isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod();
    }

    private SeriesTree isMethod(Series isParameter) {
        final SeriesTree isVariable = new SeriesTree(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        int isVariable = isNameExpr.isMethod(isMethod(), isNameExpr);
        if (isNameExpr >= isIntegerConstant) {
            return (SeriesTree) isMethod().isMethod(isNameExpr);
        } else {
            return new SeriesTree(this, isNameExpr, isNameExpr, -isNameExpr - isIntegerConstant);
        }
    }

    @Override
    protected boolean isMethod(Book isParameter) {
        final SeriesInfo isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            return isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr);
        }
        final BookTree isVariable = new BookTree(isNameExpr, isNameExpr, isNameExpr);
        int isVariable = isNameExpr.isMethod(isMethod(), isNameExpr);
        if (isNameExpr >= isIntegerConstant) {
            return true;
        } else {
            new BookTree(this, isNameExpr, -isNameExpr - isIntegerConstant);
            return true;
        }
    }
}
