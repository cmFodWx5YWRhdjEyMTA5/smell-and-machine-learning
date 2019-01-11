// isComment
package com.pindroid.providers;

import com.pindroid.BuildConfig;
import com.pindroid.providers.BookmarkContent.Bookmark;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.util.Date;
import static com.artemzin.assert_parcelable.AssertParcelable.assertThatObjectParcelable;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        final Bookmark isVariable = new Bookmark();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(new Date().isMethod());
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
    }
}
