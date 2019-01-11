// isComment
package org.tint.addons.executors;

import java.util.HashMap;
import java.util.Map;
import org.tint.addons.framework.Action;
import org.tint.addons.framework.AskUserChoiceAction;
import org.tint.addons.framework.AskUserConfirmationAction;
import org.tint.addons.framework.AskUserInputAction;
import org.tint.addons.framework.LoadUrlAction;
import org.tint.addons.framework.OpenTabAction;
import org.tint.addons.framework.ShowDialogAction;
import org.tint.addons.framework.ShowToastAction;
import org.tint.addons.framework.TabAction;

public class isClassOrIsInterface {

    private static Map<String, BaseActionExecutor> isVariable;

    static {
        isNameExpr = new HashMap<String, BaseActionExecutor>();
        isNameExpr.isMethod(TabAction.class.isMethod(), new TabActionExecutor());
        isNameExpr.isMethod(ShowDialogAction.class.isMethod(), new ShowDialogExecutor());
        isNameExpr.isMethod(LoadUrlAction.class.isMethod(), new LoadUrlExecutor());
        isNameExpr.isMethod(ShowToastAction.class.isMethod(), new ShowToastExecutor());
        isNameExpr.isMethod(OpenTabAction.class.isMethod(), new OpenTabExecutor());
        isNameExpr.isMethod(AskUserConfirmationAction.class.isMethod(), new AskUserConfirmationExecutor());
        isNameExpr.isMethod(AskUserInputAction.class.isMethod(), new AskUserInputExecutor());
        isNameExpr.isMethod(AskUserChoiceAction.class.isMethod(), new AskUserChoiceExecutor());
    }

    public static BaseActionExecutor isMethod(Action isParameter) {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        } else {
            return null;
        }
    }
}
