// isComment
package btools.expressions;

public final class isClassOrIsInterface extends BExpressionContext {

    private static String[] isVariable = { "isStringConstant" };

    protected String[] isMethod() {
        return isNameExpr;
    }

    public float isMethod() {
        return isMethod(isIntegerConstant);
    }

    public isConstructor(BExpressionMetaData isParameter) {
        super("isStringConstant", isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(int isParameter, BExpressionMetaData isParameter) {
        super("isStringConstant", isNameExpr, isNameExpr);
    }
}
