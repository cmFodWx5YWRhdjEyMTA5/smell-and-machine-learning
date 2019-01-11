// isComment
package com.veniosg.dir.test.acceptance;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import static com.veniosg.dir.test.TestUtils.cleanDirectory;

public class isClassOrIsInterface extends FileOperationsTest {

    @Override
    protected File isMethod(Context isParameter) {
        return isNameExpr.isMethod();
    }

    @SuppressWarnings("isStringConstant")
    @Override
    protected void isMethod(Context isParameter, File isParameter, File isParameter, File isParameter, File isParameter) throws IOException {
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }

    @SuppressWarnings("isStringConstant")
    @Override
    protected void isMethod(Context isParameter, File isParameter, File isParameter, File isParameter) {
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(new File(isNameExpr, "isStringConstant"));
        }
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(new File(isNameExpr, "isStringConstant"));
        }
        isMethod(isNameExpr);
        isNameExpr.isMethod();
    }
}
