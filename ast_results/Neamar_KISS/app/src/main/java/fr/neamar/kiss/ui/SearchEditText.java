// isComment
package fr.neamar.kiss.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

public class isClassOrIsInterface extends EditText {

    private OnEditorActionListener isVariable;

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
    public void isMethod(OnEditorActionListener isParameter) {
        isNameExpr = isNameExpr;
        super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(int isParameter, KeyEvent isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr)
            if (isNameExpr != null && isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr))
                return true;
        return super.isMethod(isNameExpr, isNameExpr);
    }
}
