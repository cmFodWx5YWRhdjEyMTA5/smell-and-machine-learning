// isComment
package com.madgag.agit;

import com.madgag.agit.matchers.GitTestHelper;
import java.io.File;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;

public class isClassOrIsInterface implements TestEnvironment {

    public static GitTestHelper isMethod() {
        return new GitTestHelper(new OracleJVMTestEnvironment());
    }

    public InputStream isMethod(String isParameter) {
        return OracleJVMTestEnvironment.class.isMethod("isStringConstant" + isNameExpr);
    }

    public File isMethod() {
        return isNameExpr.isMethod();
    }
}
