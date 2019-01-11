// isComment
package com.anysoftkeyboard.canary;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;

public class isClassOrIsInterface extends AnyApplication {

    @Override
    public List<Drawable> isMethod() {
        List<Drawable> isVariable = super.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        return isNameExpr;
    }
}
