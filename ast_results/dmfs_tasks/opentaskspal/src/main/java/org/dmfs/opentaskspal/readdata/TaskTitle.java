// isComment
package org.dmfs.opentaskspal.readdata;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.android.contentpal.projections.SingleColProjection;
import org.dmfs.optional.Optional;
import org.dmfs.optional.decorators.DelegatingOptional;
import org.dmfs.tasks.contract.TaskContract.Tasks;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingOptional<CharSequence> {

    public static final Projection<Tasks> isVariable = new SingleColProjection<>(isNameExpr.isFieldAccessExpr);

    public isConstructor(@NonNull RowDataSnapshot<Tasks> isParameter) {
        super(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isParameter -> isNameExpr));
    }
}
