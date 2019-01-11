// isComment
package org.dmfs.opentaskspal.rowsets;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowReference;
import org.dmfs.android.contentpal.RowSet;
import org.dmfs.android.contentpal.View;
import org.dmfs.android.contentpal.predicates.ReferringTo;
import org.dmfs.android.contentpal.rowsets.DelegatingRowSet;
import org.dmfs.android.contentpal.rowsets.QueryRowSet;
import org.dmfs.tasks.contract.TaskContract.Tasks;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingRowSet<Tasks> {

    public isConstructor(@NonNull View<Tasks> isParameter, @NonNull Projection isParameter, @NonNull RowReference<Tasks> isParameter) {
        super(new QueryRowSet<>(isNameExpr, isNameExpr, new ReferringTo<>(isNameExpr.isFieldAccessExpr, isNameExpr)));
    }
}
