// isComment
package org.servDroid.ui.activity;

import org.servDroid.helper.IPreferenceHelper;
import org.servDroid.helper.IStoreHelper;
import org.servDroid.helper.PreferenceUiHelper;
import org.servDroid.module.AppModule;
import org.servDroid.web.R;
import com.actionbarsherlock.view.MenuItem;
import com.github.rtyley.android.sherlock.roboguice.activity.RoboSherlockPreferenceActivity;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import android.content.Intent;
import android.os.Bundle;

public class isClassOrIsInterface extends RoboSherlockPreferenceActivity {

    @Inject
    private IPreferenceHelper isVariable;

    @Inject
    IStoreHelper isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    protected String isVariable;

    @SuppressWarnings("isStringConstant")
    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod().isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Runnable isVariable = new Runnable() {

            @Override
            public void isMethod() {
                // isComment
                // isComment
                Intent isVariable = isMethod();
                isMethod(isIntegerConstant, isIntegerConstant);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isMethod();
                isMethod(isIntegerConstant, isIntegerConstant);
                isMethod(isNameExpr);
            }
        };
        new PreferenceUiHelper(isMethod(), this, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
            default:
                break;
        }
        return super.isMethod(isNameExpr);
    }
}
