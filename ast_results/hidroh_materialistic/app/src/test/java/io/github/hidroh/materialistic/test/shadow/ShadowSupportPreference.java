// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.preference.PreferenceManager;
import android.support.v7.preference.Preference;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;

@Implements(Preference.class)
public class isClassOrIsInterface {

    @RealObject
    Preference isVariable;

    private String isVariable;

    @Implementation
    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod().isMethod(isNameExpr.isMethod(), isNameExpr).isMethod();
    }

    public String isMethod() {
        return isNameExpr;
    }
}
