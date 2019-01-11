// isComment
package com.spazedog.mounts2sd.tools;

import java.util.ArrayList;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class isClassOrIsInterface extends FragmentActivity {

    private static final ArrayList<String> isVariable = new ArrayList<String>();

    private static final Object isVariable = new Object();

    private Boolean isVariable = true;

    @Override
    public void isMethod(Bundle isParameter) {
        isNameExpr.isMethod("isStringConstant", true);
        super.isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod("isStringConstant");
        }
        synchronized (isNameExpr) {
            isNameExpr.isMethod((isNameExpr ? isNameExpr.isMethod() : isIntegerConstant), this.isMethod().isMethod());
        }
    }

    @Override
    protected void isMethod() {
        synchronized (isNameExpr) {
            isNameExpr.isMethod(this.isMethod().isMethod());
        }
        super.isMethod();
    }

    public final Boolean isMethod() {
        synchronized (isNameExpr) {
            return isNameExpr.isMethod() == isIntegerConstant || isNameExpr.isMethod(isIntegerConstant).isMethod(this.isMethod().isMethod());
        }
    }

    public final Boolean isMethod() {
        return isNameExpr;
    }
}
