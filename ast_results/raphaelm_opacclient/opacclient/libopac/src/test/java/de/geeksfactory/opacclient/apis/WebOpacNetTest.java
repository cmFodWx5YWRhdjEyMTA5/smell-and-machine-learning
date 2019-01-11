// isComment
package de.geeksfactory.opacclient.apis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        String[] isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr[isIntegerConstant]);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        String[] isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr[isIntegerConstant]);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        String[] isVariable = isNameExpr.isMethod("isStringConstant" + "isStringConstant");
        isMethod("isStringConstant", isNameExpr[isIntegerConstant]);
        isMethod("isStringConstant", isNameExpr[isIntegerConstant]);
    }
}
