// isComment
package io.github.hidroh.materialistic.test;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import io.github.hidroh.materialistic.InjectableActivity;
import io.github.hidroh.materialistic.R;

public class isClassOrIsInterface extends InjectableActivity {

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod((Toolbar) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }
}
