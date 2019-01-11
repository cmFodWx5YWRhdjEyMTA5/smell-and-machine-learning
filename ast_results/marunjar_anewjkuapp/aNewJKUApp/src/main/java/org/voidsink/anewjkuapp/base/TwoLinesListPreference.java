// isComment
package org.voidsink.anewjkuapp.base;

import android.content.Context;
import android.support.v7.preference.ListPreference;
import android.util.AttributeSet;

public class isClassOrIsInterface extends ListPreference {

    private CharSequence[] isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public CharSequence[] isMethod() {
        return isNameExpr;
    }

    public void isMethod(CharSequence[] isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
