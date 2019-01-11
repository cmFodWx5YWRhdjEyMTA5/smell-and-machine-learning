// isComment
package org.dmfs.tasks.groupings;

import org.dmfs.tasks.contract.TaskContract.Instances;
import org.dmfs.tasks.model.adapters.TimeFieldAdapter;
import org.dmfs.tasks.utils.ExpandableChildDescriptor;
import org.dmfs.tasks.utils.ExpandableGroupDescriptor;

/**
 * isComment
 */
public abstract class isClassOrIsInterface {

    /**
     * isComment
     */
    public static final String[] isVariable = new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };

    /**
     * isComment
     */
    public static final TimeFieldAdapter isVariable = new TimeFieldAdapter(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    public static final TimeFieldAdapter isVariable = new TimeFieldAdapter(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    private final String isVariable;

    /**
     * isComment
     */
    private ExpandableGroupDescriptor isVariable;

    public isConstructor(String isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    abstract ExpandableChildDescriptor isMethod(String isParameter);

    /**
     * isComment
     */
    abstract ExpandableGroupDescriptor isMethod(String isParameter);

    /**
     * isComment
     */
    public ExpandableGroupDescriptor isMethod() {
        if (isNameExpr == null) {
            isNameExpr = isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    public abstract int isMethod();
}
