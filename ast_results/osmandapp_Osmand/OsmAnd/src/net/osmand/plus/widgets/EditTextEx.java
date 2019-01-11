// isComment
package net.osmand.plus.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;

public class isClassOrIsInterface extends AppCompatEditText {

    private int isVariable = -isIntegerConstant;

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isMethod();
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    private void isMethod() {
        if (isNameExpr > isIntegerConstant) {
            isMethod(new LengthFilter[] { new LengthFilter(isNameExpr) });
        }
    }
}
