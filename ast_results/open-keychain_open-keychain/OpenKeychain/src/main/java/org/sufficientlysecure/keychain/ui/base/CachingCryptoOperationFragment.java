// isComment
package org.sufficientlysecure.keychain.ui.base;

import android.os.Bundle;
import android.os.Parcelable;
import org.sufficientlysecure.keychain.operations.results.OperationResult;

public abstract class isClassOrIsInterface<T extends Parcelable, S extends OperationResult> extends QueueingCryptoOperationFragment<T, S> {

    public static final String isVariable = "isStringConstant";

    private T isVariable;

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(S isParameter) {
        isNameExpr = null;
    }

    @Override
    public void isMethod(S isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = null;
    }

    @Override
    public abstract T isMethod();

    protected T isMethod() {
        return isNameExpr;
    }

    protected void isMethod(T isParameter) {
        isNameExpr = isNameExpr;
    }

    public void isMethod() {
        isNameExpr = null;
    }
}
