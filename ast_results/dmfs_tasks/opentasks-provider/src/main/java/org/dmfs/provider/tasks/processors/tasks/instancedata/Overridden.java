// isComment
package org.dmfs.provider.tasks.processors.tasks.instancedata;

import android.content.ContentValues;
import org.dmfs.iterables.elementary.Seq;
import org.dmfs.jems.optional.decorators.Mapped;
import org.dmfs.jems.single.Single;
import org.dmfs.optional.NullSafe;
import org.dmfs.optional.Optional;
import org.dmfs.optional.adapters.FirstPresent;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Single<ContentValues> {

    private final Optional<DateTime> isVariable;

    private final Single<ContentValues> isVariable;

    public isConstructor(Optional<DateTime> isParameter, Single<ContentValues> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public ContentValues isMethod() {
        ContentValues isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new FirstPresent<>(new Seq<>(new Mapped<>(DateTime::getTimestamp, isNameExpr), new NullSafe<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), new NullSafe<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(null));
        return isNameExpr;
    }
}
