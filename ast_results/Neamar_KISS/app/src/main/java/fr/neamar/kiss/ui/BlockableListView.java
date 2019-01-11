// isComment
package fr.neamar.kiss.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

/**
 * isComment
 */
public class isClassOrIsInterface extends ListView {

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

    /**
     * isComment
     */
    public void isMethod() {
        this.isFieldAccessExpr = true;
    }

    /**
     * isComment
     */
    public void isMethod() {
        this.isFieldAccessExpr = true;
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        return this.isFieldAccessExpr || super.isMethod(isNameExpr);
    }
}
