// isComment
package de.saschahlusiak.freebloks.network;

import java.io.ByteArrayOutputStream;

public class isClassOrIsInterface extends NET_HEADER {

    int isVariable;

    /*isComment*/
    String isVariable;

    public isConstructor(int isParameter, String isParameter) {
        super(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(NET_HEADER isParameter) throws ProtocolException {
        super(isNameExpr);
        if (isNameExpr >= isIntegerConstant) {
            isNameExpr = isNameExpr[isIntegerConstant];
            isNameExpr = new String(isNameExpr, isIntegerConstant, isIntegerConstant);
        } else {
            isNameExpr = null;
            isNameExpr = -isIntegerConstant;
        }
        if (isNameExpr < -isIntegerConstant || isNameExpr > isIntegerConstant)
            throw new ProtocolException("isStringConstant" + isNameExpr);
    }

    @Override
    void isMethod(ByteArrayOutputStream isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) isNameExpr.isMethod(isIntegerConstant);
        } else {
            int isVariable;
            for (isNameExpr = isIntegerConstant; isNameExpr < isIntegerConstant && isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                int isVariable = (int) isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            }
            for (; isNameExpr < isIntegerConstant; isNameExpr++) isNameExpr.isMethod(isIntegerConstant);
        }
    }
}
