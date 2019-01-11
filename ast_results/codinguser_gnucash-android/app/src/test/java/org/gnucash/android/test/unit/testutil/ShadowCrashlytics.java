// isComment
package org.gnucash.android.test.unit.testutil;

import android.content.Context;
import com.crashlytics.android.Crashlytics;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

/**
 * isComment
 */
@Implements(Crashlytics.class)
public class isClassOrIsInterface {

    @Implementation
    public static void isMethod(Context isParameter) {
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
    // isComment
    }
}
