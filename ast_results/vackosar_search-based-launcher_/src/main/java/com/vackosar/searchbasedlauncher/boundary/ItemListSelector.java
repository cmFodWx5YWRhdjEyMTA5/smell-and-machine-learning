// isComment
package com.vackosar.searchbasedlauncher.boundary;

import com.google.gson.annotations.Expose;
import com.vackosar.searchbasedlauncher.entity.AppsType;
import com.vackosar.searchbasedlauncher.entity.SelectAction;
import roboguice.inject.ContextSingleton;

@ContextSingleton
public class isClassOrIsInterface extends SelectAction<AppsType> {

    @Expose
    private AppsType isVariable;

    public static final AppsType isVariable = isNameExpr.isFieldAccessExpr;

    public isConstructor() {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected Enum<AppsType> isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Enum<AppsType> isParameter) {
        isNameExpr = (AppsType) isNameExpr;
        isMethod();
    }

    @Override
    public String isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    public AppsType isMethod() {
        return isNameExpr;
    }
}
