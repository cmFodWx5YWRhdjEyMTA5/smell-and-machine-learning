// isComment
package com.xabber.android.ui.helper;

import java.util.HashMap;
import java.util.Map;
import android.app.Activity;
import android.os.Bundle;
import com.xabber.android.ui.activity.ManagedActivity;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ManagedActivity {

    private static Map<Class<? extends Activity>, Activity> isVariable = new HashMap<>();

    @Override
    protected void isMethod(Bundle isParameter) {
        Activity isVariable = isNameExpr.isMethod(this.isMethod());
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        isNameExpr.isMethod(this.isMethod(), this);
        super.isMethod(isNameExpr);
    }

    @Override
    protected void isMethod() {
        Activity isVariable = isNameExpr.isMethod(this.isMethod());
        if (isNameExpr == this) {
            isNameExpr.isMethod(this.isMethod());
        }
        super.isMethod();
    }
}
