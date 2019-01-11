// isComment
package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;

public class isClassOrIsInterface extends OperationResult {

    final int isVariable, isVariable;

    public isConstructor(int isParameter, OperationLog isParameter) {
        this(isNameExpr, isNameExpr, isIntegerConstant, isIntegerConstant);
    }

    public isConstructor(int isParameter, OperationLog isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
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

    public static Creator<ExportResult> isVariable = new Creator<ExportResult>() {

        public ExportResult isMethod(final Parcel isParameter) {
            return new ExportResult(isNameExpr);
        }

        public ExportResult[] isMethod(final int isParameter) {
            return new ExportResult[isNameExpr];
        }
    };
}
