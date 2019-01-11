// isComment
package com.google.zxing;

import java.util.List;

/**
 * isComment
 */
public enum DecodeHintType {

    /**
     * isComment
     */
    OTHER(Object.class),
    /**
     * isComment
     */
    PURE_BARCODE(Void.class),
    /**
     * isComment
     */
    POSSIBLE_FORMATS(List.class),
    /**
     * isComment
     */
    TRY_HARDER(Void.class),
    /**
     * isComment
     */
    CHARACTER_SET(String.class),
    /**
     * isComment
     */
    ALLOWED_LENGTHS(int[].class),
    /**
     * isComment
     */
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    /**
     * isComment
     */
    ASSUME_GS1(Void.class),
    /**
     * isComment
     */
    RETURN_CODABAR_START_END(Void.class),
    /**
     * isComment
     */
    NEED_RESULT_POINT_CALLBACK(ResultPointCallback.class),
    /**
     * isComment
     */
    ALLOWED_EAN_EXTENSIONS(int[].class);

    // isComment
    /**
     * isComment
     */
    private final Class<?> isVariable;

    isConstructor(Class<?> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Class<?> isMethod() {
        return isNameExpr;
    }
}
