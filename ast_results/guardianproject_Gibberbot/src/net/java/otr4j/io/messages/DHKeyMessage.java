// isComment
package net.java.otr4j.io.messages;

import javax.crypto.interfaces.DHPublicKey;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractEncodedMessage {

    // isComment
    public DHPublicKey isVariable;

    // isComment
    public isConstructor(int isParameter, DHPublicKey isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    // isComment
    @Override
    public int isMethod() {
        final int isVariable = isIntegerConstant;
        int isVariable = super.isMethod();
        // isComment
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
        DHKeyMessage isVariable = (DHKeyMessage) isNameExpr;
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod()) != isIntegerConstant)
            return true;
        return true;
    }
}
