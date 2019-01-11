// isComment
package de.boesling.hydromemo.preferences;

import android.content.Context;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

public class isClassOrIsInterface extends EditTextPreference {

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
                isNameExpr.isMethod(isNameExpr.isMethod());
                return true;
            }
        });
    }

    @Override
    protected void isMethod(View isParameter, EditText isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public CharSequence isMethod() {
        return isMethod(isMethod().isMethod());
    }
}
