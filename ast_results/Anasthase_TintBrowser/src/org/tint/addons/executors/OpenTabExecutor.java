// isComment
package org.tint.addons.executors;

import org.tint.addons.framework.Action;
import org.tint.addons.framework.OpenTabAction;
import android.text.TextUtils;

public class isClassOrIsInterface extends BaseActionExecutor {

    private OpenTabAction isVariable;

    @Override
    protected void isMethod(Action isParameter) {
        isNameExpr = (OpenTabAction) isNameExpr;
    }

    @Override
    protected void isMethod() {
        String isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(true, true);
        } else {
            isNameExpr.isMethod(isNameExpr, true, true);
        }
    }
}
