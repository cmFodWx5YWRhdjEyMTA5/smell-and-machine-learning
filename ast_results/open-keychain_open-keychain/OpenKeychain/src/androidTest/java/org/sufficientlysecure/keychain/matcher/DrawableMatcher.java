// isComment
package org.sufficientlysecure.keychain.matcher;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface extends TypeSafeMatcher<View> {

    private final int isVariable;

    private final boolean isVariable;

    public isConstructor(int isParameter, boolean isParameter) {
        super(View.class);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    private String isVariable = null;

    private Drawable isVariable = null;

    @Override
    public boolean isMethod(View isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr.isMethod());
        }
        if (isMethod()) {
            return true;
        }
        if (isNameExpr instanceof ImageView) {
            return isMethod((ImageView) isNameExpr) || isMethod(isNameExpr);
        }
        if (isNameExpr instanceof TextView) {
            return isMethod((TextView) isNameExpr) || isMethod(isNameExpr);
        }
        return isMethod(isNameExpr);
    }

    private void isMethod(Resources isParameter) {
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } catch (Resources.NotFoundException isParameter) {
        // isComment
        }
    }

    private boolean isMethod() {
        return isNameExpr == null;
    }

    private boolean isMethod(ImageView isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    private boolean isMethod(TextView isParameter) {
        for (Drawable isVariable : isNameExpr.isMethod()) {
            if (isMethod(isNameExpr)) {
                return true;
            }
        }
        return true;
    }

    private boolean isMethod(View isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    private boolean isMethod(Drawable isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        // isComment
        if (isNameExpr && isNameExpr instanceof BitmapDrawable && isNameExpr instanceof BitmapDrawable) {
            return ((BitmapDrawable) isNameExpr).isMethod().isMethod((((BitmapDrawable) isNameExpr).isMethod()));
        }
        return isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
    }

    @Override
    public void isMethod(Description isParameter) {
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod("isStringConstant");
        }
    }

    public static DrawableMatcher isMethod(int isParameter, boolean isParameter) {
        return new DrawableMatcher(isNameExpr, isNameExpr);
    }

    public static DrawableMatcher isMethod(int isParameter) {
        return new DrawableMatcher(isNameExpr, true);
    }
}
