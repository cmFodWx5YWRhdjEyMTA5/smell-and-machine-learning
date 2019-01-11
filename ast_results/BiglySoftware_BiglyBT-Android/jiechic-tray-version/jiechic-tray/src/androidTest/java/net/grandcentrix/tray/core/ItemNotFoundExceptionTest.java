// isComment
package net.grandcentrix.tray.core;

import junit.framework.TestCase;

/**
 * isComment
 */
public class isClassOrIsInterface extends TestCase {

    public void isMethod() throws Exception {
        final ItemNotFoundException isVariable = new ItemNotFoundException();
        isMethod(isNameExpr);
        isMethod(new ItemNotFoundException(isNameExpr));
        final ItemNotFoundException isVariable = new ItemNotFoundException("isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
        final ItemNotFoundException isVariable = new ItemNotFoundException("isStringConstant", "isStringConstant");
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
        final ItemNotFoundException isVariable = new ItemNotFoundException("isStringConstant", isNameExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }
}
