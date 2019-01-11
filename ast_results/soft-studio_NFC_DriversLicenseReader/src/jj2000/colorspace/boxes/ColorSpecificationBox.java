// isComment
package jj2000.colorspace.boxes;

import jj2000.j2k.io.*;
import jj2000.colorspace.*;
import jj2000.icc.*;
import java.io.*;

/**
 * isComment
 */
public final class isClassOrIsInterface extends JP2Box {

    static {
        isNameExpr = isIntegerConstant;
    }

    private ColorSpace.MethodEnum isVariable = null;

    private ColorSpace.CSEnum isVariable = null;

    private byte[] isVariable = null;

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
    private void isMethod() throws IOException, ColorSpaceException {
        byte[] isVariable = new byte[isIntegerConstant];
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        switch(isNameExpr[isIntegerConstant]) {
            case isIntegerConstant:
                isNameExpr = isNameExpr.isFieldAccessExpr;
                int isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
                switch(isNameExpr) {
                    case isIntegerConstant:
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        // isComment
                        break;
                    case isIntegerConstant:
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        // isComment
                        break;
                    case isIntegerConstant:
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        // isComment
                        break;
                    default:
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                }
                // isComment
                break;
            case isIntegerConstant:
                isNameExpr = isNameExpr.isFieldAccessExpr;
                int isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
                isNameExpr = new byte[isNameExpr];
                isNameExpr.isMethod(isNameExpr + isIntegerConstant);
                isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr);
                // isComment
                break;
            default:
                throw new ColorSpaceException("isStringConstant" + isNameExpr[isIntegerConstant] + "isStringConstant" + this);
        }
    }

    /*isComment*/
    public ColorSpace.MethodEnum isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    public ColorSpace.CSEnum isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    /*isComment*/
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    /*isComment*/
    public byte[] isMethod() {
        return isNameExpr;
    }
}
