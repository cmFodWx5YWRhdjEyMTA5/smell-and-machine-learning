// isComment
package com.owncloud.android.datastorage.providers;

import com.owncloud.android.datastorage.StoragePoint;
import java.util.Vector;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractStoragePointProvider {

    private static final String[] isVariable = { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" };

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Vector<StoragePoint> isMethod() {
        Vector<StoragePoint> isVariable = new Vector<>();
        for (String isVariable : isNameExpr) {
            if (isMethod(isNameExpr, isNameExpr)) {
                isNameExpr.isMethod(new StoragePoint(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            }
        }
        return isNameExpr;
    }
}
