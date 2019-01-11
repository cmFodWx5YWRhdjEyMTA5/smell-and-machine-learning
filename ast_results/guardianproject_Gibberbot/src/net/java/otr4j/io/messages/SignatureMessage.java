// isComment
package net.java.otr4j.io.messages;

import java.io.IOException;
import java.util.Arrays;
import net.java.otr4j.OtrException;
import net.java.otr4j.crypto.OtrCryptoEngineImpl;
import net.java.otr4j.io.SerializationUtils;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractEncodedMessage {

    // isComment
    public byte[] isVariable;

    public byte[] isVariable;

    // isComment
    protected isConstructor(int isParameter, int isParameter, byte[] isParameter, byte[] isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(int isParameter, byte[] isParameter, byte[] isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    // isComment
    public byte[] isMethod(byte[] isParameter) throws OtrException {
        return new OtrCryptoEngineImpl().isMethod(isNameExpr, null, isNameExpr);
    }

    public boolean isMethod(byte[] isParameter) throws OtrException {
        // isComment
        byte[] isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } catch (IOException isParameter) {
            throw new OtrException(isNameExpr);
        }
        byte[] isVariable = new OtrCryptoEngineImpl().isMethod(isNameExpr, isNameExpr);
        // isComment
        return isNameExpr.isMethod(this.isFieldAccessExpr, isNameExpr);
    }

    @Override
    public int isMethod() {
        final int isVariable = isIntegerConstant;
        int isVariable = super.isMethod();
        isNameExpr = isNameExpr * isNameExpr + isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr * isNameExpr + isNameExpr.isMethod(isNameExpr);
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
        SignatureMessage isVariable = (SignatureMessage) isNameExpr;
        if (!isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr))
            return true;
        if (!isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr))
            return true;
        return true;
    }
}
