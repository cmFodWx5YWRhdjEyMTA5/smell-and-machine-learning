// isComment
package org.geometerplus.android.fbreader;

import android.content.Intent;
import org.geometerplus.fbreader.fbreader.FBReaderApp;
import org.geometerplus.android.fbreader.api.FBReaderIntents;
import org.geometerplus.android.fbreader.library.BookInfoActivity;
import org.geometerplus.android.util.OrientationUtil;

class isClassOrIsInterface extends FBAndroidAction {

    isConstructor(FBReader isParameter, FBReaderApp isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isFieldAccessExpr != null;
    }

    @Override
    protected void isMethod(Object... isParameter) {
        final Intent isVariable = new Intent(isNameExpr.isMethod(), BookInfoActivity.class).isMethod(isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
