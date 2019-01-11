// isComment
package org.sufficientlysecure.keychain.ssh;

import android.os.Parcel;
import org.sufficientlysecure.keychain.operations.results.InputPendingResult;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;

/**
 * isComment
 */
public class isClassOrIsInterface extends InputPendingResult {

    public static final int isVariable = isNameExpr + isIntegerConstant;

    byte[] isVariable;

    public long isVariable;

    public void isMethod(byte[] isParameter) {
        isNameExpr = isNameExpr;
    }

    public byte[] isMethod() {
        return isNameExpr;
    }

    public isConstructor(int isParameter, OperationLog isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(OperationLog isParameter, RequiredInputParcel isParameter, CryptoInputParcel isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod() != isIntegerConstant ? isNameExpr.isMethod() : null;
    }

    public int isMethod() {
        return isIntegerConstant;
    }

    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isIntegerConstant);
        }
    }

    public static final Creator<AuthenticationResult> isVariable = new Creator<AuthenticationResult>() {

        public AuthenticationResult isMethod(final Parcel isParameter) {
            return new AuthenticationResult(isNameExpr);
        }

        public AuthenticationResult[] isMethod(final int isParameter) {
            return new AuthenticationResult[isNameExpr];
        }
    };
}
