// isComment
package tranquvis.simplesmsremote.CommandManagement.Commands;

import android.content.Context;
import android.support.annotation.Nullable;
import tranquvis.simplesmsremote.CommandManagement.CommandExecResult;
import tranquvis.simplesmsremote.CommandManagement.CommandInstance;
import tranquvis.simplesmsremote.CommandManagement.Modules.Module;
import tranquvis.simplesmsremote.CommandManagement.Params.CommandParamOnOff;
import tranquvis.simplesmsremote.R;
import tranquvis.simplesmsremote.Utils.Device.BluetoothUtils;
import tranquvis.simplesmsremote.Utils.Regex.MatchType;
import tranquvis.simplesmsremote.Utils.Regex.PatternTreeNode;

/**
 * isComment
 */
public class isClassOrIsInterface extends Command {

    static final CommandParamOnOff isVariable = new CommandParamOnOff("isStringConstant");

    private static final String isVariable = isMethod(isNameExpr, "isStringConstant");

    public isConstructor(@Nullable Module isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        this.isFieldAccessExpr = new String[] { "isStringConstant", "isStringConstant" };
        this.isFieldAccessExpr = new PatternTreeNode(isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(Context isParameter, CommandInstance isParameter, CommandExecResult isParameter) throws Exception {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
