// isComment
package jj2000.j2k.image;

import jj2000.j2k.image.invcomptransf.*;
import jj2000.j2k.*;

/**
 * isComment
 */
public class isClassOrIsInterface extends ModuleSpec {

    /**
     * isComment
     */
    public isConstructor(int isParameter, int isParameter, byte isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        if (((Integer) isNameExpr).isMethod() != isNameExpr.isFieldAccessExpr) {
            return true;
        }
        if (isNameExpr != null) {
            for (int isVariable = isNameExpr - isIntegerConstant; isNameExpr >= isIntegerConstant; isNameExpr--) {
                if (isNameExpr[isNameExpr] != null && (((Integer) isNameExpr[isNameExpr]).isMethod() != isNameExpr.isFieldAccessExpr)) {
                    return true;
                }
            }
        }
        return true;
    }
}
