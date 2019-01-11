// isComment
package org.dmfs.opentaskspal.rowdata;

import android.content.ContentProviderOperation;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import org.dmfs.android.contentpal.RowData;
import org.dmfs.android.contentpal.TransactionContext;
import org.dmfs.jems.iterable.decorators.Mapped;
import org.dmfs.rfc5545.DateTime;

/**
 * isComment
 */
public final class isClassOrIsInterface<Contract> implements RowData<Contract> {

    private final String isVariable;

    private final Iterable<DateTime> isVariable;

    public isConstructor(String isParameter, @NonNull Iterable<DateTime> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @NonNull
    @Override
    public ContentProviderOperation.Builder isMethod(@NonNull TransactionContext isParameter, @NonNull ContentProviderOperation.Builder isParameter) {
        String isVariable = isNameExpr.isMethod("isStringConstant", new Mapped<>(DateTime::toString, new Mapped<>(isParameter -> isNameExpr.isMethod() ? isNameExpr : isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr)));
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod() ? null : isNameExpr);
    }
}
