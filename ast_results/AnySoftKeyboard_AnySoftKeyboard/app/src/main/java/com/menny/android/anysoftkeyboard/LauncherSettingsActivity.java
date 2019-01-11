// isComment
package com.menny.android.anysoftkeyboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.anysoftkeyboard.ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.ui.settings.MainSettingsActivity;
import com.anysoftkeyboard.ui.settings.setup.SetupSupport;

/*isComment*/
public class isClassOrIsInterface extends Activity {

    private static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    private boolean isVariable = true;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null)
            isNameExpr = isNameExpr.isMethod(isNameExpr, true);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr) {
            isMethod();
        } else {
            if (isNameExpr.isMethod(isMethod())) {
                isMethod(new Intent(this, MainSettingsActivity.class));
            } else {
                isMethod(new Intent(this, BasicAnyActivity.class));
            }
        }
        isNameExpr = true;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }
}
