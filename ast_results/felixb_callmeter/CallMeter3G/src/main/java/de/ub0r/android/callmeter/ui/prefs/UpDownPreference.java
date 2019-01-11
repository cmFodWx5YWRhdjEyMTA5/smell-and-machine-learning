// isComment
package de.ub0r.android.callmeter.ui.prefs;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import android.view.View.OnClickListener;
import de.ub0r.android.callmeter.R;

public class isClassOrIsInterface extends Preference implements OnClickListener {

    static interface isClassOrIsInterface {

        void isMethod(Preference isParameter, int isParameter);
    }

    private final OnUpDownClickListener isVariable;

    public isConstructor(final Context isParameter, final OnUpDownClickListener isParameter) {
        super(isNameExpr);
        isMethod(true);
        isNameExpr = isNameExpr;
        if (isNameExpr != null) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    @Override
    protected void isMethod(final View isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(this);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(this);
        }
    }

    @Override
    public void isMethod(final View isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this, -isIntegerConstant);
                return;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this, isIntegerConstant);
                return;
            default:
                if (isMethod() != null) {
                    isMethod().isMethod(this);
                }
                return;
        }
    }
}
