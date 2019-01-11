// isComment
package com.app.missednotificationsreminder.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.missednotificationsreminder.binding.model.ReminderViewModel;
import com.app.missednotificationsreminder.binding.model.SettingsViewModel;
import com.app.missednotificationsreminder.databinding.ReminderViewBinding;
import com.app.missednotificationsreminder.ui.fragment.common.CommonFragmentWithViewModel;
import com.app.missednotificationsreminder.ui.view.ReminderView;
import javax.inject.Inject;

/**
 * isComment
 */
public class isClassOrIsInterface extends CommonFragmentWithViewModel<ReminderViewModel> implements ReminderView {

    @Inject
    ReminderViewModel isVariable;

    @Inject
    SettingsViewModel isVariable;

    ReminderViewBinding isVariable;

    @Override
    public ReminderViewModel isMethod() {
        return isNameExpr;
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod(View isParameter, Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    private void isMethod(View isParameter, Bundle isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
