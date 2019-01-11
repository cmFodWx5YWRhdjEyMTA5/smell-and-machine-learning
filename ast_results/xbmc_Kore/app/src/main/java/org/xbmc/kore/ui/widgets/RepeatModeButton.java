// isComment
package org.xbmc.kore.ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import org.xbmc.kore.R;

public class isClassOrIsInterface extends HighlightButton {

    public enum MODE {

        OFF, ONE, ALL
    }

    private MODE isVariable;

    private static TypedArray isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    public void isMethod(MODE isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        switch(isNameExpr) {
            case isNameExpr:
                isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isMethod(true);
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isMethod(true);
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isMethod(true);
                break;
        }
    }

    public MODE isMethod() {
        return isNameExpr;
    }

    private void isMethod(Context isParameter) {
        isNameExpr = isNameExpr.isMethod().isMethod(new int[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr });
    }
}
