// isComment
package org.geometerplus.android.fbreader;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import org.geometerplus.fbreader.fbreader.FBReaderApp;
import org.geometerplus.android.fbreader.api.FBReaderIntents;
import org.geometerplus.android.fbreader.bookmark.BookmarksActivity;
import org.geometerplus.android.util.OrientationUtil;
import org.geometerplus.android.util.PackageUtil;

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
        final Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        final Intent isVariable = new Intent(isNameExpr.isMethod(), BookmarksActivity.class);
        if (isNameExpr.isMethod(isNameExpr, isNameExpr, true)) {
            try {
                isMethod(isNameExpr);
            } catch (ActivityNotFoundException isParameter) {
                isMethod(isNameExpr);
            }
        } else {
            isMethod(isNameExpr);
        }
    }

    private void isMethod(Intent isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant, true));
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
