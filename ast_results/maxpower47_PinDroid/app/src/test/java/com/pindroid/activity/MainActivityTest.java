// isComment
package com.pindroid.activity;

import com.pindroid.BuildConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;
import static org.robolectric.Robolectric.buildActivity;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    private ActivityController<Main> isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isMethod(Main.class);
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
