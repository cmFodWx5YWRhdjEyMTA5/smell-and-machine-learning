// isComment
package org.osmdroid.util;

import junit.framework.Assert;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new PointL(isIntegerConstant, isIntegerConstant));
        isMethod(new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new PointL(isIntegerConstant, isIntegerConstant));
        isMethod(new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), null);
        isMethod(new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new PointL(isIntegerConstant, isIntegerConstant));
        isMethod(new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), null);
        isMethod(new RectL(isIntegerConstant, isIntegerConstant, isIntegerConstant << isIntegerConstant, isIntegerConstant << isIntegerConstant), new RectL(isIntegerConstant, isIntegerConstant << isIntegerConstant, isIntegerConstant << isIntegerConstant, isIntegerConstant << isIntegerConstant), new PointL(isIntegerConstant << isIntegerConstant, isIntegerConstant << isIntegerConstant));
        isMethod(new RectL(-isIntegerConstant, isIntegerConstant, -isIntegerConstant, isIntegerConstant), new RectL(-isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), new PointL(-isIntegerConstant, isIntegerConstant));
    }

    private void isMethod(final RectL isParameter, final RectL isParameter, final PointL isParameter) {
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    private void isMethod(final RectL isParameter, final RectL isParameter, final PointL isParameter) {
        final PointL isVariable = new PointL();
        final boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        }
    }
}
