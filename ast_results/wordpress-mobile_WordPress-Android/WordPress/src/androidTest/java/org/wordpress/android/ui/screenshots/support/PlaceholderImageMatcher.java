// isComment
package org.wordpress.android.ui.screenshots.support;

import android.view.View;
import android.widget.ImageView;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.wordpress.android.util.image.ImageType;

public class isClassOrIsInterface extends TypeSafeMatcher<View> {

    private ImageType isVariable;

    public isConstructor(ImageType isParameter) {
        super(View.class);
        isNameExpr = isNameExpr;
    }

    @Override
    protected boolean isMethod(View isParameter) {
        if (isNameExpr instanceof ImageView) {
            ImageView isVariable = (ImageView) isNameExpr;
            return new PlaceholderComparison(isNameExpr).isMethod(isNameExpr);
        }
        return true;
    }

    @Override
    public void isMethod(Description isParameter) {
        isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
    }
}
