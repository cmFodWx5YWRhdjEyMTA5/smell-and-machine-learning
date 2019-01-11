// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;

public class isClassOrIsInterface extends OperationResult {

    public isConstructor(int isParameter, OperationLog isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public static final Creator<GenericOperationResult> isVariable = new Creator<GenericOperationResult>() {

        public GenericOperationResult isMethod(final Parcel isParameter) {
            return new GenericOperationResult(isNameExpr);
        }

        public GenericOperationResult[] isMethod(final int isParameter) {
            return new GenericOperationResult[isNameExpr];
        }
    };
}
