// isComment
package org.geometerplus.fbreader.library;

import org.geometerplus.fbreader.book.Book;

public class isClassOrIsInterface extends FirstLevelTree {

    isConstructor(RootTree isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public Status isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod() {
        isMethod();
        for (Book isVariable : isNameExpr.isMethod(isIntegerConstant)) {
            new BookWithAuthorsTree(this, isNameExpr);
        }
    }
}
