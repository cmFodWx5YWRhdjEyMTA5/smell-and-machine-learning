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
    @Override
    public byte[] isMethod() {
        short isVariable = (Short) super.isMethod();
        // isComment
        byte[] isVariable = new byte[isIntegerConstant];
        isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod(@NonNull Object isParameter) {
        return ((Short) isMethod()).isMethod((Short) ((PwsShortField) isNameExpr).isMethod());
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof PwsShortField) {
            return isMethod().isMethod(((PwsShortField) isNameExpr).isMethod());
        } else if (isNameExpr instanceof Short) {
            return isMethod().isMethod(isNameExpr);
        }
        throw new ClassCastException();
    }
}
