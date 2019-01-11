// isComment
package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.BitMatrix;

/**
 * isComment
 */
enum DataMask {

    /**
     * isComment
     */
    DATA_MASK_000 {

        @Override
        boolean isMethod(int isParameter, int isParameter) {
            return ((isNameExpr + isNameExpr) & isIntegerConstant) == isIntegerConstant;
        }
    }
    ,
    /**
     * isComment
     */
    DATA_MASK_001 {

        @Override
        boolean isMethod(int isParameter, int isParameter) {
            return (isNameExpr & isIntegerConstant) == isIntegerConstant;
        }
    }
    ,
    /**
     * isComment
     */
    DATA_MASK_010 {

        @Override
        boolean isMethod(int isParameter, int isParameter) {
            return isNameExpr % isIntegerConstant == isIntegerConstant;
        }
    }
    ,
    /**
     * isComment
     */
    DATA_MASK_011 {

        @Override
        boolean isMethod(int isParameter, int isParameter) {
            return (isNameExpr + isNameExpr) % isIntegerConstant == isIntegerConstant;
        }
    }
    ,
    /**
     * isComment
     */
    DATA_MASK_100 {

        @Override
        boolean isMethod(int isParameter, int isParameter) {
            return (((isNameExpr / isIntegerConstant) + (isNameExpr / isIntegerConstant)) & isIntegerConstant) == isIntegerConstant;
        }
    }
    ,
    /**
     * isComment
     */
    DATA_MASK_101 {

        @Override
        boolean isMethod(int isParameter, int isParameter) {
            return (isNameExpr * isNameExpr) % isIntegerConstant == isIntegerConstant;
        }
    }
    ,
    /**
     * isComment
     */
    DATA_MASK_110 {

        @Override
        boolean isMethod(int isParameter, int isParameter) {
            return ((isNameExpr * isNameExpr) % isIntegerConstant) < isIntegerConstant;
        }
    }
    ,
    /**
     * isComment
     */
    DATA_MASK_111 {

        @Override
        boolean isMethod(int isParameter, int isParameter) {
            return ((isNameExpr + isNameExpr + ((isNameExpr * isNameExpr) % isIntegerConstant)) & isIntegerConstant) == isIntegerConstant;
        }
    }
    ;

    // isComment
    /**
     * isComment
     */
    final void isMethod(BitMatrix isParameter, int isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                if (isMethod(isNameExpr, isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
            }
        }
    }

    abstract boolean isMethod(int isParameter, int isParameter);
}
