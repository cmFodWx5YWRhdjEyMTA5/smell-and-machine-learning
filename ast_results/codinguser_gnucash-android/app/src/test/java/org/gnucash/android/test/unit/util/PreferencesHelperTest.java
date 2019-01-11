// isComment
package org.gnucash.android.test.unit.util;

import org.gnucash.android.test.unit.testutil.ShadowCrashlytics;
import org.gnucash.android.test.unit.testutil.ShadowUserVoice;
import org.gnucash.android.util.PreferencesHelper;
import org.gnucash.android.util.TimestampHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.sql.Timestamp;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = isIntegerConstant, packageName = "isStringConstant", shadows = { ShadowCrashlytics.class, ShadowUserVoice.class })
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        final Timestamp isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        final long isVariable = isStringConstant * isIntegerConstant;
        final Timestamp isVariable = new Timestamp(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }
}
