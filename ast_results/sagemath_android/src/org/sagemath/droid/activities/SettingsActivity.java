// isComment
package org.sagemath.droid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import org.sagemath.droid.R;

/**
 * isComment
 */
@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface extends PreferenceActivity {

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Preference isVariable = isMethod("isStringConstant");
        isNameExpr.isMethod(new Preference.OnPreferenceClickListener() {

            @Override
            public boolean isMethod(Preference isParameter) {
                isMethod(new Intent(isNameExpr.this, ManageInsertActivity.class));
                return true;
            }
        });
    }
}
