// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;
import java.util.ArrayList;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;

public class isClassOrIsInterface extends InputPendingResult {

    ArrayList<PgpSignEncryptResult> isVariable;

    byte[] isVariable;

    public isConstructor(OperationLog isParameter, RequiredInputParcel isParameter, ArrayList<PgpSignEncryptResult> isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(int isParameter, OperationLog isParameter, ArrayList<PgpSignEncryptResult> isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(int isParameter, OperationLog isParameter, ArrayList<PgpSignEncryptResult> isParameter, byte[] isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    public byte[] isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isIntegerConstant;
    }

    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    public static final Creator<SignEncryptResult> isVariable = new Creator<SignEncryptResult>() {

        public SignEncryptResult isMethod(final Parcel isParameter) {
            return new SignEncryptResult(isNameExpr);
        }

        public SignEncryptResult[] isMethod(final int isParameter) {
            return new SignEncryptResult[isNameExpr];
        }
    };
}
