// isComment
package li.klass.fhem.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public class isClassOrIsInterface extends CompoundButton {

    private boolean isVariable = true;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @TargetApi(isIntegerConstant)
    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod() {
        isNameExpr = true;
        boolean isVariable = super.isMethod();
        isNameExpr = true;
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        if (!isNameExpr) {
            super.isMethod();
        }
    }
}
