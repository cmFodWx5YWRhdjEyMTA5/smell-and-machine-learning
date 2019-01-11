// isComment
package org.sufficientlysecure.keychain.securitytoken.usb.tpdu;

import android.support.annotation.NonNull;
import org.sufficientlysecure.keychain.securitytoken.usb.UsbTransportException;

class isClassOrIsInterface extends Block {

    static final byte isVariable = (byte) isIntegerConstant;

    static final byte isVariable = (byte) isIntegerConstant;

    private static final byte isVariable = isIntegerConstant;

    isConstructor(BlockChecksumAlgorithm isParameter, byte[] isParameter) throws UsbTransportException {
        super(isNameExpr, isNameExpr);
        if ((isMethod() & isNameExpr) != isNameExpr) {
            throw new IllegalArgumentException("isStringConstant");
        }
        if (isMethod().isFieldAccessExpr != isIntegerConstant) {
            throw new UsbTransportException("isStringConstant");
        }
    }

    isConstructor(BlockChecksumAlgorithm isParameter, byte isParameter, byte isParameter) throws UsbTransportException {
        super(isNameExpr, isNameExpr, (byte) (isNameExpr | ((isNameExpr & isIntegerConstant) << isNameExpr)), new byte[isIntegerConstant], isIntegerConstant, isIntegerConstant);
    }

    public RError isMethod() throws UsbTransportException {
        return isNameExpr.isMethod(isMethod());
    }

    enum RError {

        NO_ERROR(isIntegerConstant), EDC_ERROR(isIntegerConstant), OTHER_ERROR(isIntegerConstant);

        private byte isVariable;

        isConstructor(int isParameter) {
            isNameExpr = (byte) isNameExpr;
        }

        @NonNull
        public static RError isMethod(byte isParameter) throws UsbTransportException {
            for (final RError isVariable : isMethod()) {
                if (isNameExpr.isFieldAccessExpr == (isNameExpr & isIntegerConstant)) {
                    return isNameExpr;
                }
            }
            throw new UsbTransportException("isStringConstant");
        }
    }
}
