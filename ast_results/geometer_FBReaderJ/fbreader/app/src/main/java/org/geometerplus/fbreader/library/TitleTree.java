// isComment
package org.geometerplus.fbreader.library;

import org.geometerplus.fbreader.book.*;
import org.geometerplus.fbreader.formats.PluginCollection;

public final class isClassOrIsInterface extends FilteredTree {

    public final String isVariable;

    isConstructor(IBookCollection isParameter, PluginCollection isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, new Filter.ByTitlePrefix(isNameExpr));
        isNameExpr = isNameExpr;
    }

    isConstructor(LibraryTree isParameter, String isParameter, int isParameter) {
        super(isNameExpr, new Filter.ByTitlePrefix(isNameExpr), isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    protected String isMethod() {
        return "isStringConstant" + isMethod();
    }

    @Override
    protected boolean isMethod(Book isParameter) {
        return isMethod(isNameExpr);
    }
}
