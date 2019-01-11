// isComment
package org.apache.thrift;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    public static final void isMethod(final int isParameter, final byte[] isParameter) {
        isMethod(isNameExpr, isNameExpr, isIntegerConstant);
    }

    /**
     * isComment
     */
    public static final void isMethod(final int isParameter, final byte[] isParameter, int isParameter) {
        isNameExpr[isNameExpr] = (byte) (isIntegerConstant & (isNameExpr >> isIntegerConstant));
        isNameExpr[isNameExpr + isIntegerConstant] = (byte) (isIntegerConstant & (isNameExpr >> isIntegerConstant));
        isNameExpr[isNameExpr + isIntegerConstant] = (byte) (isIntegerConstant & (isNameExpr >> isIntegerConstant));
        isNameExpr[isNameExpr + isIntegerConstant] = (byte) (isIntegerConstant & (isNameExpr));
    }

    /**
     * isComment
     */
    public static final int isMethod(final byte[] isParameter) {
        return isMethod(isNameExpr, isIntegerConstant);
    }

    /**
     * isComment
     */
    public static final int isMethod(final byte[] isParameter, int isParameter) {
        return ((isNameExpr[isNameExpr] & isIntegerConstant) << isIntegerConstant) | ((isNameExpr[isNameExpr + isIntegerConstant] & isIntegerConstant) << isIntegerConstant) | ((isNameExpr[isNameExpr + isIntegerConstant] & isIntegerConstant) << isIntegerConstant) | ((isNameExpr[isNameExpr + isIntegerConstant] & isIntegerConstant));
    }
}
