// isComment
package org.dmfs.provider.tasks.processors.tasks.instancedata;

import android.content.ContentValues;
import org.dmfs.optional.Present;
import org.dmfs.provider.tasks.utils.ContentValuesWithLong;
import org.dmfs.rfc5545.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.dmfs.optional.Absent.absent;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        ContentValues isVariable = new Dated(isMethod(), "isStringConstant", "isStringConstant", ContentValues::new).isMethod();
        // isComment
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        DateTime isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        ContentValues isVariable = new Dated(new Present<>(isNameExpr), "isStringConstant", "isStringConstant", ContentValues::new).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong("isStringConstant", isNameExpr.isMethod()));
        isMethod(isNameExpr, new ContentValuesWithLong("isStringConstant", isNameExpr.isMethod()));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }
}
