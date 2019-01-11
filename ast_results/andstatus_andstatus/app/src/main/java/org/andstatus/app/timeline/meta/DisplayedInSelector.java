// isComment
package org.andstatus.app.timeline.meta;

import android.content.Context;
import android.support.annotation.NonNull;
import org.andstatus.app.R;
import org.andstatus.app.lang.SelectableEnum;

public enum DisplayedInSelector implements SelectableEnum {

    ALWAYS("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr), IN_CONTEXT("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr), NEVER("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    private final String isVariable;

    /**
     * isComment
     */
    private final int isVariable;

    isConstructor(String isParameter, int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public static DisplayedInSelector isMethod(String isParameter) {
        for (DisplayedInSelector isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public CharSequence isMethod(Context isParameter) {
        if (isNameExpr == isIntegerConstant || isNameExpr == null) {
            return this.isFieldAccessExpr;
        } else {
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
