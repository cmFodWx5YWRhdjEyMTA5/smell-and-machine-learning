// isComment
package org.tint.addons.executors;

import org.tint.addons.framework.Action;
import org.tint.addons.framework.ShowDialogAction;
import org.tint.utils.ApplicationUtils;

public class isClassOrIsInterface extends BaseActionExecutor {

    private ShowDialogAction isVariable;

    @Override
    protected void isMethod(Action isParameter) {
        isNameExpr = (ShowDialogAction) isNameExpr;
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
    }
}
