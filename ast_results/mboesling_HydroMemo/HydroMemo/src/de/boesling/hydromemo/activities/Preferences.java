// isComment
package de.boesling.hydromemo.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;
import de.boesling.hydromemo.R;
import de.boesling.hydromemo.services.Scheduler;

public class isClassOrIsInterface extends PreferenceActivity implements OnSharedPreferenceChangeListener {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        return super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(new Intent(this, About.class));
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(new Intent(this, Help.class));
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        new PreferencesHelper(this).isMethod().isMethod(this);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        new PreferencesHelper(this).isMethod().isMethod(this);
        isMethod(new Intent(this, Scheduler.class));
    }

    @Override
    public void isMethod(SharedPreferences isParameter, String isParameter) {
        isMethod(new Intent(this, Scheduler.class));
    }
}
