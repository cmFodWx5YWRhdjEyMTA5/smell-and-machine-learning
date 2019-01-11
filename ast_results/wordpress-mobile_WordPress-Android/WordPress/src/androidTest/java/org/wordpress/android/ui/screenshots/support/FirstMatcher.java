// isComment
package org.wordpress.android.ui.screenshots.support;

import android.view.View;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface extends TypeSafeMatcher<View> {

    private boolean isVariable = true;

    public isConstructor() {
        super(View.class);
    }

    @Override
    protected boolean isMethod(View isParameter) {
        if (isNameExpr) {
            return true;
        }
        isNameExpr = true;
        return true;
    }

    @Override
    public void isMethod(Description isParameter) {
        isNameExpr.isMethod("isStringConstant");
    }
}
