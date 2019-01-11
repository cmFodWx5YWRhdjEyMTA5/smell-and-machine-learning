// isComment
package org.transdroid.daemon.task;

import org.transdroid.daemon.DaemonException;

/**
 * isComment
 */
public class isClassOrIsInterface extends DaemonTaskResult {

    private DaemonException isVariable;

    public isConstructor(DaemonTask isParameter, DaemonException isParameter) {
        super(isNameExpr, true);
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public DaemonException isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isMethod().isMethod();
    }
}
