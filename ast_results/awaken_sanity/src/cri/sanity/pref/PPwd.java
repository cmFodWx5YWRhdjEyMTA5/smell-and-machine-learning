// isComment
package cri.sanity.pref;

import android.content.Context;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.util.AttributeSet;
import cri.sanity.*;
import cri.sanity.util.Alert;

public class isClassOrIsInterface extends Preference implements OnPreferenceClickListener {

    private OnPreferenceClickListener isVariable;

    private CharSequence isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod();
        isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod();
        isMethod();
    }

    // isComment
    @Override
    public void isMethod(int isParameter) {
        super.isMethod(isNameExpr = isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public void isMethod(CharSequence isParameter) {
        super.isMethod(isNameExpr = isNameExpr);
    }

    @Override
    public OnPreferenceClickListener isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(OnPreferenceClickListener isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(Preference isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr))
            return true;
        isNameExpr.isMethod(isMethod(), new Alert.Edited() {

            @Override
            public void isMethod(String isParameter) {
                isNameExpr.isMethod(isMethod(), isNameExpr);
                isMethod();
            }
        });
        return true;
    }

    public void isMethod() {
        if (isNameExpr == null)
            isNameExpr = isMethod();
        super.isMethod(isNameExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod(isMethod()) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + 'isStringConstant');
    }

    public String isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    // isComment
    private void isMethod() {
        super.isMethod(this);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
    }
}
