// isComment
package org.dmfs.opentaskspal.readdata;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.android.contentpal.projections.SingleColProjection;
import org.dmfs.jems.single.Single;
import org.dmfs.jems.single.decorators.DelegatingSingle;
import org.dmfs.jems.single.elementary.ValueSingle;
import org.dmfs.tasks.contract.TaskContract.Tasks;
import java.util.TimeZone;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingSingle<TimeZone> {

    public static final Projection<Tasks> isVariable = new SingleColProjection<>(isNameExpr.isFieldAccessExpr);

    public isConstructor(@NonNull RowDataSnapshot<Tasks> isParameter) {
        super(new ValueSingle<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, TimeZone::getTimeZone).isMethod()));
    }
}
