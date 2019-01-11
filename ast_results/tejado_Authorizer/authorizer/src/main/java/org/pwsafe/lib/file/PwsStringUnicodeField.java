// isComment
package org.pwsafe.lib.file;

import android.support.annotation.NonNull;
import java.io.UnsupportedEncodingException;

/**
 * isComment
 */
public class isClassOrIsInterface extends PwsField {

    private static final long isVariable = -isStringConstant;

    /**
     * isComment
     */
    public isConstructor(int isParameter, byte[] isParameter) throws UnsupportedEncodingException {
        super(isNameExpr, new String(isNameExpr, "isStringConstant"));
    }

    /**
     * isComment
     */
    public isConstructor(int isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(PwsFieldType isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public byte[] isMethod() {
        try {
            return ((String) super.isMethod()).isMethod("isStringConstant");
        } catch (UnsupportedEncodingException isParameter) {
            throw new RuntimeException(isNameExpr);
        }
    }

    /**
     * isComment
     */
    public int isMethod(@NonNull Object isParameter) {
        return ((String) this.isMethod()).isMethod((String) ((PwsStringUnicodeField) isNameExpr).isMethod());
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof PwsStringUnicodeField) {
            return super.isMethod().isMethod(((PwsStringUnicodeField) isNameExpr).isMethod());
        } else if (isNameExpr instanceof String) {
            return super.isMethod().isMethod(isNameExpr);
        }
        throw new ClassCastException();
    }
}
