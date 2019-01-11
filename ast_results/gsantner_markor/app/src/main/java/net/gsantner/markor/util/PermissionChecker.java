// isComment
package net.gsantner.markor.util;

import android.app.Activity;
import net.gsantner.markor.R;
import net.gsantner.opoc.util.ActivityUtils;

public class isClassOrIsInterface extends net.gsantner.opoc.util.PermissionChecker {

    public isConstructor(Activity isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(String... isParameter) {
        return super.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Override
    public boolean isMethod(int isParameter, String[] isParameter, int[] isParameter) {
        boolean isVariable = super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (!isNameExpr) {
            new ActivityUtils(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        }
        return isNameExpr;
    }

    public boolean isMethod() {
        return super.isMethod(isNameExpr.isMethod().isMethod());
    }
}
