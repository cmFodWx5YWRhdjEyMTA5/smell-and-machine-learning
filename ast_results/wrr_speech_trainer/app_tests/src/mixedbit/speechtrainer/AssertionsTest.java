// isComment
package mixedbit.speechtrainer;

import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    public void isMethod() {
        isNameExpr.isMethod(true);
        try {
            isNameExpr.isMethod(true);
            isMethod();
        } catch (final AssertionError isParameter) {
        // isComment
        }
    }

    public void isMethod() {
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true, "isStringConstant");
        try {
            isNameExpr.isMethod(true);
            isMethod();
        } catch (final IllegalStateException isParameter) {
        // isComment
        }
        try {
            isNameExpr.isMethod(true, "isStringConstant");
            isMethod();
        } catch (final IllegalStateException isParameter) {
        // isComment
        }
    }
}
