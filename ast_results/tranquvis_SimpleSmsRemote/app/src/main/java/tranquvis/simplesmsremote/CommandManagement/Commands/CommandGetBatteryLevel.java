// isComment
package tranquvis.simplesmsremote.CommandManagement.Commands;

import android.content.Context;
import android.support.annotation.Nullable;
import tranquvis.simplesmsremote.CommandManagement.CommandExecResult;
import tranquvis.simplesmsremote.CommandManagement.CommandInstance;
import tranquvis.simplesmsremote.CommandManagement.Modules.Module;
import tranquvis.simplesmsremote.R;
import tranquvis.simplesmsremote.Utils.Device.BatteryUtils;
import tranquvis.simplesmsremote.Utils.Regex.MatchType;
import tranquvis.simplesmsremote.Utils.Regex.PatternTreeNode;

public class isClassOrIsInterface extends Command {

    private static final String isVariable = isMethod("isStringConstant");

    public isConstructor(@Nullable Module isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        this.isFieldAccessExpr = new String[] { "isStringConstant" };
        this.isFieldAccessExpr = new PatternTreeNode("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(Context isParameter, CommandInstance isParameter, CommandExecResult isParameter) throws Exception {
        float isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr * isIntegerConstant));
        isNameExpr.isMethod(true);
    }
}
