// isComment
package org.dmfs.provider.tasks.processors.tasks.instancedata;

import android.content.ContentValues;
import org.dmfs.jems.single.Single;
import org.dmfs.optional.NullSafe;
import org.dmfs.optional.composite.Zipped;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Single<ContentValues> {

    private final Single<ContentValues> isVariable;

    public isConstructor(Single<ContentValues> isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public ContentValues isMethod() {
        ContentValues isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Zipped<>(new NullSafe<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), new NullSafe<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), (isParameter, isParameter) -> isNameExpr - isNameExpr).isMethod(null));
        return isNameExpr;
    }
}
