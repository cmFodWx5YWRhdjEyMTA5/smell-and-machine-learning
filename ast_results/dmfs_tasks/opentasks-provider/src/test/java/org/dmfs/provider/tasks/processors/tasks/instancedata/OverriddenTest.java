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
        ContentValues isVariable = new Overridden(isMethod(), ContentValues::new).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(Long.class)));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        ContentValues isVariable = new ContentValues();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        ContentValues isVariable = new Overridden(isMethod(), () -> new ContentValues(isNameExpr)).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        ContentValues isVariable = new ContentValues();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        ContentValues isVariable = new Overridden(isMethod(), () -> new ContentValues(isNameExpr)).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        ContentValues isVariable = new ContentValues();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        ContentValues isVariable = new Overridden(isMethod(), () -> new ContentValues(isNameExpr)).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        ContentValues isVariable = new Overridden(new Present<>(new DateTime(isIntegerConstant)), ContentValues::new).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        ContentValues isVariable = new ContentValues();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        ContentValues isVariable = new Overridden(new Present<>(new DateTime(isIntegerConstant)), () -> new ContentValues(isNameExpr)).isMethod();
        isMethod(isNameExpr, new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }
}
