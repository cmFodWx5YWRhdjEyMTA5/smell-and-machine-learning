// isComment
package me.sheimi.android.utils;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import me.sheimi.sgit.BuildConfig;
import static org.junit.Assert.assertEquals;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class isClassOrIsInterface {

    @org.junit.Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }
}
