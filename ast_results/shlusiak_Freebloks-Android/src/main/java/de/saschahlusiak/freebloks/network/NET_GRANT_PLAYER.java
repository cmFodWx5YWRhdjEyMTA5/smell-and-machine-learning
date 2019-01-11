// isComment
package de.saschahlusiak.freebloks.network;

import java.io.ByteArrayOutputStream;

public class isClassOrIsInterface extends NET_HEADER {

    public int isVariable;

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr, isIntegerConstant);
    }

    public isConstructor(NET_HEADER isParameter) throws ProtocolException {
        super(isNameExpr);
        isNameExpr = isNameExpr[isIntegerConstant];
        if (isNameExpr < isIntegerConstant || isNameExpr > isIntegerConstant)
            throw new ProtocolException("isStringConstant" + isNameExpr);
    }

    @Override
    void isMethod(ByteArrayOutputStream isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
