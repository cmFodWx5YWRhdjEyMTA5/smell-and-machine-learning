// isComment
package com.veniosg.dir.test.acceptance;

import android.content.Context;
import com.veniosg.dir.android.util.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;
import static com.veniosg.dir.mvvm.model.storage.DocumentFileUtils.createDirectory;
import static com.veniosg.dir.mvvm.model.storage.DocumentFileUtils.createFile;
import static com.veniosg.dir.mvvm.model.storage.DocumentFileUtils.safAwareDelete;
import static com.veniosg.dir.test.TestUtils.cleanDirectorySaf;

public class isClassOrIsInterface extends FileOperationsTest {

    @Override
    protected File isMethod(Context isParameter) {
        List<String> isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod()) {
            throw new IllegalStateException("isStringConstant");
        }
        return new File(isNameExpr.isMethod(isIntegerConstant));
    }

    @Override
    protected void isMethod(Context isParameter, File isParameter, File isParameter, File isParameter, File isParameter) throws IOException {
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, "isStringConstant");
    }

    @Override
    protected void isMethod(Context isParameter, File isParameter, File isParameter, File isParameter) {
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }
}
