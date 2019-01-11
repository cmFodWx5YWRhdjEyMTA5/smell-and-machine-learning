// isComment
package org.sufficientlysecure.keychain.operations.results;

import java.util.ArrayList;
import android.os.Parcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;

public class isClassOrIsInterface extends OperationResult {

    // isComment
    public static final int isVariable = isNameExpr + isIntegerConstant;

    final RequiredInputParcel isVariable;

    public isConstructor(int isParameter, OperationLog isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = null;
    }

    public isConstructor(OperationLog isParameter, RequiredInputParcel isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isMethod().isMethod());
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
    }

    public boolean isMethod() {
        return (isNameExpr & isNameExpr) == isNameExpr;
    }

    public RequiredInputParcel isMethod() {
        return isNameExpr;
    }
}
