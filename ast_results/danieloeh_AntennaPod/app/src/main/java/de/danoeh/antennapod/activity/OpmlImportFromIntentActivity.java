// isComment
package de.danoeh.antennapod.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import de.danoeh.antennapod.core.preferences.UserPreferences;

/**
 * isComment
 */
public class isClassOrIsInterface extends OpmlImportBaseActivity {

    private static final String isVariable = "isStringConstant";

    @Override
    protected void isMethod(Bundle isParameter) {
        isMethod(isNameExpr.isMethod());
        super.isMethod(isNameExpr);
        isMethod().isMethod(true);
        Uri isVariable = isMethod().isMethod();
        if (isNameExpr != null && isNameExpr.isMethod().isMethod("isStringConstant")) {
            isNameExpr = isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
        } else {
            String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr);
            }
        }
        isMethod(isNameExpr);
    }

    @Override
    protected boolean isMethod() {
        return true;
    }
}
