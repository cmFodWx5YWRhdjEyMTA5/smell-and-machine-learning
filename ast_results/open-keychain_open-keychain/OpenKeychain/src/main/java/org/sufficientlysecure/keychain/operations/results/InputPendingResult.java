// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;
import android.support.annotation.NonNull;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;

public class isClassOrIsInterface extends OperationResult {

    // isComment
    public static final int isVariable = isNameExpr + isIntegerConstant;

    final RequiredInputParcel isVariable;

    // isComment
    public final CryptoInputParcel isVariable;

    public isConstructor(int isParameter, @NonNull OperationLog isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = null;
        isNameExpr = null;
    }

    public isConstructor(@NonNull OperationLog isParameter, @NonNull InputPendingResult isParameter) {
        super(isNameExpr, isNameExpr);
        if (!isNameExpr.isMethod()) {
            throw new AssertionError("isStringConstant");
        }
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr;
    }

    public isConstructor(@NonNull OperationLog isParameter, RequiredInputParcel isParameter, CryptoInputParcel isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isMethod().isMethod());
        isNameExpr = isNameExpr.isMethod(isMethod().isMethod());
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
    }

    public boolean isMethod() {
        return (isNameExpr & isNameExpr) == isNameExpr;
    }

    public RequiredInputParcel isMethod() {
        return isNameExpr;
    }
}
