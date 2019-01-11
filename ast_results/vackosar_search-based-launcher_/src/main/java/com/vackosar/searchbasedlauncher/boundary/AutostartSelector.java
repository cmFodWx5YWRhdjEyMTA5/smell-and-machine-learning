// isComment
package com.vackosar.searchbasedlauncher.boundary;

import com.google.gson.annotations.Expose;
import com.vackosar.searchbasedlauncher.entity.SelectAction;
import com.vackosar.searchbasedlauncher.entity.YesNo;
import java.io.Serializable;
import roboguice.inject.ContextSingleton;

@ContextSingleton
public class isClassOrIsInterface extends SelectAction<YesNo> implements Serializable {

    @Expose
    private YesNo isVariable;

    public isConstructor() {
        isNameExpr = isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected Enum<YesNo> isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Enum<YesNo> isParameter) {
        this.isFieldAccessExpr = (YesNo) isNameExpr;
        isMethod();
    }

    public boolean isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
