// isComment
package com.bottleworks.dailymoney.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bottleworks.commons.util.GUIs;
import com.bottleworks.dailymoney.context.ContextsActivity;
import com.bottleworks.dailymoney.core.R;

/**
 * isComment
 */
public class isClassOrIsInterface extends ContextsActivity implements OnClickListener {

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(this);
    }

    @Override
    public void isMethod(View isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod();
        }
    }

    private void isMethod() {
        String isVariable = isMethod().isMethod();
        String isVariable = ((TextView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod();
        if (isNameExpr.isMethod(isNameExpr)) {
            isMethod(isNameExpr);
            isMethod();
        } else {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }
}
