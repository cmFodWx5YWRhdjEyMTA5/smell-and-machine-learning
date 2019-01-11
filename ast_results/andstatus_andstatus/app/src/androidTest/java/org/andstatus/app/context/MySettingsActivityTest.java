// isComment
package org.andstatus.app.context;

import android.preference.Preference;
import android.preference.PreferenceFragment;
import org.andstatus.app.data.DbUtils;
import org.andstatus.app.service.MyServiceManager;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface extends ActivityTest<MySettingsActivity> {

    @Override
    protected Class<MySettingsActivity> isMethod() {
        return MySettingsActivity.class;
    }

    @Test
    public void isMethod() throws InterruptedException {
        final String isVariable = "isStringConstant";
        PreferenceFragment isVariable = (PreferenceFragment) isMethod().isMethod().isMethod(MySettingsFragment.class.isMethod());
        if (isNameExpr != null) {
            Preference isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr != null);
        }
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }
}
