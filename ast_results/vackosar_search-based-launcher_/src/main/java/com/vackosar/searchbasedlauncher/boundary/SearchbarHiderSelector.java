// isComment
package com.vackosar.searchbasedlauncher.boundary;

import android.view.View;
import android.widget.EditText;
import com.google.gson.annotations.Expose;
import com.vackosar.searchbasedlauncher.R;
import com.vackosar.searchbasedlauncher.entity.SelectAction;
import com.vackosar.searchbasedlauncher.entity.YesNo;
import roboguice.inject.InjectView;

public class isClassOrIsInterface extends SelectAction<YesNo> {

    public static final YesNo isVariable = isNameExpr.isFieldAccessExpr;

    @InjectView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    private EditText isVariable;

    @Expose
    private YesNo isVariable = isNameExpr;

    private void isMethod() {
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
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
