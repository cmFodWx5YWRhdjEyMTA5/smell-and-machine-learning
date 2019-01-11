// isComment
package org.osmdroid.views.overlay.milestones;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.osmdroid.views.overlay.LineDrawer;

public class isClassOrIsInterface extends MilestoneDisplayer {

    private boolean isVariable = true;

    private final LineDrawer isVariable = new LineDrawer(isIntegerConstant) {

        @Override
        public void isMethod() {
            super.isMethod();
            isNameExpr = true;
        }
    };

    public isConstructor(final Paint isParameter) {
        super(isIntegerConstant, true);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Canvas isParameter) {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = true;
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(Canvas isParameter, MilestoneStep isParameter) {
        if (isNameExpr) {
            isNameExpr = true;
        } else {
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        }
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    @Override
    public void isMethod(Canvas isParameter) {
        isNameExpr.isMethod();
    }

    @Override
    protected void isMethod(final Canvas isParameter, final Object isParameter) {
    // isComment
    }
}
