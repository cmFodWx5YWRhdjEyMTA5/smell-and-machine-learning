// isComment
package uk.org.ngo.squeezer.dialog;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import uk.org.ngo.squeezer.R;

public class isClassOrIsInterface extends DialogPreference {

    private ServerAddressView isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected View isMethod() {
        View isVariable = super.isMethod();
        isNameExpr = (ServerAddressView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    @Override
    protected void isMethod(boolean isParameter) {
        if (isNameExpr) {
            isNameExpr.isMethod();
        }
        isNameExpr.isMethod();
    }
}
