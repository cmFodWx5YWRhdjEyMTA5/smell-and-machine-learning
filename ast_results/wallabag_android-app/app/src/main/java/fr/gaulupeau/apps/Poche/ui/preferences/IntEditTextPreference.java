// isComment
package fr.gaulupeau.apps.Poche.ui.preferences;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends EditTextPreference {

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    protected boolean isMethod(String isParameter) {
        return isNameExpr != null && isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    protected String isMethod(String isParameter) {
        if (!isMethod() || !isMethod().isMethod(isMethod())) {
            return isNameExpr;
        }
        return isNameExpr.isMethod(isMethod().isMethod(isMethod(), isIntegerConstant));
    }
}
