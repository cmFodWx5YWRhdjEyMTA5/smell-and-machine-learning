// isComment
package de.ub0r.android.websms.rules;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import de.ub0r.android.websms.R;
import de.ub0r.android.websms.WebSMS;

/**
 * isComment
 */
public class isClassOrIsInterface extends PreferenceActivity {

    @Override
    @SuppressWarnings("isStringConstant")
    public final void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr);
        this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public final boolean isMethod(final android.view.MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                // isComment
                Intent isVariable = new Intent(this, WebSMS.class);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                this.isMethod(isNameExpr);
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }
}
