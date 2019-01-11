// isComment
package de.ub0r.android.callmeter.ui.prefs;

import android.content.ContentValues;
import android.content.Context;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import de.ub0r.android.callmeter.R;

/**
 * isComment
 */
public final class isClassOrIsInterface extends CheckBoxPreference {

    /**
     * isComment
     */
    private final ContentValues isVariable;

    /**
     * isComment
     */
    private final UpdateListener isVariable;

    /**
     * isComment
     */
    private final boolean isVariable;

    /**
     * isComment
     */
    public isConstructor(final Context isParameter, final ContentValues isParameter, final String isParameter) {
        super(isNameExpr);
        isMethod(true);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, true);
        if (isNameExpr instanceof UpdateListener) {
            isNameExpr = (UpdateListener) isNameExpr;
        } else {
            isNameExpr = null;
        }
    }

    @Override
    protected View isMethod(final ViewGroup isParameter) {
        View isVariable = super.isMethod(isNameExpr);
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (!this.isFieldAccessExpr) {
            if (isMethod()) {
                super.isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr));
            } else {
                super.isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr));
            }
        }
        isNameExpr.isMethod(isMethod(), isMethod());
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        }
    }

    @Override
    public void isMethod(final boolean isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr) {
            isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr);
        }
    }
}
