// isComment
package org.dmfs.opentaskspal.views;

import android.database.Cursor;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.InsertOperation;
import org.dmfs.android.contentpal.Predicate;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowSnapshot;
import org.dmfs.android.contentpal.Table;
import org.dmfs.android.contentpal.UriParams;
import org.dmfs.android.contentpal.View;
import org.dmfs.opentaskspal.predicates.TaskOnList;
import org.dmfs.optional.Optional;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface implements View<TaskContract.Tasks> {

    private final View<TaskContract.Tasks> isVariable;

    private final RowSnapshot<TaskContract.TaskLists> isVariable;

    public isConstructor(@NonNull RowSnapshot<TaskContract.TaskLists> isParameter, @NonNull View<TaskContract.Tasks> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @NonNull
    @Override
    public Cursor isMethod(@NonNull UriParams isParameter, @NonNull Projection<TaskContract.Tasks> isParameter, @NonNull Predicate isParameter, @NonNull Optional<String> isParameter) throws RemoteException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, new TaskOnList(isNameExpr, isNameExpr), isNameExpr);
    }

    @NonNull
    @Override
    public Table<TaskContract.Tasks> isMethod() {
        return new org.dmfs.opentaskspal.tables.TaskListScoped(isNameExpr, isNameExpr.isMethod());
    }
}
