// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;

public class isClassOrIsInterface extends OperationResult {

    public isConstructor(int isParameter, OperationLog isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
    }

    public static Creator<ConsolidateResult> isVariable = new Creator<ConsolidateResult>() {

        public ConsolidateResult isMethod(final Parcel isParameter) {
            return new ConsolidateResult(isNameExpr);
        }

        public ConsolidateResult[] isMethod(final int isParameter) {
            return new ConsolidateResult[isNameExpr];
        }
    };
}
