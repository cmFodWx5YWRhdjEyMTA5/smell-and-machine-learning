// isComment
package org.zoolu.sdp;

/**
 * isComment
 */
public class isClassOrIsInterface extends SdpField {

    /**
     * isComment
     */
    public isConstructor(String isParameter) {
        super('isStringConstant', isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, String isParameter) {
        super('isStringConstant', isNameExpr + "isStringConstant" + isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(SdpField isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod() {
        int isVariable = isNameExpr.isMethod("isStringConstant");
        if (isNameExpr < isIntegerConstant)
            return isNameExpr;
        else
            return isNameExpr.isMethod(isIntegerConstant, isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod() {
        int isVariable = isNameExpr.isMethod("isStringConstant");
        if (isNameExpr < isIntegerConstant)
            return null;
        else
            return isNameExpr.isMethod(isNameExpr + isIntegerConstant);
    }
}
