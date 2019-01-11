// isComment
package org.wordpress.android.ui.screenshots.support;

import android.view.View;
import android.widget.ImageView;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface extends TypeSafeMatcher<View> {

    public isConstructor() {
        super(View.class);
    }

    @Override
    protected boolean isMethod(View isParameter) {
        if (isNameExpr instanceof ImageView) {
            ImageView isVariable = (ImageView) isNameExpr;
            return isNameExpr.isMethod() == null;
        }
        return true;
    }

    @Override
    public void isMethod(Description isParameter) {
        isNameExpr.isMethod("isStringConstant");
    }
}
