// isComment
package uk.co.ashtonbrsc.intentexplode.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

public class isClassOrIsInterface extends EditText {

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(int isParameter, @NonNull KeyEvent isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            // isComment
            return true;
        }
        // isComment
        return super.isMethod(isNameExpr, isNameExpr);
    }
}
