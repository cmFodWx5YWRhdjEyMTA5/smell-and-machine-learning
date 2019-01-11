// isComment
package org.dmfs.opentaskspal.readdata;

import android.provider.BaseColumns;
import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.android.contentpal.projections.SingleColProjection;
import org.dmfs.jems.single.Single;
import org.dmfs.jems.single.decorators.DelegatingSingle;
import org.dmfs.jems.single.elementary.ValueSingle;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingSingle<Long> {

    public static final Projection<?> isVariable = new SingleColProjection<>(isNameExpr.isFieldAccessExpr);

    public isConstructor(@NonNull RowDataSnapshot<?> isParameter) {
        super(new ValueSingle<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, Long::valueOf).isMethod()));
    }
}
