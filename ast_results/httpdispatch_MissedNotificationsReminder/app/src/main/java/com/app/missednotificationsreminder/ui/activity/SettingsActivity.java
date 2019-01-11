// isComment
package com.app.missednotificationsreminder.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import com.app.missednotificationsreminder.R;
import com.app.missednotificationsreminder.databinding.SettingsActivityBinding;
import com.app.missednotificationsreminder.ui.activity.common.CommonFragmentActivity;
import com.app.missednotificationsreminder.ui.fragment.ReminderFragment;
import com.app.missednotificationsreminder.ui.fragment.SchedulerFragment;
import com.app.missednotificationsreminder.ui.fragment.SettingsFragment;
import com.app.missednotificationsreminder.ui.fragment.SoundFragment;
import com.app.missednotificationsreminder.ui.fragment.VibrationFragment;
import dagger.ObjectGraph;

/**
 * isComment
 */
public class isClassOrIsInterface extends CommonFragmentActivity {

    /**
     * isComment
     */
    private SettingsActivityBinding isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        LayoutInflater isVariable = isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr, isMethod(), true);
        // isComment
        isMethod((Toolbar) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Override
    protected ObjectGraph isMethod(ObjectGraph isParameter) {
        return super.isMethod(isNameExpr).isMethod(new SettingsActivityModule(this));
    }

    /**
     * isComment
     */
    public static Intent isMethod(Context isParameter) {
        return new Intent(isNameExpr, SettingsActivity.class);
    }

    /**
     * isComment
     */
    public SettingsFragment isMethod() {
        return (SettingsFragment) isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public ReminderFragment isMethod() {
        return (ReminderFragment) isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public SchedulerFragment isMethod() {
        return (SchedulerFragment) isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public SoundFragment isMethod() {
        return (SoundFragment) isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public VibrationFragment isMethod() {
        return (VibrationFragment) isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
