// isComment
package org.dmfs.opentaskspal.tasks;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.RowData;
import org.dmfs.android.contentpal.rowdata.DelegatingRowData;
import org.dmfs.opentaskspal.rowdata.DateTimeListData;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingRowData<TaskContract.Tasks> {

    public isConstructor(@NonNull Iterable<DateTime> isParameter) {
        super(new DateTimeListData<>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
    }
}
