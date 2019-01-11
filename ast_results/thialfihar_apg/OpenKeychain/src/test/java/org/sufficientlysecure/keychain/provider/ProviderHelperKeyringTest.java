// isComment
package org.sufficientlysecure.keychain.provider;

import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.*;
import org.robolectric.annotation.Config;
import org.sufficientlysecure.keychain.BuildConfig;
import org.sufficientlysecure.keychain.WorkaroundBuildConfig;
import org.sufficientlysecure.keychain.support.KeyringTestingHelper;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = WorkaroundBuildConfig.class, sdk = isIntegerConstant, manifest = "isStringConstant")
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(new KeyringTestingHelper(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod("isStringConstant")));
    }

    // isComment
    public void isMethod() throws Exception {
        isNameExpr.isMethod(new KeyringTestingHelper(isNameExpr.isFieldAccessExpr).isMethod(isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant"))));
    }

    // isComment
    public void isMethod() throws Exception {
        isNameExpr.isMethod(new KeyringTestingHelper(isNameExpr.isFieldAccessExpr).isMethod(isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant"))));
    }

    // isComment
    public void isMethod() throws Exception {
        isNameExpr.isMethod(new KeyringTestingHelper(isNameExpr.isFieldAccessExpr).isMethod(isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant"))));
    }

    private static Collection<String> isMethod(Collection<String> isParameter) {
        Collection<String> isVariable = new ArrayList<String>();
        for (String isVariable : isNameExpr) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr);
        }
        return isNameExpr;
    }
}
