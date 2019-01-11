// isComment
package org.pwsafe.lib.file;

import android.support.annotation.NonNull;
import org.pwsafe.lib.Util;

/**
 * isComment
 */
public class isClassOrIsInterface extends PwsField {

    private static final long isVariable = isStringConstant;

    /**
     * isComment
     */
    public isConstructor(int isParameter, byte[] isParameter) {
        super(isNameExpr, isNameExpr.isMethod(isNameExpr, isIntegerConstant));
    }

    /**
     * isComment
     */
    public isConstructor(int isParameter, Integer isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(PwsFieldType isParameter, byte[] isParameter) {
        super(isNameExpr, isNameExpr.isMethod(isNameExpr, isIntegerConstant));
    }

    /**
     * isComment
     */
    @Override
    public byte[] isMethod() {
        int isVariable;
        byte[] isVariable;
        isNameExpr = (Integer) super.isMethod();
        // isComment
        isNameExpr = new byte[isIntegerConstant];
        isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod(@NonNull Object isParameter) {
        return ((Integer) isMethod()).isMethod((Integer) ((PwsIntegerField) isNameExpr).isMethod());
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof PwsIntegerField) {
            return isMethod().isMethod(((PwsIntegerField) isNameExpr).isMethod());
        } else if (isNameExpr instanceof Integer) {
            return isMethod().isMethod(isNameExpr);
        }
        throw new ClassCastException();
    }
}
