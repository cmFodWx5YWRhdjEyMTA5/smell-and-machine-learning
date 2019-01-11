// isComment
package net.pejici.easydice.view;

import java.util.Observable;
import java.util.Observer;
import net.pejici.easydice.R;
import net.pejici.easydice.model.DieHand;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class isClassOrIsInterface extends TextView implements Observer {

    private DieHand isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod(DieHand isParameter) {
        if (null != this.isFieldAccessExpr) {
            this.isFieldAccessExpr.isMethod(this);
        }
        this.isFieldAccessExpr = isNameExpr;
        if (null != isNameExpr) {
            this.isFieldAccessExpr.isMethod(this);
        }
        isMethod();
    }

    private void isMethod() {
        if (null != isNameExpr && !isNameExpr.isMethod().isMethod()) {
            int isVariable = isNameExpr.isMethod();
            String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            isMethod(isNameExpr);
        } else if (null != isNameExpr) {
            isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } else {
            isMethod("isStringConstant");
        }
    }

    @Override
    public void isMethod(Observable isParameter, Object isParameter) {
        isMethod();
    }
}
