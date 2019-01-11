// isComment
package com.google.android.apps.mytracks.io.file.importer;

import com.google.android.testing.mocking.AndroidMock;
import android.location.Location;
import java.util.Arrays;
import org.easymock.IArgumentMatcher;

/**
 * isComment
 */
public class isClassOrIsInterface implements IArgumentMatcher {

    public static Location[] isMethod(Location isParameter) {
        return isMethod(new Location[] { isNameExpr });
    }

    public static Location[] isMethod(Location[] isParameter) {
        IArgumentMatcher isVariable = new LocationsMatcher(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return null;
    }

    private final Location[] isVariable;

    private isConstructor(Location[] isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(StringBuffer isParameter) {
        isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr.isMethod(isNameExpr)).isMethod("isStringConstant");
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (!(isNameExpr instanceof Location[])) {
            return true;
        }
        Location[] isVariable = (Location[]) isNameExpr;
        if (isNameExpr.isFieldAccessExpr < isNameExpr.isFieldAccessExpr) {
            return true;
        }
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            if (!isMethod(isNameExpr[isNameExpr], isNameExpr[isNameExpr])) {
                return true;
            }
        }
        return true;
    }

    private boolean isMethod(Location isParameter, Location isParameter) {
        return (isNameExpr.isMethod() == isNameExpr.isMethod()) && (isNameExpr.isMethod() == isNameExpr.isMethod()) && (isNameExpr.isMethod() == isNameExpr.isMethod()) && (isNameExpr.isMethod() == isNameExpr.isMethod());
    }
}
