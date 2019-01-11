// isComment
package org.wheelmap.android.fragment;

import org.wheelmap.android.model.WheelchairFilterState;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import java.util.HashMap;

public abstract class isClassOrIsInterface extends Fragment implements OnClickListener {

    public static final String isVariable = WheelchairStateFragment.class.isMethod();

    protected HashMap<WheelchairFilterState, RadioButton> isVariable = new HashMap<WheelchairFilterState, RadioButton>();

    protected OnWheelchairState isVariable;

    public interface isClassOrIsInterface {

        public void isMethod(WheelchairFilterState isParameter);
    }

    @Override
    public void isMethod(Activity isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr instanceof OnWheelchairState) {
            isNameExpr = (OnWheelchairState) isNameExpr;
        }
    }

    protected abstract void isMethod();

    protected abstract void isMethod(WheelchairFilterState isParameter);

    protected abstract WheelchairFilterState isMethod();

    @Override
    public void isMethod(View isParameter) {
        isMethod();
        final RadioButton isVariable = (RadioButton) isNameExpr;
        isNameExpr.isMethod(true);
    }

    protected void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isMethod());
        }
    }
}
