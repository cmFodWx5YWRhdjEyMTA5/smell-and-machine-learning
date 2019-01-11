// isComment
package net.grandcentrix.tray.core;

import junit.framework.TestCase;

/**
 * isComment
 */
public class isClassOrIsInterface extends TestCase {

    public void isMethod() throws Exception {
        final WrongTypeException isVariable = new WrongTypeException();
        isMethod(isNameExpr);
        isMethod(new WrongTypeException(isNameExpr));
        final WrongTypeException isVariable = new WrongTypeException("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
        final WrongTypeException isVariable = new WrongTypeException("isStringConstant", "isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
        final WrongTypeException isVariable = new WrongTypeException("isStringConstant", isNameExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }
}
