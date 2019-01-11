// isComment
package info.guardianproject.browser;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends Preference {

    private String isVariable = null;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }
}
