// isComment
package de.boesling.hydromemo.preferences;

import android.content.Context;
import android.preference.ListPreference;
import android.preference.Preference;
import android.util.AttributeSet;

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
        isMethod(new OnPreferenceChangeListener() {

            @Override
            public boolean isMethod(Preference isParameter, Object isParameter) {
                isNameExpr.isMethod(isMethod());
                return true;
            }
        });
    }

    @Override
    public CharSequence isMethod() {
        return super.isMethod();
    }
}
