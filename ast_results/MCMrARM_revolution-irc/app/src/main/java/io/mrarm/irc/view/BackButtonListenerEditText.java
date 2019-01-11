// isComment
package io.mrarm.irc.view;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class isClassOrIsInterface extends AppCompatEditText {

    private BackButtonListener isVariable;

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
    public boolean isMethod(int isParameter, KeyEvent isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            if (isNameExpr != null)
                isNameExpr.isMethod();
            return true;
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    public void isMethod(BackButtonListener isParameter) {
        isNameExpr = isNameExpr;
    }

    public interface isClassOrIsInterface {

        void isMethod();
    }
}
