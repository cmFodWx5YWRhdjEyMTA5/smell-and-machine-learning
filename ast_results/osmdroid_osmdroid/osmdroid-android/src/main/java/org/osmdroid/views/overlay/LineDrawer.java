// isComment
package org.osmdroid.views.overlay;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.osmdroid.util.LineBuilder;

public class isClassOrIsInterface extends LineBuilder {

    private Canvas isVariable;

    private Paint isVariable;

    public isConstructor(int isParameter) {
        super(isNameExpr);
    }

    public void isMethod(final Canvas isParameter) {
        isNameExpr = isNameExpr;
    }

    public void isMethod(final Paint isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod() {
        if (isMethod() >= isIntegerConstant) {
            isNameExpr.isMethod(isMethod(), isIntegerConstant, isMethod(), isNameExpr);
        }
    }
}
