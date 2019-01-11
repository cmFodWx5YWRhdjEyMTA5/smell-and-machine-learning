// isComment
package com.app.missednotificationsreminder.ui.fragment;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.missednotificationsreminder.binding.model.VibrationViewModel;
import com.app.missednotificationsreminder.databinding.VibrationViewBinding;
import com.app.missednotificationsreminder.ui.fragment.common.CommonFragmentWithViewModel;
import com.app.missednotificationsreminder.ui.view.VibrationView;
import javax.inject.Inject;

/**
 * isComment
 */
public class isClassOrIsInterface extends CommonFragmentWithViewModel<VibrationViewModel> implements VibrationView {

    @Inject
    VibrationViewModel isVariable;

    @Inject
    Vibrator isVariable;

    VibrationViewBinding isVariable;

    @Override
    public VibrationViewModel isMethod() {
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
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant);
    }
}
