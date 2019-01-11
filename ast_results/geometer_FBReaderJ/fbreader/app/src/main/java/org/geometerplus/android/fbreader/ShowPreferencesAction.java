// isComment
package org.geometerplus.android.fbreader;

import android.content.Intent;
import org.geometerplus.fbreader.fbreader.FBReaderApp;
import org.geometerplus.android.fbreader.preferences.PreferenceActivity;
import org.geometerplus.android.util.OrientationUtil;

class isClassOrIsInterface extends FBAndroidAction {

    isConstructor(FBReader isParameter, FBReaderApp isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Object... isParameter) {
        final Intent isVariable = new Intent(isNameExpr.isMethod(), PreferenceActivity.class);
        if (isNameExpr.isFieldAccessExpr == isIntegerConstant && isNameExpr[isIntegerConstant] instanceof String) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, (String) isNameExpr[isIntegerConstant]);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}
