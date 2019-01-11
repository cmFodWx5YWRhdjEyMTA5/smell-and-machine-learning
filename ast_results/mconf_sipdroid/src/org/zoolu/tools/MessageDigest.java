// isComment
package org.zoolu.tools;

/**
 * isComment
 */
public abstract class isClassOrIsInterface {

    /**
     * isComment
     */
    public abstract MessageDigest isMethod(byte[] isParameter, int isParameter, int isParameter);

    /**
     * isComment
     */
    public MessageDigest isMethod(String isParameter) {
        byte[] isVariable = isNameExpr.isMethod();
        return isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public MessageDigest isMethod(byte[] isParameter) {
        return isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public abstract byte[] isMethod();

    /**
     * isComment
     */
    public byte[] isMethod() {
        return isMethod();
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isMethod(isMethod());
    }

    /**
     * isComment
     */
    public static String isMethod(byte[] isParameter) {
        String isVariable = new String();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr += isNameExpr.isMethod((isNameExpr[isNameExpr] >>> isIntegerConstant) & isIntegerConstant);
            isNameExpr += isNameExpr.isMethod(isNameExpr[isNameExpr] & isIntegerConstant);
        }
        return isNameExpr;
    }
}
