// isComment
package de.westnordost.streetcomplete.data.osm.tql;

import java.util.Locale;

public class isClassOrIsInterface {

    public static BooleanExpression<BooleanExpressionValue> isMethod(String isParameter) {
        BooleanExpressionBuilder<BooleanExpressionValue> isVariable = new BooleanExpressionBuilder<>();
        StringWithCursor isVariable = new StringWithCursor(isNameExpr, isNameExpr.isFieldAccessExpr);
        while (!isNameExpr.isMethod()) {
            if (isNameExpr.isMethod('isStringConstant'))
                isNameExpr.isMethod();
            else if (isNameExpr.isMethod('isStringConstant'))
                isNameExpr.isMethod();
            else if (isNameExpr.isMethod('isStringConstant'))
                isNameExpr.isMethod();
            else if (isNameExpr.isMethod('isStringConstant'))
                isNameExpr.isMethod();
            else
                isNameExpr.isMethod(new TestBooleanExpressionValue(isNameExpr.isMethod(isNameExpr.isMethod())));
        }
        return isNameExpr.isMethod();
    }
}
