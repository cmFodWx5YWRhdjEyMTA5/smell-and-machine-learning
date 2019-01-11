// isComment
package org.dmfs.tasks.utils;

import android.net.Uri;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.net.URISyntaxException;
import static org.dmfs.tasks.utils.FragileMatcher.failsWith;
import static org.dmfs.tasks.utils.FragileMatcher.hasSuccessValue;
import static org.junit.Assert.assertThat;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr)
public final class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(new ValidatingUri("isStringConstant"), isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(new ValidatingUri("isStringConstant"), isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(new ValidatingUri("isStringConstant"), isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod(new ValidatingUri("isStringConstant"), isMethod(isNameExpr.isMethod("isStringConstant")));
    }

    @Test
    public void isMethod() {
        isMethod(new ValidatingUri(null), isMethod(URISyntaxException.class));
        isMethod(new ValidatingUri("isStringConstant"), isMethod(URISyntaxException.class));
        isMethod(new ValidatingUri("isStringConstant"), isMethod(URISyntaxException.class));
    }
}
