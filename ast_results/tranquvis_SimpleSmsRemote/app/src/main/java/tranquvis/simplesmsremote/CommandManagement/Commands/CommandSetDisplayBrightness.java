// isComment
package tranquvis.simplesmsremote.CommandManagement.Commands;

import android.content.Context;
import android.support.annotation.NonNull;
import tranquvis.simplesmsremote.CommandManagement.CommandExecResult;
import tranquvis.simplesmsremote.CommandManagement.CommandInstance;
import tranquvis.simplesmsremote.CommandManagement.Modules.Module;
import tranquvis.simplesmsremote.CommandManagement.Params.CommandParam;
import tranquvis.simplesmsremote.CommandManagement.Params.CommandParamNumber;
import tranquvis.simplesmsremote.R;
import tranquvis.simplesmsremote.Utils.Device.DisplayUtils;
import tranquvis.simplesmsremote.Utils.Regex.MatchType;
import tranquvis.simplesmsremote.Utils.Regex.PatternTreeNode;

/**
 * isComment
 */
public class isClassOrIsInterface extends Command {

    static final CommandParamNumber isVariable = new CommandParamNumber("isStringConstant");

    static final CommandParamBrightnessMode isVariable = new CommandParamBrightnessMode("isStringConstant");

    private static final String isVariable = isMethod("isStringConstant" + "isStringConstant");

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    public isConstructor(@NonNull Module isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        this.isFieldAccessExpr = new String[] { "isStringConstant" };
        this.isFieldAccessExpr = new PatternTreeNode("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr, new PatternTreeNode(isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr), new PatternTreeNode(isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr));
    }

    @Override
    public void isMethod(Context isParameter, CommandInstance isParameter, CommandExecResult isParameter) throws Exception {
        DisplayUtils.BrightnessMode isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else {
            float isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    private static class isClassOrIsInterface extends CommandParam<DisplayUtils.BrightnessMode> {

        private isConstructor(String isParameter) {
            super(isNameExpr);
        }

        @Override
        public DisplayUtils.BrightnessMode isMethod(String isParameter) throws Exception {
            if (isNameExpr.isMethod("isStringConstant"))
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            throw new IllegalArgumentException("isStringConstant");
        }
    }
}
