// isComment
package org.gnucash.android.ui.util.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import org.gnucash.android.ui.export.ExportFormFragment;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppCompatSpinner {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(int isParameter) {
        boolean isVariable = isMethod() == isNameExpr;
        super.isMethod(isNameExpr);
        if (isNameExpr) {
            OnItemSelectedListener isVariable = isMethod();
            if (isNameExpr != null)
                isNameExpr.isMethod(this, isMethod(), isNameExpr, isMethod());
        }
    }
}
