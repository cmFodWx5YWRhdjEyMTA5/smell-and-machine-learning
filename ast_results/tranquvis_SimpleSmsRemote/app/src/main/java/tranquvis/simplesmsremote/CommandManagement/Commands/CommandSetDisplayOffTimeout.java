// isComment
package tranquvis.simplesmsremote.CommandManagement.Commands;

import android.content.Context;
import android.support.annotation.NonNull;
import tranquvis.simplesmsremote.CommandManagement.CommandExecResult;
import tranquvis.simplesmsremote.CommandManagement.CommandInstance;
import tranquvis.simplesmsremote.CommandManagement.Modules.Module;
import tranquvis.simplesmsremote.CommandManagement.Params.CommandParamNumber;
import tranquvis.simplesmsremote.CommandManagement.Params.CommandParamUnit;
import tranquvis.simplesmsremote.R;
import tranquvis.simplesmsremote.Utils.Device.DisplayUtils;
import tranquvis.simplesmsremote.Utils.Regex.MatchType;
import tranquvis.simplesmsremote.Utils.Regex.PatternTreeNode;
import tranquvis.simplesmsremote.Utils.UnitTools.Unit;
import tranquvis.simplesmsremote.Utils.UnitTools.UnitType;

/**
 * isComment
 */
public class isClassOrIsInterface extends Command {

    static final CommandParamNumber isVariable = new CommandParamNumber("isStringConstant");

    static final CommandParamUnit isVariable = new CommandParamUnit("isStringConstant");

    private static final String isVariable = isMethod("isStringConstant");

    public isConstructor(@NonNull Module isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        this.isFieldAccessExpr = new String[] { "isStringConstant" };
        this.isFieldAccessExpr = new PatternTreeNode("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr, new PatternTreeNode(isNameExpr.isMethod(), "isStringConstant", isNameExpr.isFieldAccessExpr), new PatternTreeNode(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr));
    }

    @Override
    public void isMethod(Context isParameter, CommandInstance isParameter, CommandExecResult isParameter) throws Exception {
        float isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        Unit isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = (int) (isNameExpr * isNameExpr.isMethod() * isDoubleConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
