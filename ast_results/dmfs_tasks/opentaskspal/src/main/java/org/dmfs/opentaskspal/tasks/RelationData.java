// isComment
package org.dmfs.opentaskspal.tasks;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.RowData;
import org.dmfs.android.contentpal.RowSnapshot;
import org.dmfs.android.contentpal.rowdata.CharSequenceRowData;
import org.dmfs.android.contentpal.rowdata.Composite;
import org.dmfs.android.contentpal.rowdata.DelegatingRowData;
import org.dmfs.android.contentpal.rowdata.RawRowData;
import org.dmfs.android.contentpal.rowdata.Referring;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingRowData<TaskContract.Properties> {

    public isConstructor(@NonNull RowSnapshot<TaskContract.Tasks> isParameter, int isParameter, @NonNull RowSnapshot<TaskContract.Tasks> isParameter) {
        super(new Composite<>(new Referring<TaskContract.Properties>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), new RawRowData<TaskContract.Properties>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), new Referring<TaskContract.Properties>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr)));
    }

    public isConstructor(@NonNull RowSnapshot<TaskContract.Tasks> isParameter, int isParameter, @NonNull CharSequence isParameter) {
        super(new Composite<>(new Referring<TaskContract.Properties>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), new RawRowData<TaskContract.Properties>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), new CharSequenceRowData<TaskContract.Properties>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr)));
    }
}
