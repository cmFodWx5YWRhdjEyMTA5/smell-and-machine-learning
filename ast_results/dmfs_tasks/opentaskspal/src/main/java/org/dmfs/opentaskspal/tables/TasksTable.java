// isComment
package org.dmfs.opentaskspal.tables;

import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Table;
import org.dmfs.android.contentpal.tables.BaseTable;
import org.dmfs.android.contentpal.tables.DelegatingTable;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingTable<TaskContract.Tasks> {

    public isConstructor(@NonNull String isParameter) {
        super(new BaseTable<TaskContract.Tasks>(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)));
    }
}
