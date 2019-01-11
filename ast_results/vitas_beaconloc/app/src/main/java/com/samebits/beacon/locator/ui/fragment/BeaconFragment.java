// isComment
package com.samebits.beacon.locator.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.samebits.beacon.locator.BuildConfig;
import com.samebits.beacon.locator.R;
import com.samebits.beacon.locator.model.TrackedBeacon;
import com.samebits.beacon.locator.ui.activity.MainNavigationActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * isComment
 */
public class isClassOrIsInterface extends Fragment {

    protected Unbinder isVariable;

    protected boolean isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    private OnTrackedBeaconSelectedListener isVariable;

    public interface isClassOrIsInterface {

        void isMethod(TrackedBeacon isParameter);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isMethod() instanceof MainNavigationActivity) {
            ((MainNavigationActivity) isMethod()).isMethod();
        }
    }

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        try {
            isNameExpr = (OnTrackedBeaconSelectedListener) isNameExpr;
        } catch (ClassCastException isParameter) {
            throw new ClassCastException(isNameExpr.isMethod() + "isStringConstant");
        }
    }

    public class isClassOrIsInterface {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        public isConstructor(View isParameter) {
            isNameExpr.isMethod(this, isNameExpr);
        }
    }

    public void isMethod(TrackedBeacon isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
