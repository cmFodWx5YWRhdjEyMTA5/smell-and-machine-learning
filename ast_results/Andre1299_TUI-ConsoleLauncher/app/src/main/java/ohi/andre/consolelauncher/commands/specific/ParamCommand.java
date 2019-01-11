// isComment
package ohi.andre.consolelauncher.commands.specific;

import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.main.MainPack;
import ohi.andre.consolelauncher.commands.main.Param;
import ohi.andre.consolelauncher.managers.xml.classes.XMLPrefsSave;
import ohi.andre.consolelauncher.tuils.SimpleMutableEntry;
import ohi.andre.consolelauncher.tuils.Tuils;

public abstract class isClassOrIsInterface implements CommandAbstraction {

    @Override
    public final int[] isMethod() {
        return new int[] { isNameExpr.isFieldAccessExpr };
    }

    @Override
    public final String isMethod(ExecutePack isParameter) throws Exception {
        String isVariable = isMethod(isNameExpr);
        if (isNameExpr != null)
            return isNameExpr;
        Param isVariable = isNameExpr.isMethod(Param.class);
        if (isNameExpr == null) {
            Object isVariable = isNameExpr.isMethod(Object.class, isIntegerConstant);
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + isNameExpr.isFieldAccessExpr + (isNameExpr != null ? isNameExpr.isMethod() : "isStringConstant");
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    public SimpleMutableEntry<Boolean, Param> isMethod(MainPack isParameter, String isParameter) {
        Param isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr == null && isMethod() != null) {
            return new SimpleMutableEntry<>(true, isMethod(isNameExpr, isMethod(isNameExpr)));
        }
        return new SimpleMutableEntry<>(true, isNameExpr);
    }

    public String isMethod(MainPack isParameter) {
        String isVariable = isNameExpr.isFieldAccessExpr.isMethod(isMethod());
        if (!isNameExpr.isMethod("isStringConstant"))
            isNameExpr = "isStringConstant" + isNameExpr;
        return isNameExpr;
    }

    @Override
    public String isMethod(ExecutePack isParameter, int isParameter) {
        return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
    }

    @Override
    public String isMethod(ExecutePack isParameter, int isParameter) {
        if (isNameExpr == isIntegerConstant) {
            String isVariable = isNameExpr.isMethod(String.class, isIntegerConstant);
            if (isNameExpr.isMethod() == isIntegerConstant)
                return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + isNameExpr.isFieldAccessExpr + isNameExpr;
        }
        return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
    }

    public abstract String[] isMethod();

    protected abstract Param isMethod(MainPack isParameter, String isParameter);

    protected abstract String isMethod(ExecutePack isParameter);

    public XMLPrefsSave isMethod() {
        return null;
    }
}
