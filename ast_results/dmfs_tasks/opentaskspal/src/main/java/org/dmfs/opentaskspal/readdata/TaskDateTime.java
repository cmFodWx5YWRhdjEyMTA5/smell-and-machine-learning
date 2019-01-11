// isComment
package org.dmfs.opentaskspal.readdata;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.android.contentpal.projections.Composite;
import org.dmfs.android.contentpal.projections.SingleColProjection;
import org.dmfs.optional.Optional;
import org.dmfs.optional.decorators.DelegatingOptional;
import org.dmfs.optional.decorators.Mapped;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.tasks.contract.TaskContract.Tasks;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingOptional<DateTime> {

    public static final Projection<Tasks> isVariable = new Composite<>(new SingleColProjection<>(isNameExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);

    public isConstructor(@NonNull String isParameter, @NonNull final RowDataSnapshot<Tasks> isParameter) {
        super(new Mapped<>((Long isParameter) -> isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"::equals).isMethod(true) ? new DateTime(isNameExpr).isMethod() : new DateTime(isNameExpr).isMethod(new EffectiveTimezone(isNameExpr).isMethod()), isNameExpr.isMethod(isNameExpr, Long::valueOf)));
    }
}
