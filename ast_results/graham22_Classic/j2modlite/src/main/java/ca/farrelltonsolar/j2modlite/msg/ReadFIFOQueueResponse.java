// isComment
/**
 * isComment
 */
package ca.farrelltonsolar.j2modlite.msg;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import ca.farrelltonsolar.j2modlite.Modbus;
import ca.farrelltonsolar.j2modlite.procimg.InputRegister;
import ca.farrelltonsolar.j2modlite.procimg.SimpleInputRegister;
import ca.farrelltonsolar.j2modlite.procimg.SimpleRegister;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ModbusResponse {

    /*isComment*/
    private int isVariable;

    private InputRegister[] isVariable;

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public synchronized void isMethod(int isParameter) {
        if (isNameExpr < isIntegerConstant || isNameExpr > isIntegerConstant)
            throw new IllegalArgumentException();
        int isVariable = isNameExpr;
        InputRegister[] isVariable = new InputRegister[isNameExpr];
        isNameExpr = isNameExpr;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            if (isNameExpr < isNameExpr)
                isNameExpr[isNameExpr] = isNameExpr[isNameExpr];
            else
                isNameExpr[isNameExpr] = new SimpleRegister(isIntegerConstant);
        }
    }

    public int[] isMethod() {
        int[] isVariable = new int[isNameExpr];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) isNameExpr[isNameExpr] = isMethod(isNameExpr);
        return isNameExpr;
    }

    public int isMethod(int isParameter) {
        return isNameExpr[isNameExpr].isMethod();
    }

    /**
     * isComment
     */
    public synchronized void isMethod(InputRegister[] isParameter) {
        isNameExpr = isNameExpr;
        if (isNameExpr == null) {
            isNameExpr = isIntegerConstant;
            return;
        }
        if (isNameExpr.isFieldAccessExpr > isIntegerConstant)
            throw new IllegalArgumentException();
        isNameExpr = isNameExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public void isMethod(DataOutput isParameter) throws IOException {
        isNameExpr.isMethod(isMethod());
    }

    /**
     * isComment
     */
    public void isMethod(DataInput isParameter) throws IOException {
        int isVariable;
        /*isComment*/
        isNameExpr = isNameExpr.isMethod();
        /*isComment*/
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = new InputRegister[isNameExpr];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) isNameExpr[isNameExpr] = new SimpleInputRegister(isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public byte[] isMethod() {
        byte[] isVariable = new byte[isNameExpr * isIntegerConstant + isIntegerConstant];
        int isVariable = isNameExpr * isIntegerConstant + isIntegerConstant;
        isNameExpr[isIntegerConstant] = (byte) (isNameExpr >> isIntegerConstant);
        isNameExpr[isIntegerConstant] = (byte) (isNameExpr & isIntegerConstant);
        isNameExpr[isIntegerConstant] = (byte) (isNameExpr >> isIntegerConstant);
        isNameExpr[isIntegerConstant] = (byte) (isNameExpr & isIntegerConstant);
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            byte[] isVariable = isNameExpr[isNameExpr].isMethod();
            isNameExpr[isNameExpr * isIntegerConstant + isIntegerConstant] = isNameExpr[isIntegerConstant];
            isNameExpr[isNameExpr * isIntegerConstant + isIntegerConstant] = isNameExpr[isIntegerConstant];
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor() {
        super();
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isIntegerConstant;
        isNameExpr = new InputRegister[isIntegerConstant];
        isMethod(isIntegerConstant);
    }
}
