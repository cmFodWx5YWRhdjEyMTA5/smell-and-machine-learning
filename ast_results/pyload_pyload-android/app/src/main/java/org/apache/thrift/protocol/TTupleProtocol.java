// isComment
package org.apache.thrift.protocol;

import java.util.BitSet;
import org.apache.thrift.TException;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.transport.TTransport;

public final class isClassOrIsInterface extends TCompactProtocol {

    public static class isClassOrIsInterface implements TProtocolFactory {

        public isConstructor() {
        }

        public TProtocol isMethod(TTransport isParameter) {
            return new TTupleProtocol(isNameExpr);
        }
    }

    public isConstructor(TTransport isParameter) {
        super(isNameExpr);
    }

    @Override
    public Class<? extends IScheme> isMethod() {
        return TupleScheme.class;
    }

    public void isMethod(BitSet isParameter, int isParameter) throws TException {
        byte[] isVariable = isMethod(isNameExpr, isNameExpr);
        for (byte isVariable : isNameExpr) {
            isMethod(isNameExpr);
        }
    }

    public BitSet isMethod(int isParameter) throws TException {
        int isVariable = (int) isNameExpr.isMethod(isNameExpr / isDoubleConstant);
        byte[] isVariable = new byte[isNameExpr];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr[isNameExpr] = isMethod();
        }
        BitSet isVariable = isMethod(isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static BitSet isMethod(byte[] isParameter) {
        BitSet isVariable = new BitSet();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr * isIntegerConstant; isNameExpr++) {
            if ((isNameExpr[isNameExpr.isFieldAccessExpr - isNameExpr / isIntegerConstant - isIntegerConstant] & (isIntegerConstant << (isNameExpr % isIntegerConstant))) > isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static byte[] isMethod(BitSet isParameter, int isParameter) {
        byte[] isVariable = new byte[isNameExpr / isIntegerConstant + isIntegerConstant];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr[isNameExpr.isFieldAccessExpr - isNameExpr / isIntegerConstant - isIntegerConstant] |= isIntegerConstant << (isNameExpr % isIntegerConstant);
            }
        }
        return isNameExpr;
    }
}
