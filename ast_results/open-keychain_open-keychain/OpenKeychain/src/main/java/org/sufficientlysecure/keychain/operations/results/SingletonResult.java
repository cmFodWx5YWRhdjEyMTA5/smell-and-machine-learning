// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;

/**
 * isComment
 */
public class isClassOrIsInterface extends OperationResult {

    /**
     * isComment
     */
    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public isConstructor(int isParameter, LogType isParameter) {
        super(isNameExpr, new OperationLog());
        // isComment
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
    }

    public static Creator<SingletonResult> isVariable = new Creator<SingletonResult>() {

        public SingletonResult isMethod(final Parcel isParameter) {
            return new SingletonResult(isNameExpr);
        }

        public SingletonResult[] isMethod(final int isParameter) {
            return new SingletonResult[isNameExpr];
        }
    };
}
