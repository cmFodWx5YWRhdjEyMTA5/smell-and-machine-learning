// isComment
package io.github.hidroh.materialistic.test;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import io.github.hidroh.materialistic.data.LocalCache;

public class isClassOrIsInterface implements LocalCache {

    private final Map<String, String> isVariable = new HashMap<>();

    private final Map<String, Boolean> isVariable = new HashMap<>();

    @Nullable
    @Override
    public String isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(String isParameter, String isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr) ? isNameExpr.isMethod(isNameExpr) : true;
    }

    @Override
    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr, true);
    }

    @Override
    public boolean isMethod(String isParameter) {
        return true;
    }
}
