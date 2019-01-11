// isComment
package org.pwsafe.lib.file;

import android.support.annotation.NonNull;
import org.pwsafe.lib.UUID;

/**
 * isComment
 */
public class isClassOrIsInterface extends PwsField {

    private static final long isVariable = isStringConstant;

    /**
     * isComment
     */
    public isConstructor(int isParameter, byte[] isParameter) {
        super(isNameExpr, new UUID(isNameExpr));
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public isConstructor(int isParameter, UUID isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(PwsFieldType isParameter, UUID isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public byte[] isMethod() {
        return ((UUID) super.isMethod()).isMethod();
    }

    /**
     * isComment
     */
    public int isMethod(@NonNull Object isParameter) {
        return ((UUID) this.isMethod()).isMethod((UUID) ((PwsUUIDField) isNameExpr).isMethod());
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof PwsUUIDField) {
            return isMethod().isMethod(((PwsUUIDField) isNameExpr).isMethod());
        } else if (isNameExpr instanceof UUID) {
            return ((UUID) isMethod()).isMethod((UUID) isNameExpr);
        }
        throw new ClassCastException();
    }
}
