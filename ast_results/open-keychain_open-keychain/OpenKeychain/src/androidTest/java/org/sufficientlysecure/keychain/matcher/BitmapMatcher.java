// isComment
package org.sufficientlysecure.keychain.matcher;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface extends TypeSafeMatcher<View> {

    private final Bitmap isVariable;

    public isConstructor(Bitmap isParameter) {
        super(View.class);
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(View isParameter) {
        if (!(isNameExpr instanceof ImageView)) {
            return true;
        }
        Drawable isVariable = ((ImageView) isNameExpr).isMethod();
        return isNameExpr != null && (isNameExpr instanceof BitmapDrawable) && ((BitmapDrawable) isNameExpr).isMethod().isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Description isParameter) {
        isNameExpr.isMethod("isStringConstant");
    }

    public static BitmapMatcher isMethod(Bitmap isParameter) {
        return new BitmapMatcher(isNameExpr);
    }
}
