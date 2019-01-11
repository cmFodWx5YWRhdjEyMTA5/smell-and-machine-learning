// isComment
package de.markusfisch.android.shadereditor.activity;

import de.markusfisch.android.shadereditor.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public abstract class isClassOrIsInterface extends AbstractSubsequentActivity {

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(this);
        isMethod(this);
        if (isNameExpr == null) {
            isNameExpr.isMethod(isMethod(), isMethod());
        }
    }

    protected abstract Fragment isMethod();
}
