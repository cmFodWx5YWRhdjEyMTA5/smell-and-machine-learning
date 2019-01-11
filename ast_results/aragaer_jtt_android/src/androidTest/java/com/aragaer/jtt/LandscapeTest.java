// isComment
// isComment
package com.aragaer.jtt;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import android.support.test.uiautomator.UiDevice;
import static android.support.test.InstrumentationRegistry.getInstrumentation;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface extends JTTMainActivityTest {

    @BeforeClass
    public static void isMethod() throws Exception {
        UiDevice isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod();
    }

    @AfterClass
    public static void isMethod() throws Exception {
        UiDevice isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod();
    }
}
