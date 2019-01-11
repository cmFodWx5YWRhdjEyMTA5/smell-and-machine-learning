// isComment
package net.gsantner.markor.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import net.gsantner.markor.R;
import net.gsantner.opoc.activity.GsFragmentBase;

public class isClassOrIsInterface extends GsFragmentBase {

    public static final String isVariable = "isStringConstant";

    public static MoreFragment isMethod() {
        return new MoreFragment();
    }

    public isConstructor() {
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(@NonNull View isParameter, Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        MoreInfoFragment isVariable;
        if (isNameExpr == null) {
            FragmentTransaction isVariable = isMethod().isMethod();
            isNameExpr = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
        } else {
            isNameExpr = (MoreInfoFragment) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        }
    }
}
