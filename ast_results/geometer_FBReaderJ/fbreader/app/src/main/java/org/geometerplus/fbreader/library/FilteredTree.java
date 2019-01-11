// isComment
package org.geometerplus.fbreader.library;

import java.util.List;
import org.geometerplus.zlibrary.core.util.MiscUtil;
import org.geometerplus.fbreader.book.*;
import org.geometerplus.fbreader.formats.PluginCollection;

abstract class isClassOrIsInterface extends LibraryTree {

    private final Filter isVariable;

    isConstructor(IBookCollection isParameter, PluginCollection isParameter, Filter isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    isConstructor(LibraryTree isParameter, Filter isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isMethod(new BookQuery(isNameExpr, isIntegerConstant)), "isStringConstant");
    }

    @Override
    public boolean isMethod(Book isParameter) {
        return isNameExpr != null && isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Status isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    protected final void isMethod() {
        for (BookQuery isVariable = new BookQuery(isNameExpr, isIntegerConstant); ; isNameExpr = isNameExpr.isMethod()) {
            final List<Book> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod()) {
                break;
            }
            for (Book isVariable : isNameExpr) {
                isMethod(isNameExpr);
            }
        }
    }

    @Override
    public void isMethod() {
        isMethod();
        isMethod();
    }

    @Override
    public boolean isMethod(BookEvent isParameter, Book isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return isMethod(isNameExpr) && isMethod(isNameExpr);
            case isNameExpr:
                {
                    boolean isVariable = isMethod(isNameExpr);
                    isNameExpr |= isMethod(isNameExpr) && isMethod(isNameExpr);
                    return isNameExpr;
                }
            case isNameExpr:
            default:
                return super.isMethod(isNameExpr, isNameExpr);
        }
    }

    protected abstract boolean isMethod(Book isParameter);
}
