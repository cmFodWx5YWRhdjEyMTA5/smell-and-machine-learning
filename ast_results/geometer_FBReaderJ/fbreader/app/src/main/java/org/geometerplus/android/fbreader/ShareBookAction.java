// isComment
package org.geometerplus.android.fbreader;

import org.geometerplus.fbreader.book.Book;
import org.geometerplus.fbreader.book.BookUtil;
import org.geometerplus.fbreader.fbreader.FBReaderApp;

public class isClassOrIsInterface extends FBAndroidAction {

    isConstructor(FBReader isParameter, FBReaderApp isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod() {
        final Book isVariable = isNameExpr.isMethod();
        return isNameExpr != null && isNameExpr.isMethod(isNameExpr).isMethod() != null;
    }

    @Override
    protected void isMethod(Object... isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
