// isComment
package org.dmfs.opentaskspal.tasks;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.RowData;
import org.dmfs.android.contentpal.rowdata.CharSequenceRowData;
import org.dmfs.android.contentpal.rowdata.DelegatingRowData;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingRowData<TaskContract.Tasks> {

    public isConstructor(@NonNull CharSequence isParameter) {
        // isComment
        super(new CharSequenceRowData<TaskContract.Tasks>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
    }
}
