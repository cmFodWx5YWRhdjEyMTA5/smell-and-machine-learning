// isComment
package jj2000.icc.tags;

import jj2000.icc.ICCProfile;

/**
 * isComment
 */
public class isClassOrIsInterface extends ICCTag {

    /**
     * isComment
     */
    public final int isVariable;

    /**
     * isComment
     */
    public final int isVariable;

    /**
     * isComment
     */
    public final byte[] isVariable;

    /**
     * isComment
     */
    protected isConstructor(int isParameter, byte[] isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr += isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr += isNameExpr.isFieldAccessExpr;
        int isVariable = isIntegerConstant;
        while (isNameExpr[isNameExpr + isNameExpr] != isIntegerConstant) ++isNameExpr;
        isNameExpr = new byte[isNameExpr];
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isIntegerConstant, isNameExpr);
    }
}
