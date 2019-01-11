// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;

public class isClassOrIsInterface extends InputPendingResult {

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

    public static Creator<ExportResult> isVariable = new Creator<ExportResult>() {

        public ExportResult isMethod(final Parcel isParameter) {
            return new ExportResult(isNameExpr);
        }

        public ExportResult[] isMethod(final int isParameter) {
            return new ExportResult[isNameExpr];
        }
    };
}
