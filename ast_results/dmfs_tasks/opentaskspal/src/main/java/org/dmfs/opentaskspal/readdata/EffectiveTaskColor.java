// isComment
package org.dmfs.opentaskspal.readdata;

import android.support.annotation.NonNull;
import org.dmfs.android.bolts.color.Color;
import org.dmfs.android.bolts.color.colors.DelegatingColor;
import org.dmfs.android.bolts.color.elementary.SingleColor;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.android.contentpal.projections.MultiProjection;
import org.dmfs.jems.single.combined.Backed;
import org.dmfs.opentaskspal.readdata.functions.StringToColor;
import org.dmfs.tasks.contract.TaskContract;
import org.dmfs.tasks.contract.TaskContract.Tasks;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingColor {

    public static final Projection<Tasks> isVariable = new MultiProjection<>(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    public isConstructor(@NonNull RowDataSnapshot<TaskContract.Tasks> isParameter) {
        super(new SingleColor(new Backed<Color>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr), () -> isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod())));
    }
}
