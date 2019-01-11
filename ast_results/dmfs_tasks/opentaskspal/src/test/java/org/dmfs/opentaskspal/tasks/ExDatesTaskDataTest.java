// isComment
package org.dmfs.opentaskspal.tasks;

import org.dmfs.iterables.SingletonIterable;
import org.dmfs.iterables.elementary.Seq;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.tasks.contract.TaskContract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.dmfs.android.contentpal.testing.contentoperationbuilder.WithValues.withValuesOnly;
import static org.dmfs.android.contentpal.testing.contentvalues.Containing.containing;
import static org.dmfs.android.contentpal.testing.contentvalues.NullValue.withNullValue;
import static org.dmfs.android.contentpal.testing.rowdata.RowDataMatcher.builds;
import static org.dmfs.iterables.EmptyIterable.instance;
import static org.junit.Assert.assertThat;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(new ExDatesTaskData(isMethod()), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))));
    }

    @Test
    public void isMethod() {
        isMethod(new ExDatesTaskData(new SingletonIterable<>(isNameExpr.isMethod("isStringConstant", "isStringConstant"))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new ExDatesTaskData(new SingletonIterable<>(isNameExpr.isMethod("isStringConstant"))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new ExDatesTaskData(new SingletonIterable<>(isNameExpr.isMethod("isStringConstant"))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new ExDatesTaskData(new Seq<>(isNameExpr.isMethod("isStringConstant", "isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant"))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new ExDatesTaskData(new Seq<>(isNameExpr.isMethod("isStringConstant", "isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant"))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))));
    }
}
