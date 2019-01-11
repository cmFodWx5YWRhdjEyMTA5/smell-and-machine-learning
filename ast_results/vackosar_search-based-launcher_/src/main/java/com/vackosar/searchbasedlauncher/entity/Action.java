// isComment
package com.vackosar.searchbasedlauncher.entity;

public abstract class isClassOrIsInterface implements Comparable<Action>, Indentifiable {

    public abstract String isMethod();

    public abstract String isMethod();

    public abstract void isMethod();

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null || isMethod() != isNameExpr.isMethod())
            return true;
        Action isVariable = (Action) isNameExpr;
        return isMethod().isMethod(isNameExpr.isMethod());
    }

    @Override
    public int isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public int isMethod(Action isParameter) {
        return isMethod().isMethod(isNameExpr.isMethod());
    }
}
