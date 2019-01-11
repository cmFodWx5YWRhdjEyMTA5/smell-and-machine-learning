// isComment
package org.toulibre.capitoledulibre.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.TwoStatePreference;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private static final TwoStatePreferenceCompatImpl isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr ? new TwoStatePreferenceCompatICS() : new TwoStatePreferenceCompatBase();

    public static boolean isMethod(Preference isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    interface isClassOrIsInterface {

        boolean isMethod(Preference isParameter);
    }

    static class isClassOrIsInterface implements TwoStatePreferenceCompatImpl {

        @Override
        public boolean isMethod(Preference isParameter) {
            return (isNameExpr instanceof CheckBoxPreference) && ((CheckBoxPreference) isNameExpr).isMethod();
        }
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    static class isClassOrIsInterface implements TwoStatePreferenceCompatImpl {

        @Override
        public boolean isMethod(Preference isParameter) {
            return (isNameExpr instanceof TwoStatePreference) && ((TwoStatePreference) isNameExpr).isMethod();
        }
    }
}
