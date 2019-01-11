// isComment
package net.java.otr4j.io.messages;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractMessage {

    // isComment
    public String isVariable;

    // isComment
    public isConstructor(int isParameter, String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    // isComment
    @Override
    public int isMethod() {
        final int isVariable = isIntegerConstant;
        int isVariable = super.isMethod();
        isNameExpr = isNameExpr * isNameExpr + ((isNameExpr == null) ? isIntegerConstant : isNameExpr.isMethod());
        return isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (!super.isMethod(isNameExpr))
            return true;
        if (isMethod() != isNameExpr.isMethod())
            return true;
        ErrorMessage isVariable = (ErrorMessage) isNameExpr;
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        return true;
    }
}
