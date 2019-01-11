// isComment
package org.bitcoinj.core;

import javax.annotation.Nullable;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends Message {

    @Nullable
    protected Message isVariable;

    /**
     * isComment
     */
    @Deprecated
    protected isConstructor() {
    }

    public isConstructor(NetworkParameters isParameter) {
        super(isNameExpr);
    }

    public isConstructor(NetworkParameters isParameter, byte[] isParameter, int isParameter, int isParameter) throws ProtocolException {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(NetworkParameters isParameter, byte[] isParameter, int isParameter, int isParameter, Message isParameter, MessageSerializer isParameter, int isParameter) throws ProtocolException {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(NetworkParameters isParameter, byte[] isParameter, int isParameter) throws ProtocolException {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(NetworkParameters isParameter, byte[] isParameter, int isParameter, @Nullable Message isParameter, MessageSerializer isParameter, int isParameter) throws ProtocolException {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public final void isMethod(@Nullable Message isParameter) {
        if (this.isFieldAccessExpr != null && this.isFieldAccessExpr != isNameExpr && isNameExpr != null) {
            // isComment
            // isComment
            // isComment
            this.isFieldAccessExpr.isMethod();
        }
        this.isFieldAccessExpr = isNameExpr;
    }

    /*isComment*/
    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null)
            isNameExpr.isMethod();
    }

    protected void isMethod(int isParameter) {
        isMethod(isIntegerConstant, isNameExpr);
    }

    @Override
    protected void isMethod(int isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
