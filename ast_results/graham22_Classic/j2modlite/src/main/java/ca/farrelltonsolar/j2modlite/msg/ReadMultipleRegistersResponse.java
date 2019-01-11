// isComment
/**
 * isComment
 */
package ca.farrelltonsolar.j2modlite.msg;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import ca.farrelltonsolar.j2modlite.Modbus;
import ca.farrelltonsolar.j2modlite.procimg.Register;
import ca.farrelltonsolar.j2modlite.procimg.SimpleRegister;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ModbusResponse {

    // isComment
    private int isVariable;

    private Register[] isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super();
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public isConstructor(Register[] isParameter) {
        super();
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr * isIntegerConstant + isIntegerConstant);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr * isIntegerConstant;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr / isIntegerConstant;
    }

    // isComment
    /**
     * isComment
     */
    public Register isMethod(int isParameter) {
        if (isNameExpr == null)
            throw new IndexOutOfBoundsException("isStringConstant");
        if (isNameExpr < isIntegerConstant)
            throw new IndexOutOfBoundsException("isStringConstant" + isNameExpr);
        if (isNameExpr >= isMethod())
            throw new IndexOutOfBoundsException(isNameExpr + "isStringConstant" + isMethod());
        return isNameExpr[isNameExpr];
    }

    /**
     * isComment
     */
    public int isMethod(int isParameter) throws IndexOutOfBoundsException {
        return isMethod(isNameExpr).isMethod();
    }

    /**
     * isComment
     */
    public Register[] isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Register[] isParameter) {
        isNameExpr = isNameExpr.isFieldAccessExpr * isIntegerConstant;
        isMethod(isNameExpr + isIntegerConstant);
        isNameExpr = isNameExpr;
    }

    public void isMethod(DataOutput isParameter) throws IOException {
        isNameExpr.isMethod(isNameExpr);
        for (int isVariable = isIntegerConstant; isNameExpr < isMethod(); isNameExpr++) isNameExpr.isMethod(isNameExpr[isNameExpr].isMethod());
    }

    public void isMethod(DataInput isParameter) throws IOException {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = new Register[isMethod()];
        for (int isVariable = isIntegerConstant; isNameExpr < isMethod(); isNameExpr++) isNameExpr[isNameExpr] = new SimpleRegister(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr + isIntegerConstant);
    }

    public byte[] isMethod() {
        byte[] isVariable = null;
        isNameExpr = new byte[isMethod() * isIntegerConstant + isIntegerConstant];
        int isVariable = isIntegerConstant;
        isNameExpr[isNameExpr++] = (byte) isNameExpr;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            byte[] isVariable = isNameExpr[isNameExpr].isMethod();
            isNameExpr[isNameExpr++] = isNameExpr[isIntegerConstant];
            isNameExpr[isNameExpr++] = isNameExpr[isIntegerConstant];
        }
        return isNameExpr;
    }
}
