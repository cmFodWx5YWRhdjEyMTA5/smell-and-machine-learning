// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;
import android.support.annotation.NonNull;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;

public class isClassOrIsInterface extends InputPendingResult {

    final int isVariable, isVariable;

    public isConstructor(int isParameter, OperationLog isParameter) {
        this(isNameExpr, isNameExpr, isIntegerConstant, isIntegerConstant);
    }

    public isConstructor(int isParameter, OperationLog isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public isConstructor(@NonNull OperationLog isParameter, RequiredInputParcel isParameter, CryptoInputParcel isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        // isComment
        isNameExpr = -isIntegerConstant;
        isNameExpr = -isIntegerConstant;
    }

    /**
     * isComment
     */
    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    public static Creator<UploadResult> isVariable = new Creator<UploadResult>() {

        public UploadResult isMethod(final Parcel isParameter) {
            return new UploadResult(isNameExpr);
        }

        public UploadResult[] isMethod(final int isParameter) {
            return new UploadResult[isNameExpr];
        }
    };
}
