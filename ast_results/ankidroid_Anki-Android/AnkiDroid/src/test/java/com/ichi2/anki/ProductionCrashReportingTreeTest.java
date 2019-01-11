// isComment
package com.ichi2.anki;

import android.util.Log;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import timber.log.Timber;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeast;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Log.class)
public class isClassOrIsInterface {

    @Before
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(Log.class);
        isNameExpr.isMethod(new AnkiDroidApp.ProductionCrashReportingTree());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod())).isMethod(new RuntimeException("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod())).isMethod(new RuntimeException("isStringConstant"));
        // isComment
        try {
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
        } catch (Exception isParameter) {
            isNameExpr.isMethod("isStringConstant");
        }
    }

    /**
     * isComment
     */
    @Test
    @SuppressWarnings("isStringConstant")
    public void isMethod() {
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isMethod(Log.class, isMethod(isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", null);
        // isComment
        isMethod(Log.class, isMethod(isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, this.isMethod().isMethod() + "isStringConstant" + "isStringConstant", null);
        isMethod(Log.class, isMethod(isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, this.isMethod().isMethod() + "isStringConstant" + "isStringConstant", null);
    }
}
