// isComment
package org.dmfs.provider.tasks.processors.tasks.instancedata;

import android.content.ContentValues;
import org.dmfs.provider.tasks.utils.ContentValuesWithLong;
import org.dmfs.tasks.contract.TaskContract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.dmfs.jems.hamcrest.matchers.SingleMatcher.hasValue;
import static org.hamcrest.CoreMatchers.is;
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
        isMethod(new Enduring(ContentValues::new), isMethod(new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(Long.class))));
        isMethod(new Enduring(ContentValues::new).isMethod().isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        ContentValues isVariable = new ContentValues(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(new Enduring(() -> new ContentValues(isNameExpr)), isMethod(new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(Long.class))));
        isMethod(new Enduring(() -> new ContentValues(isNameExpr)).isMethod().isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        ContentValues isVariable = new ContentValues(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(new Enduring(() -> new ContentValues(isNameExpr)), isMethod(new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(Long.class))));
        isMethod(new Enduring(() -> new ContentValues(isNameExpr)).isMethod().isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        ContentValues isVariable = new ContentValues(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(new Enduring(() -> new ContentValues(isNameExpr)), isMethod(new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant)));
        isMethod(new Enduring(() -> new ContentValues(isNameExpr)).isMethod().isMethod(), isMethod(isIntegerConstant));
    }
}
