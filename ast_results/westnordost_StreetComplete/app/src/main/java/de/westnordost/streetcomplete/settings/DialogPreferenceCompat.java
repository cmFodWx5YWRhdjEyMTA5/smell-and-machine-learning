// isComment
package de.westnordost.streetcomplete.settings;

import android.content.Context;
import android.support.v7.preference.DialogPreference;
import android.support.v7.preference.PreferenceDialogFragmentCompat;
import android.util.AttributeSet;

public abstract class isClassOrIsInterface extends DialogPreference {

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public abstract PreferenceDialogFragmentCompat isMethod();
}
