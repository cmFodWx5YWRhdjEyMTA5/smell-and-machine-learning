// isComment
package com.vackosar.searchbasedlauncher.boundary;

import android.app.Activity;
import android.view.WindowManager;
import com.google.gson.annotations.Expose;
import com.google.inject.Inject;
import com.vackosar.searchbasedlauncher.entity.SelectAction;
import com.vackosar.searchbasedlauncher.entity.YesNo;
import java.io.Serializable;
import roboguice.inject.ContextSingleton;

@ContextSingleton
public class isClassOrIsInterface extends SelectAction<YesNo> implements Serializable {

    public static final YesNo isVariable = isNameExpr.isFieldAccessExpr;

    @Expose
    private YesNo isVariable = isNameExpr;

    @Inject
    private Activity isVariable;

    private void isMethod() {
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod();
    }

    @Override
    protected Enum<YesNo> isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Enum<YesNo> isParameter) {
        this.isFieldAccessExpr = (YesNo) isNameExpr;
        isMethod();
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
}
