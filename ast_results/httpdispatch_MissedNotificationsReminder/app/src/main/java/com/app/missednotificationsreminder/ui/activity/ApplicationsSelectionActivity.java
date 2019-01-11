// isComment
package com.app.missednotificationsreminder.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.app.missednotificationsreminder.R;
import com.app.missednotificationsreminder.databinding.ApplicationsSelectionActivityBinding;
import com.app.missednotificationsreminder.ui.activity.common.CommonFragmentActivity;
import com.app.missednotificationsreminder.ui.fragment.ApplicationsSelectionFragment;
import dagger.ObjectGraph;

/**
 * isComment
 */
public class isClassOrIsInterface extends CommonFragmentActivity {

    /**
     * isComment
     */
    private ApplicationsSelectionActivityBinding isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        LayoutInflater isVariable = isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr, isMethod(), true);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod().isMethod(true);
        isMethod().isMethod(true);
        isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isMethod());
    }

    @Override
    protected ObjectGraph isMethod(ObjectGraph isParameter) {
        return super.isMethod(isNameExpr).isMethod(new ApplicationsSelectionActivityModule(this));
    }

    /**
     * isComment
     */
    public static Intent isMethod(Context isParameter) {
        return new Intent(isNameExpr, ApplicationsSelectionActivity.class);
    }

    /**
     * isComment
     */
    public ApplicationsSelectionFragment isMethod() {
        return (ApplicationsSelectionFragment) isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
