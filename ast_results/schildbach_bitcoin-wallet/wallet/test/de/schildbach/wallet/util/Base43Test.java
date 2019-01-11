// isComment
package de.schildbach.wallet.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * isComment
 */
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant", isNameExpr.isMethod(new byte[isIntegerConstant]));
        isMethod("isStringConstant", isNameExpr.isMethod(new byte[] { isIntegerConstant }));
        isMethod("isStringConstant", isNameExpr.isMethod(new byte[] { (byte) isIntegerConstant }));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant".isMethod()));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(new byte[isIntegerConstant], isNameExpr.isMethod("isStringConstant"));
        isMethod(new byte[] { isIntegerConstant }, isNameExpr.isMethod("isStringConstant"));
        isMethod(new byte[] { (byte) isIntegerConstant }, isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant".isMethod(), isNameExpr.isMethod("isStringConstant"));
    }
}
