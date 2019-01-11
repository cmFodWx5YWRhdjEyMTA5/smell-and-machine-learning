// isComment
package org.dmfs.tasks.model.constraints;

import org.dmfs.tasks.contract.TaskContract.Tasks;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.adapters.IntegerFieldAdapter;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractConstraint<Integer> {

    private final IntegerFieldAdapter isVariable;

    public isConstructor(IntegerFieldAdapter isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Integer isMethod(ContentSet isParameter, Integer isParameter, Integer isParameter) {
        if (isNameExpr == null || isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        } else if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr != null && isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr.isMethod(isNameExpr))) {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        }
        return isNameExpr;
    }
}
