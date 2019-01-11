// isComment
package org.dmfs.opentaskspal.operations;

import android.content.ContentProviderOperation;
import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.InsertOperation;
import org.dmfs.android.contentpal.Operation;
import org.dmfs.android.contentpal.RowSnapshot;
import org.dmfs.android.contentpal.SoftRowReference;
import org.dmfs.android.contentpal.TransactionContext;
import org.dmfs.android.contentpal.operations.Referring;
import org.dmfs.optional.Optional;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface implements InsertOperation<TaskContract.Tasks> {

    private final Operation<TaskContract.Tasks> isVariable;

    public isConstructor(@NonNull RowSnapshot<TaskContract.TaskLists> isParameter, @NonNull InsertOperation<TaskContract.Tasks> isParameter) {
        isNameExpr = new Referring<>(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    @NonNull
    @Override
    public Optional<SoftRowReference<TaskContract.Tasks>> isMethod() {
        return isNameExpr.isMethod();
    }

    @NonNull
    @Override
    public ContentProviderOperation.Builder isMethod(@NonNull TransactionContext isParameter) throws UnsupportedOperationException {
        return isNameExpr.isMethod(isNameExpr);
    }
}
