// isComment
package org.wordpress.android.editor;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.KeyEvent;

/**
 * isComment
 */
public class isClassOrIsInterface extends AppCompatEditText {

    private OnImeBackListener isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public boolean isMethod(int isParameter, KeyEvent isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            if (this.isFieldAccessExpr != null) {
                this.isFieldAccessExpr.isMethod();
            }
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    public void isMethod(OnImeBackListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
