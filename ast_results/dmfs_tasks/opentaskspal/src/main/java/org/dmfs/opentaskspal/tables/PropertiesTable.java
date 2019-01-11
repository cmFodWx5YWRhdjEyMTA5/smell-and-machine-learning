// isComment
package org.dmfs.opentaskspal.tables;

import org.dmfs.android.contentpal.Table;
import org.dmfs.android.contentpal.tables.BaseTable;
import org.dmfs.android.contentpal.tables.DelegatingTable;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingTable<TaskContract.Properties> {

    public isConstructor(String isParameter) {
        super(new BaseTable<TaskContract.Properties>(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)));
    }
}
