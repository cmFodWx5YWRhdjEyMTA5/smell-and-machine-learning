// isComment
package org.mosspaper.objects;

import org.mosspaper.Env;
import org.mosspaper.objects.ProcList.Proc;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public abstract class isClassOrIsInterface extends AbsMossObject implements MossObject {

    public isConstructor(String isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr) - isIntegerConstant;
    }

    public abstract Comparator isMethod();

    public abstract void isMethod(List<Proc> isParameter);

    public abstract List<Proc> isMethod();

    public DataProvider isMethod() {
        return this.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Env isParameter) {
        if (isMethod() != null) {
            return;
        }
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isMethod(), isMethod());
        isNameExpr.isMethod(isMethod());
    }

    @Override
    public void isMethod(Env isParameter) {
        isMethod(null);
    }

    @Override
    public String isMethod() {
        if (null == isMethod()) {
            return "isStringConstant";
        }
        if (isMethod().isMethod() <= isNameExpr) {
            return "isStringConstant";
        }
        Proc isVariable = isMethod().isMethod(isNameExpr);
        if (null == isNameExpr) {
            return "isStringConstant";
        }
        if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        } else if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        } else {
            return "isStringConstant";
        }
    }

    protected String isVariable;

    protected int isVariable;

    static ProcList isVariable = isNameExpr.isFieldAccessExpr;
}
