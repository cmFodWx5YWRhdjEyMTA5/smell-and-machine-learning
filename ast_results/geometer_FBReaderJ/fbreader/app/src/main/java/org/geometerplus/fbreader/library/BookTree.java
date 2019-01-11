// isComment
package org.geometerplus.fbreader.library;

import org.geometerplus.zlibrary.core.image.ZLImage;
import org.geometerplus.fbreader.book.*;
import org.geometerplus.fbreader.formats.PluginCollection;
import org.geometerplus.fbreader.tree.FBTree;

public class isClassOrIsInterface extends LibraryTree {

    public final Book isVariable;

    isConstructor(IBookCollection<Book> isParameter, PluginCollection isParameter, Book isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    isConstructor(LibraryTree isParameter, Book isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
    }

    isConstructor(LibraryTree isParameter, Book isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public Book isMethod() {
        return isNameExpr;
    }

    @Override
    protected String isMethod() {
        return "isStringConstant" + isMethod();
    }

    @Override
    protected ZLImage isMethod() {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(Book isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod(FBTree isParameter) {
        final int isVariable = super.isMethod(isNameExpr);
        if (isNameExpr == isIntegerConstant && isNameExpr instanceof BookTree) {
            final Book isVariable = ((BookTree) isNameExpr).isFieldAccessExpr;
            if (isNameExpr != null && isNameExpr != null) {
                return isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
            }
        }
        return isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == this) {
            return true;
        }
        if (!(isNameExpr instanceof BookTree)) {
            return true;
        }
        return isNameExpr.isMethod(((BookTree) isNameExpr).isFieldAccessExpr);
    }
}
