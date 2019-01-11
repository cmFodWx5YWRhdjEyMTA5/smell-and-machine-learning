// isComment
package app.openconnect;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;

public class isClassOrIsInterface extends DialogPreference {

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        this(isNameExpr, null);
    }

    @Override
    protected void isMethod() {
    /*isComment*/
    }

    public void isMethod(String isParameter) {
        if (isNameExpr == null) {
            isNameExpr = "isStringConstant";
        }
        isMethod(isNameExpr);
        isMethod(isMethod());
    }
}
