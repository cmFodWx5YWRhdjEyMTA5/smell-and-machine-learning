// isComment
package tranquvis.simplesmsremote.CommandManagement.Commands;

import android.content.Context;
import android.support.annotation.NonNull;
import tranquvis.simplesmsremote.CommandManagement.CommandExecResult;
import tranquvis.simplesmsremote.CommandManagement.CommandInstance;
import tranquvis.simplesmsremote.CommandManagement.Modules.Module;
import tranquvis.simplesmsremote.R;
import tranquvis.simplesmsremote.Utils.Device.DisplayUtils;
import tranquvis.simplesmsremote.Utils.Regex.MatchType;
import tranquvis.simplesmsremote.Utils.Regex.PatternTreeNode;

/**
 * isComment
 */
public class isClassOrIsInterface extends Command {

    private static final String isVariable = isMethod("isStringConstant");

    public isConstructor(@NonNull Module isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        this.isFieldAccessExpr = new String[] { "isStringConstant" };
        this.isFieldAccessExpr = new PatternTreeNode("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(Context isParameter, CommandInstance isParameter, CommandExecResult isParameter) throws Exception {
        float isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        String isVariable;
        if (isNameExpr < isIntegerConstant)
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr);
        else if (isNameExpr < isIntegerConstant)
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr / isDoubleConstant));
        else
            isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr / isDoubleConstant);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
        isNameExpr.isMethod(true);
    }
}
