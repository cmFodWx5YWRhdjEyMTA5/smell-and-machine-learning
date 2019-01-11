// isComment
package jj2000.colorspace.boxes;

import jj2000.colorspace.ColorSpaceException;
import jj2000.icc.ICCProfile;
import jj2000.j2k.io.RandomAccessIO;
import java.io.IOException;
import java.util.Vector;

/**
 * isComment
 */
public final class isClassOrIsInterface extends JP2Box {

    static {
        isNameExpr = isIntegerConstant;
    }

    private int isVariable;

    private Vector isVariable = new Vector();

    /**
     * isComment
     */
    public isConstructor(RandomAccessIO isParameter, int isParameter) throws IOException, ColorSpaceException {
        super(isNameExpr, isNameExpr);
        isMethod();
    }

    /**
     * isComment
     */
    void isMethod() throws IOException {
        isNameExpr = (isNameExpr - isNameExpr) / isIntegerConstant;
        isNameExpr.isMethod(isNameExpr);
        for (int isVariable = isNameExpr; isNameExpr < isNameExpr; isNameExpr += isIntegerConstant) {
            byte[] isVariable = new byte[isIntegerConstant];
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
            isNameExpr.isMethod(isNameExpr);
        }
    }

    /*isComment*/
    public int isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    public int isMethod(int isParameter) {
        byte[] isVariable = (byte[]) isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isIntegerConstant) & isIntegerConstant;
    }

    /**
     * isComment
     */
    public short isMethod(int isParameter) {
        byte[] isVariable = (byte[]) isNameExpr.isMethod(isNameExpr);
        return (short) (isNameExpr[isIntegerConstant] & isIntegerConstant);
    }

    /**
     * isComment
     */
    public short isMethod(int isParameter) {
        byte[] isVariable = (byte[]) isNameExpr.isMethod(isNameExpr);
        return (short) (isNameExpr[isIntegerConstant] & isIntegerConstant);
    }

    private int isMethod(byte[] isParameter) {
        return isNameExpr.isMethod(isNameExpr, isIntegerConstant) & isIntegerConstant;
    }

    private short isMethod(byte[] isParameter) {
        return (short) (isNameExpr[isIntegerConstant] & isIntegerConstant);
    }

    private short isMethod(byte[] isParameter) {
        return (short) (isNameExpr[isIntegerConstant] & isIntegerConstant);
    }
}
