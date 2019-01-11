// isComment
package org.sufficientlysecure.keychain.ui.base;

import android.os.Bundle;
import android.os.Parcelable;
import org.sufficientlysecure.keychain.operations.results.OperationResult;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T extends Parcelable, S extends OperationResult> extends CryptoOperationFragment<T, S> {

    public static final String isVariable = "isStringConstant";

    private S isVariable;

    public isConstructor() {
        super();
    }

    public isConstructor(Integer isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            try {
                if (isNameExpr.isMethod()) {
                    isMethod(isNameExpr);
                } else {
                    isMethod(isNameExpr);
                }
            } finally {
                isNameExpr = null;
            }
        }
    }

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

    public abstract void isMethod(S isParameter);

    public void isMethod(S isParameter) {
        isMethod();
        isNameExpr.isMethod(isMethod()).isMethod();
    }

    @Override
    public final void isMethod(S isParameter) {
        if (isMethod() == null) {
            isNameExpr = isNameExpr;
            return;
        }
        isMethod(isNameExpr);
    }

    @Override
    public final void isMethod(S isParameter) {
        if (isMethod() == null) {
            isNameExpr = isNameExpr;
            return;
        }
        isMethod(isNameExpr);
    }
}
