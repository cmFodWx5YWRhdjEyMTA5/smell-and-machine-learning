// isComment
package org.dmfs.opentaskspal.predicates;

import org.dmfs.android.contentpal.Predicate;
import org.dmfs.android.contentpal.RowSnapshot;
import org.dmfs.android.contentpal.predicates.AllOf;
import org.dmfs.android.contentpal.predicates.DelegatingPredicate;
import org.dmfs.android.contentpal.predicates.ReferringTo;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingPredicate {

    public isConstructor(RowSnapshot<TaskContract.TaskLists> isParameter, Predicate isParameter) {
        super(new AllOf(isNameExpr, new ReferringTo<>(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr)));
    }
}
