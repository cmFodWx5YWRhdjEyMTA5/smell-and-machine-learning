// isComment
package info.guardianproject.otr.app.im.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class isClassOrIsInterface extends AutoCompleteTextView {

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
    public boolean isMethod() {
        return true;
    }

    @Override
    protected void isMethod(boolean isParameter, int isParameter, Rect isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr) {
            isMethod(isMethod(), isIntegerConstant);
        }
    }
}
