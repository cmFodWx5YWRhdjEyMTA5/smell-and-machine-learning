// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;

public class isClassOrIsInterface extends InputPendingResult {

    byte[] isVariable;

    public void isMethod(byte[] isParameter) {
        isNameExpr = isNameExpr;
    }

    public byte[] isMethod() {
        return isNameExpr;
    }

    public isConstructor(int isParameter, OperationLog isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(OperationLog isParameter, RequiredInputParcel isParameter) {
        super(isNameExpr, isNameExpr);
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

    public static final Creator<PgpSignEncryptResult> isVariable = new Creator<PgpSignEncryptResult>() {

        public PgpSignEncryptResult isMethod(final Parcel isParameter) {
            return new PgpSignEncryptResult(isNameExpr);
        }

        public PgpSignEncryptResult[] isMethod(final int isParameter) {
            return new PgpSignEncryptResult[isNameExpr];
        }
    };
}
