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

    public static Creator<BenchmarkResult> isVariable = new Creator<BenchmarkResult>() {

        public BenchmarkResult isMethod(final Parcel isParameter) {
            return new BenchmarkResult(isNameExpr);
        }

        public BenchmarkResult[] isMethod(final int isParameter) {
            return new BenchmarkResult[isNameExpr];
        }
    };
}
