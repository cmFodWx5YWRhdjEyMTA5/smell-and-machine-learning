// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;

public class isClassOrIsInterface extends OperationResult {

    public final Long isVariable;

    public isConstructor(int isParameter, OperationLog isParameter, Long isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod() != isIntegerConstant ? isNameExpr.isMethod() : null;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isIntegerConstant);
        }
    }

    public static Creator<EditKeyResult> isVariable = new Creator<EditKeyResult>() {

        public EditKeyResult isMethod(final Parcel isParameter) {
            return new EditKeyResult(isNameExpr);
        }

        public EditKeyResult[] isMethod(final int isParameter) {
            return new EditKeyResult[isNameExpr];
        }
    };
}
