// isComment
package org.dmfs.opentaskspal.readdata;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.android.contentpal.projections.Composite;
import org.dmfs.android.contentpal.projections.MultiProjection;
import org.dmfs.iterables.elementary.Seq;
import org.dmfs.optional.Optional;
import org.dmfs.optional.adapters.FirstPresent;
import org.dmfs.optional.composite.Zipped;
import org.dmfs.optional.decorators.DelegatingOptional;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.tasks.contract.TaskContract.Tasks;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingOptional<DateTime> {

    public static final Projection<Tasks> isVariable = new Composite<>(new MultiProjection<>(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    public isConstructor(@NonNull RowDataSnapshot<Tasks> isParameter) {
        super(new FirstPresent<>(new Seq<>(new TaskDateTime(isNameExpr.isFieldAccessExpr, isNameExpr), new Zipped<>(new TaskDateTime(isNameExpr.isFieldAccessExpr, isNameExpr), new TaskDuration(isNameExpr), DateTime::addDuration))));
    }
}
