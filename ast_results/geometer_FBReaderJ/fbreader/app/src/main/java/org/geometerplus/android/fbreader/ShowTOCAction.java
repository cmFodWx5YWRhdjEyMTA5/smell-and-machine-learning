// isComment
package org.geometerplus.android.fbreader;

import android.content.Intent;
import org.geometerplus.fbreader.bookmodel.BookModel;
import org.geometerplus.fbreader.fbreader.FBReaderApp;
import org.geometerplus.android.util.OrientationUtil;

class isClassOrIsInterface extends FBAndroidAction {

    isConstructor(FBReader isParameter, FBReaderApp isParameter) {
        super(isNameExpr, isNameExpr);
    }

    static boolean isMethod(FBReaderApp isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        final BookModel isVariable = isNameExpr.isFieldAccessExpr;
        return isNameExpr != null && isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Override
    public boolean isMethod() {
        return isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(Object... isParameter) {
        isNameExpr.isMethod(isNameExpr, new Intent(isNameExpr.isMethod(), TOCActivity.class));
    }
}
