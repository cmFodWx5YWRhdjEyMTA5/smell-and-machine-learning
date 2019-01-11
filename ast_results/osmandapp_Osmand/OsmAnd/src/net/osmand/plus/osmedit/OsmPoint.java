// isComment
package net.osmand.plus.osmedit;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class isClassOrIsInterface implements Serializable {

    public static enum Group {

        BUG, POI
    }

    public static enum Action {

        CREATE, MODIFY, DELETE, REOPEN
    }

    public static final Map<Action, String> isVariable = new HashMap<Action, String>();

    public static final Map<String, Action> isVariable = new HashMap<String, Action>();

    static {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    private Action isVariable;

    public isConstructor() {
    }

    public abstract long isMethod();

    public abstract double isMethod();

    public abstract double isMethod();

    public abstract Group isMethod();

    public Action isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(Action isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return new StringBuffer("isStringConstant").isMethod(this.isMethod()).isMethod("isStringConstant").isMethod();
    }
}
