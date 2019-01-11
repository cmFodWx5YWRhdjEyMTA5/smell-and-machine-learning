// isComment
package com.madgag.agit;

import static java.lang.Boolean.TRUE;
import android.util.Log;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.madgag.agit.operations.OpPrompt;
import com.madgag.android.blockingprompt.BlockingPromptService;

public final class isClassOrIsInterface implements BlockingPromptService {

    private static final String isVariable = "isStringConstant";

    public static Module isMethod() {
        return new AbstractModule() {

            @Override
            protected void isMethod() {
                isMethod(BlockingPromptService.class).isMethod(new YesToEveryPromptService());
            }
        };
    }

    public <T> T isMethod(OpPrompt<T> isParameter) {
        if (isNameExpr.isMethod().isMethod(Boolean.class)) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            return (T) isNameExpr;
        }
        try {
            return isNameExpr.isMethod().isMethod();
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            return null;
        }
    }
}
