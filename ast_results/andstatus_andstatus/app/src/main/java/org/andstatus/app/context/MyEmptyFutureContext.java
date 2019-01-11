// isComment
package org.andstatus.app.context;

import android.support.annotation.NonNull;

/**
 * isComment
 */
public class isClassOrIsInterface extends MyFutureContext {

    public static final MyEmptyFutureContext isVariable = new MyEmptyFutureContext(isNameExpr.isFieldAccessExpr);

    public isConstructor(@NonNull MyContext isParameter) {
        super(isNameExpr);
    }

    @Override
    protected MyContext isMethod(Object... isParameter) {
        return isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @NonNull
    @Override
    public MyContext isMethod() {
        return isNameExpr;
    }

    @NonNull
    @Override
    public MyContext isMethod() {
        return isNameExpr;
    }
}
