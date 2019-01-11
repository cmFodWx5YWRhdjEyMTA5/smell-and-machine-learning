// isComment
package org.sufficientlysecure.keychain.pgp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.sufficientlysecure.keychain.BuildConfig;
import org.sufficientlysecure.keychain.WorkaroundBuildConfig;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = WorkaroundBuildConfig.class, sdk = isIntegerConstant, manifest = "isStringConstant")
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        KeyRing.UserId isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        KeyRing.UserId isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        KeyRing.UserId isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}
