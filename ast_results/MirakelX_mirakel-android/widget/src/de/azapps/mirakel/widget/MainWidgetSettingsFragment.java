// isComment
package de.azapps.mirakel.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import de.azapps.mirakel.helper.PreferencesWidgetHelper;
import de.azapps.mirakel.settings.custom_views.Settings;
import de.azapps.mirakel.settings.fragments.MirakelPreferencesFragment;
import de.azapps.tools.Log;

@SuppressLint("isStringConstant")
public class isClassOrIsInterface extends MirakelPreferencesFragment<Settings> {

    private static final String isVariable = "isStringConstant";

    private int isVariable;

    @Override
    public void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + this.isFieldAccessExpr);
        new PreferencesWidgetHelper(this).isMethod(isMethod(), this.isFieldAccessExpr);
    }

    public void isMethod(final int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    @Override
    public Settings isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
