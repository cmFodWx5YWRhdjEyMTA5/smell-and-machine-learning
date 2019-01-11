// isComment
package com.liato.bankdroid;

import com.liato.bankdroid.utils.LoggingUtils;
import android.app.Application;
import android.widget.Toast;

public class isClassOrIsInterface extends Application {

    private String isVariable = "isStringConstant";

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(this);
    }

    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr == null ? "isStringConstant" : isNameExpr;
    }

    public void isMethod() {
        if (!isNameExpr.isMethod()) {
            Toast isVariable = isNameExpr.isMethod(this, isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr = "isStringConstant";
            isNameExpr.isMethod();
        }
    }
}
