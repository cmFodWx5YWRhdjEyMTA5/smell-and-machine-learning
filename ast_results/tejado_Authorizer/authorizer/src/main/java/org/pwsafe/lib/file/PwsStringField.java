// isComment
package org.pwsafe.lib.file;

import android.support.annotation.NonNull;
import java.io.UnsupportedEncodingException;

/**
 * isComment
 */
public class isClassOrIsInterface extends PwsField {

    private static final long isVariable = isStringConstant;

    /**
     * isComment
     */
    public isConstructor(int isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public isConstructor(PwsFieldType isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public byte[] isMethod() {
        byte[] isVariable;
        try {
            isNameExpr = ((String) super.isMethod()).isMethod("isStringConstant");
        } catch (UnsupportedEncodingException isParameter) {
            throw new RuntimeException(isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod(@NonNull Object isParameter) {
        return ((String) this.isMethod()).isMethod((String) ((PwsStringField) isNameExpr).isMethod());
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof PwsStringField) {
            return super.isMethod().isMethod(((PwsStringField) isNameExpr).isMethod());
        } else if (isNameExpr instanceof String) {
            return isMethod((String) isNameExpr);
        }
        throw new ClassCastException();
    }

    /**
     * isComment
     */
    public boolean isMethod(String isParameter) {
        return super.isMethod().isMethod(isNameExpr);
    }
}
