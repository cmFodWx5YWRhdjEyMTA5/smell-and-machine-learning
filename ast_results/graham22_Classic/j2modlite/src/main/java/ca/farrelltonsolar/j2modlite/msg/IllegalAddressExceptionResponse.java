// isComment
package ca.farrelltonsolar.j2modlite.msg;

import ca.farrelltonsolar.j2modlite.Modbus;

/**
 * isComment
 */
public class isClassOrIsInterface extends ExceptionResponse {

    /**
     * isComment
     */
    public void isMethod(int isParameter) {
        super.isMethod(isNameExpr | isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public isConstructor() {
        super(isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    public isConstructor(int isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}
