// isComment
package org.dmfs.opentaskspal.tables;

import android.content.ContentProviderClient;
import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.InsertOperation;
import org.dmfs.android.contentpal.Operation;
import org.dmfs.android.contentpal.Predicate;
import org.dmfs.android.contentpal.RowSnapshot;
import org.dmfs.android.contentpal.Table;
import org.dmfs.android.contentpal.UriParams;
import org.dmfs.android.contentpal.View;
import org.dmfs.opentaskspal.operations.TaskListTask;
import org.dmfs.opentaskspal.predicates.TaskOnList;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Table<TaskContract.Tasks> {

    private final Table<TaskContract.Tasks> isVariable;

    private final RowSnapshot<TaskContract.TaskLists> isVariable;

    public isConstructor(@NonNull RowSnapshot<TaskContract.TaskLists> isParameter, @NonNull Table<TaskContract.Tasks> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @NonNull
    @Override
    public InsertOperation<TaskContract.Tasks> isMethod(@NonNull UriParams isParameter) {
        return new TaskListTask(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @NonNull
    @Override
    public Operation<TaskContract.Tasks> isMethod(@NonNull UriParams isParameter, @NonNull Predicate isParameter) {
        return isNameExpr.isMethod(isNameExpr, new TaskOnList(isNameExpr, isNameExpr));
    }

    @NonNull
    @Override
    public Operation<TaskContract.Tasks> isMethod(@NonNull UriParams isParameter, @NonNull Predicate isParameter) {
        return isNameExpr.isMethod(isNameExpr, new TaskOnList(isNameExpr, isNameExpr));
    }

    @NonNull
    @Override
    public Operation<TaskContract.Tasks> isMethod(@NonNull UriParams isParameter, @NonNull Predicate isParameter) {
        return isNameExpr.isMethod(isNameExpr, new TaskOnList(isNameExpr, isNameExpr));
    }

    public View<TaskContract.Tasks> isMethod(@NonNull ContentProviderClient isParameter) {
        return new org.dmfs.opentaskspal.views.TaskListScoped(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }
}
