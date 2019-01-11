// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;
import org.sufficientlysecure.keychain.Constants;
import org.sufficientlysecure.keychain.pgp.CanonicalizedKeyRing;

public class isClassOrIsInterface extends OperationResult {

    public final long isVariable;

    public isConstructor(int isParameter, OperationLog isParameter, CanonicalizedKeyRing isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr != null ? isNameExpr.isMethod() : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    // isComment
    public static final int isVariable = isIntegerConstant;

    // isComment
    public static final int isVariable = isIntegerConstant;

    // isComment
    public static final int isVariable = isIntegerConstant;

    public boolean isMethod() {
        return (isNameExpr & isNameExpr) == isNameExpr;
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    public static Creator<SaveKeyringResult> isVariable = new Creator<SaveKeyringResult>() {

        public SaveKeyringResult isMethod(final Parcel isParameter) {
            return new SaveKeyringResult(isNameExpr);
        }

        public SaveKeyringResult[] isMethod(final int isParameter) {
            return new SaveKeyringResult[isNameExpr];
        }
    };
}
