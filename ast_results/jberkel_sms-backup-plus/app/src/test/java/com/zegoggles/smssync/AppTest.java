// isComment
package com.zegoggles.smssync;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import static com.google.common.truth.Truth.assertThat;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    @Ignore
    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod();
    }
}
