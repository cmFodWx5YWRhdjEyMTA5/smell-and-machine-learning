// isComment
package com.owncloud.android.datastorage.providers;

import android.text.TextUtils;
import com.owncloud.android.datastorage.StoragePoint;
import java.util.List;
import java.util.Vector;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractStoragePointProvider {

    private static final String isVariable = "isStringConstant";

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public List<StoragePoint> isMethod() {
        List<StoragePoint> isVariable = new Vector<>();
        isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    private void isMethod(List<StoragePoint> isParameter, String isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            for (String isVariable : isNameExpr.isMethod("isStringConstant")) {
                if (isMethod(isNameExpr, isNameExpr)) {
                    isNameExpr.isMethod(new StoragePoint(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                }
            }
        }
    }
}
