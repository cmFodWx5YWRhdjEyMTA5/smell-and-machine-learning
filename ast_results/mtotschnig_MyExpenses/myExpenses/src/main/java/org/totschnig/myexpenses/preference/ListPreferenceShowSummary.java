// isComment
package org.totschnig.myexpenses.preference;

import android.content.Context;
import android.support.v7.preference.ListPreference;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends ListPreference {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod();
    }

    private void isMethod() {
        isMethod((isParameter, isParameter) -> {
            isNameExpr.isMethod(isMethod());
            return true;
        });
    }

    @Override
    public CharSequence isMethod() {
        return super.isMethod();
    }
}
