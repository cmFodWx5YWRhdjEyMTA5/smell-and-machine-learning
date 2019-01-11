// isComment
package ch.fixme.cowsay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class isClassOrIsInterface extends HorizontalScrollView {

    public TextView isVariable;

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
    public boolean isMethod(MotionEvent isParameter) {
        boolean isVariable = super.isMethod(isNameExpr);
        isNameExpr = isNameExpr | isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }
}
