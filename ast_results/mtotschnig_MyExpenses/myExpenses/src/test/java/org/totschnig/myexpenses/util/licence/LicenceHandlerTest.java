// isComment
package org.totschnig.myexpenses.util.licence;

import com.google.android.vending.licensing.PreferenceObfuscator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.util.crashreporting.CrashHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static org.mockito.Mockito.mock;

@RunWith(JUnitParamsRunner.class)
public class isClassOrIsInterface {

    private LicenceHandler isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new LicenceHandler(isMethod(MyApplication.class), isMethod(PreferenceObfuscator.class), isMethod(CrashHandler.class));
    }

    @Test
    @Parameters({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" })
    public void isMethod(String isParameter, String isParameter, boolean isParameter) throws Exception {
        isNameExpr.isMethod(isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }

    @Test
    @Parameters({ "isStringConstant", "isStringConstant", "isStringConstant" })
    public void isMethod(String isParameter, boolean isParameter) throws Exception {
        isNameExpr.isMethod(isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Test
    @Parameters({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" })
    public void isMethod(String isParameter, String isParameter, boolean isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr).isMethod(isMethod(isNameExpr)));
    }

    @Test
    @Parameters({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" })
    public void isMethod(String isParameter, String isParameter) {
        LicenceStatus isVariable = isMethod(isNameExpr);
        LicenceStatus isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    @Parameters({ "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" })
    public void isMethod(String isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant")));
    }

    @Test
    @Parameters
    public void isMethod(List<String> isParameter, String isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    private Object[] isMethod() {
        return new Object[] { new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant"), "isStringConstant" }, new Object[] { isNameExpr.isMethod("isStringConstant", "isStringConstant"), "isStringConstant" } };
    }

    private LicenceStatus isMethod(String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            return null;
        }
    }
}
