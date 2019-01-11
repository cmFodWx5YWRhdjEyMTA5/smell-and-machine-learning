// isComment
package org.gnucash.android.test.unit.db;

import org.gnucash.android.db.MigrationHelper;
import org.gnucash.android.test.unit.testutil.ShadowCrashlytics;
import org.gnucash.android.test.unit.testutil.ShadowUserVoice;
import org.gnucash.android.util.TimestampHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.sql.Timestamp;
import java.util.TimeZone;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = isIntegerConstant, packageName = "isStringConstant", shadows = { ShadowCrashlytics.class, ShadowUserVoice.class })
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        /**
         * isComment
         */
        final long isVariable = isIntegerConstant * isStringConstant;
        final Timestamp isVariable = new Timestamp(isNameExpr);
        final String isVariable = "isStringConstant";
        final String isVariable = "isStringConstant";
        TimeZone isVariable = isNameExpr.isMethod("isStringConstant");
        Timestamp isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
    }
}
