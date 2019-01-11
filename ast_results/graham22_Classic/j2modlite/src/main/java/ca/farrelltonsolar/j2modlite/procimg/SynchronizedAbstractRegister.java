// isComment
/**
 * isComment
 */
package ca.farrelltonsolar.j2modlite.procimg;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements Register {

    /**
     * isComment
     */
    protected byte[] isVariable = new byte[isIntegerConstant];

    public int isMethod() {
        if (isNameExpr == null)
            throw new IllegalAddressException();
        return ((isNameExpr[isIntegerConstant] & isIntegerConstant) << isIntegerConstant | (isNameExpr[isIntegerConstant] & isIntegerConstant));
    }

    public byte[] isMethod() {
        return isNameExpr;
    }

    public final short isMethod() {
        if (isNameExpr == null)
            throw new IllegalAddressException();
        return (short) ((isNameExpr[isIntegerConstant] << isIntegerConstant) | (isNameExpr[isIntegerConstant] & isIntegerConstant));
    }

    public final int isMethod() {
        if (isNameExpr == null)
            throw new IllegalAddressException();
        return ((isNameExpr[isIntegerConstant] & isIntegerConstant) << isIntegerConstant | (isNameExpr[isIntegerConstant] & isIntegerConstant));
    }

    public final synchronized void isMethod(int isParameter) {
        if (isNameExpr == null)
            throw new IllegalAddressException();
        isNameExpr[isIntegerConstant] = (byte) (isIntegerConstant & (isNameExpr >> isIntegerConstant));
        isNameExpr[isIntegerConstant] = (byte) (isIntegerConstant & isNameExpr);
    }

    public final synchronized void isMethod(short isParameter) {
        if (isNameExpr == null)
            throw new IllegalAddressException();
        isNameExpr[isIntegerConstant] = (byte) (isIntegerConstant & (isNameExpr >> isIntegerConstant));
        isNameExpr[isIntegerConstant] = (byte) (isIntegerConstant & isNameExpr);
    }

    public final synchronized void isMethod(byte[] isParameter) {
        if (isNameExpr.isFieldAccessExpr < isIntegerConstant) {
            throw new IllegalArgumentException();
        } else {
            if (isNameExpr == null)
                throw new IllegalAddressException();
            isNameExpr[isIntegerConstant] = isNameExpr[isIntegerConstant];
            isNameExpr[isIntegerConstant] = isNameExpr[isIntegerConstant];
        }
    }
}
