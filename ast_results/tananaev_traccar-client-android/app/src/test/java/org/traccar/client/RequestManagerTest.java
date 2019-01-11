// isComment
package org.traccar.client;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    @Ignore
    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }
}
