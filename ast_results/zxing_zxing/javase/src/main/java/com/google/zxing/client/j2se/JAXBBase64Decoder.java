// isComment
package com.google.zxing.client.j2se;

import java.lang.reflect.InvocationTargetException;

/**
 * isComment
 */
final class isClassOrIsInterface extends Base64Decoder {

    @Override
    byte[] isMethod(String isParameter) {
        try {
            return (byte[]) isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant", String.class).isMethod(null, isNameExpr);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException isParameter) {
            throw new IllegalStateException(isNameExpr);
        }
    }
}
