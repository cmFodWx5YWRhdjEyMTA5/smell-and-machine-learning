// isComment
package org.dmfs.opentaskspal.predicates;

import org.dmfs.android.contentpal.Predicate;
import org.dmfs.android.contentpal.predicates.DelegatingPredicate;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingPredicate {

    public isConstructor() {
        super(new IsProperty(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr));
    }
}
