// isComment
package org.dmfs.opentaskspal.tables;

import android.accounts.Account;
import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Table;
import org.dmfs.android.contentpal.tables.AccountScoped;
import org.dmfs.android.contentpal.tables.DelegatingTable;
import org.dmfs.android.contentpal.tables.Synced;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingTable<TaskContract.TaskLists> {

    public isConstructor(@NonNull String isParameter) {
        // isComment
        super(new Synced<>(new AccountScoped<>(new Account(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr), new TaskListsTable(isNameExpr))));
    }
}
