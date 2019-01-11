// isComment
package org.asdtm.fas.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import org.asdtm.fas.model.FilterData;
import org.asdtm.fas.R;
import org.asdtm.fas.fragment.DiscoverFragment;
import org.asdtm.fas.fragment.DiscoverResultFragment;

public class isClassOrIsInterface extends BaseActivity implements DiscoverFragment.OnDiscoverClickListener {

    @Override
    protected void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        FragmentManager isVariable = isMethod();
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            isNameExpr = new DiscoverFragment().isMethod();
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr).isMethod();
        }
    }

    @Override
    public void isMethod(FilterData isParameter) {
        DiscoverResultFragment isVariable = new DiscoverResultFragment().isMethod(isNameExpr);
        FragmentManager isVariable = isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr).isMethod(null).isMethod();
    }
}
