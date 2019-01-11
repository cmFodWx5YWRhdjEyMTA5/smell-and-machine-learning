// isComment
package com.madgag.agit;

import static java.util.Arrays.asList;
import android.app.Instrumentation;
import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.madgag.agit.matchers.GitTestHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class isClassOrIsInterface implements TestEnvironment {

    private final Instrumentation isVariable;

    public isConstructor(Instrumentation isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public InputStream isMethod(String isParameter) {
        try {
            Context isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isMethod(isNameExpr.isMethod().isMethod("isStringConstant")).isMethod());
            return isNameExpr.isMethod().isMethod(isNameExpr);
        } catch (IOException isParameter) {
            throw new RuntimeException(isNameExpr);
        }
    }

    public File isMethod() {
        return new File(isNameExpr.isMethod(), "isStringConstant");
    }

    public static GitTestHelper isMethod(Instrumentation isParameter) {
        return new GitTestHelper(new AndroidTestEnvironment(isNameExpr));
    }
}
