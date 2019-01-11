// isComment
package com.biglybt.android.client.adapter;

import java.util.Map;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * isComment
 */
public class isClassOrIsInterface extends FilesAdapterItemFile {

    isConstructor(int isParameter, @Nullable FilesAdapterItemFolder isParameter, String isParameter, String isParameter, boolean isParameter, Map<String, Object> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public int isMethod(@NonNull FilesAdapterItem isParameter) {
        if (!(isNameExpr instanceof FilesAdapterItemFile)) {
            return super.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr, ((FilesAdapterItemFile) isNameExpr).isFieldAccessExpr);
    }
}
