// isComment
package ohi.andre.consolelauncher.commands.main.raw;

import java.io.File;
import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.main.MainPack;
import ohi.andre.consolelauncher.managers.FileManager;
import ohi.andre.consolelauncher.tuils.Tuils;

public class isClassOrIsInterface implements CommandAbstraction {

    @Override
    public String isMethod(ExecutePack isParameter) {
        MainPack isVariable = (MainPack) isNameExpr;
        File isVariable = isNameExpr.isMethod(File.class);
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr)
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr)
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
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
    public String isMethod(ExecutePack isParameter, int isParameter) {
        MainPack isVariable = (MainPack) isNameExpr;
        return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
    }

    @Override
    public String isMethod(ExecutePack isParameter, int isParameter) {
        MainPack isVariable = (MainPack) isNameExpr;
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
