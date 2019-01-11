// isComment
package org.dmfs.provider.tasks.processors.tasks.instancedata;

import android.content.ContentValues;
import org.dmfs.optional.Present;
import org.dmfs.provider.tasks.utils.ContentValuesWithLong;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.tasks.contract.TaskContract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.util.TimeZone;
import static org.dmfs.optional.Absent.absent;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        ContentValues isVariable = new StartDated(isMethod(), ContentValues::new).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(Long.class)));
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(Long.class)));
        // isComment
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        DateTime isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        ContentValues isVariable = new StartDated(new Present<>(isNameExpr), ContentValues::new).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()));
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()).isMethod()));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        DateTime isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        ContentValues isVariable = new StartDated(new Present<>(isNameExpr), ContentValues::new).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()));
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()).isMethod()));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }
}
