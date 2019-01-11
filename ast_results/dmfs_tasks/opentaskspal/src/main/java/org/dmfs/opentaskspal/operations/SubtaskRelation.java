// isComment
package org.dmfs.opentaskspal.operations;

import android.content.ContentProviderOperation;
import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.InsertOperation;
import org.dmfs.android.contentpal.Operation;
import org.dmfs.android.contentpal.RowSnapshot;
import org.dmfs.android.contentpal.SoftRowReference;
import org.dmfs.android.contentpal.TransactionContext;
import org.dmfs.android.contentpal.operations.Insert;
import org.dmfs.opentaskspal.tables.PropertiesTable;
import org.dmfs.opentaskspal.tasks.ParentTaskRelationData;
import org.dmfs.optional.Optional;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface implements InsertOperation<TaskContract.Properties> {

    private final Operation<TaskContract.Properties> isVariable;

    public isConstructor(String isParameter, RowSnapshot<TaskContract.Tasks> isParameter, RowSnapshot<TaskContract.Tasks> isParameter) {
        isNameExpr = new Insert<>(new PropertiesTable(isNameExpr), new ParentTaskRelationData(isNameExpr, isNameExpr));
    }

    @NonNull
    @Override
    public Optional<SoftRowReference<TaskContract.Properties>> isMethod() {
        return isNameExpr.isMethod();
    }

    @NonNull
    @Override
    public ContentProviderOperation.Builder isMethod(@NonNull TransactionContext isParameter) throws UnsupportedOperationException {
        return isNameExpr.isMethod(isNameExpr);
    }
}
