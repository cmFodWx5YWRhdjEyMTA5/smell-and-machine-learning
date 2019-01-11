// isComment
package org.dmfs.opentaskspal.tasks;

import android.content.ContentProviderOperation;
import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.RowData;
import org.dmfs.android.contentpal.TransactionContext;
import org.dmfs.optional.Absent;
import org.dmfs.optional.Optional;
import org.dmfs.optional.Present;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.rfc5545.Duration;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface implements RowData<TaskContract.Tasks> {

    private final DateTime isVariable;

    private final Optional<DateTime> isVariable;

    private final Optional<Duration> isVariable;

    private isConstructor(@NonNull DateTime isParameter, @NonNull Optional<DateTime> isParameter, @NonNull Optional<Duration> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public isConstructor(@NonNull DateTime isParameter, @NonNull DateTime isParameter) {
        this(isNameExpr, new Present<>(isNameExpr), isNameExpr.isMethod());
    }

    public isConstructor(@NonNull DateTime isParameter, @NonNull Duration isParameter) {
        this(isNameExpr, isNameExpr.isMethod(), new Present<>(isNameExpr));
    }

    public isConstructor(@NonNull DateTime isParameter) {
        this(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    @NonNull
    @Override
    public ContentProviderOperation.Builder isMethod(@NonNull TransactionContext isParameter, @NonNull ContentProviderOperation.Builder isParameter) {
        if (isNameExpr.isMethod() && isNameExpr.isMethod() != isNameExpr.isMethod().isMethod()) {
            throw new IllegalArgumentException("isStringConstant");
        }
        DateTime isVariable = isNameExpr;
        if (isNameExpr.isMethod() && !isNameExpr.isMethod().isMethod()) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        }
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    private static ContentProviderOperation.Builder isMethod(DateTime isParameter, Optional<DateTime> isParameter, Optional<Duration> isParameter, ContentProviderOperation.Builder isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod() ? "isStringConstant" : isNameExpr.isMethod().isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod() ? isIntegerConstant : isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod() ? isNameExpr.isMethod().isMethod() : null).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod() ? isNameExpr.isMethod().isMethod() : null).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
    }
}
