// isComment
package com.vuze.android.remote.adapter;

import java.util.List;
import java.util.Map;
import com.vuze.android.remote.AndroidUtils;
import com.vuze.android.remote.session.Session;
import com.vuze.android.remote.TransmissionVars;
import com.vuze.util.MapUtils;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class isClassOrIsInterface extends FilesAdapterDisplayObject {

    final int isVariable;

    @SuppressWarnings({ "isStringConstant", "isStringConstant" })
    public isConstructor(int isParameter, int isParameter, @Nullable FilesAdapterDisplayFolder isParameter, Map isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr, true);
    }

    @Nullable
    public Map<?, ?> isMethod(Session isParameter, long isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        Map<?, ?> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        List<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null);
        if (isNameExpr == null || isNameExpr >= isNameExpr.isMethod()) {
            return null;
        }
        return (Map<?, ?>) isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public int isMethod(@NonNull FilesAdapterDisplayObject isParameter) {
        if (!(isNameExpr instanceof FilesAdapterDisplayFile)) {
            return super.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr, ((FilesAdapterDisplayFile) isNameExpr).isFieldAccessExpr);
    }
}
