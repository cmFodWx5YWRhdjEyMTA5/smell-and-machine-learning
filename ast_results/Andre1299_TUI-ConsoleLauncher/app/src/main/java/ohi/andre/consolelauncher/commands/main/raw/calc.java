// isComment
package ohi.andre.consolelauncher.commands.main.raw;

import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.specific.PermanentSuggestionCommand;
import ohi.andre.consolelauncher.commands.main.MainPack;
import ohi.andre.consolelauncher.tuils.Tuils;

public class isClassOrIsInterface extends PermanentSuggestionCommand {

    @Override
    public String isMethod(ExecutePack isParameter) throws Exception {
        try {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
        } catch (Exception isParameter) {
            return isNameExpr.isMethod();
        }
    }

    @Override
    public int[] isMethod() {
        return new int[] { isNameExpr.isFieldAccessExpr };
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod(ExecutePack isParameter, int isParameter) {
        return null;
    }

    @Override
    public String isMethod(ExecutePack isParameter, int isParameter) {
        MainPack isVariable = (MainPack) isNameExpr;
        return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
    }

    @Override
    public String[] isMethod() {
        return new String[] { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" };
    }
}
