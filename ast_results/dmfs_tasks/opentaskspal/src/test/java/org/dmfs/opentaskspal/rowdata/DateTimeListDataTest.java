// isComment
package org.dmfs.opentaskspal.rowdata;

import org.dmfs.iterables.SingletonIterable;
import org.dmfs.iterables.elementary.Seq;
import org.dmfs.rfc5545.DateTime;
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
        isMethod(new DateTimeListData<>("isStringConstant", isMethod()), isMethod(isMethod(isMethod("isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new DateTimeListData<>("isStringConstant", new SingletonIterable<>(isNameExpr.isMethod("isStringConstant", "isStringConstant"))), isMethod(isMethod(isMethod("isStringConstant", "isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new DateTimeListData<>("isStringConstant", new SingletonIterable<>(isNameExpr.isMethod("isStringConstant"))), isMethod(isMethod(isMethod("isStringConstant", "isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new DateTimeListData<>("isStringConstant", new SingletonIterable<>(isNameExpr.isMethod("isStringConstant"))), isMethod(isMethod(isMethod("isStringConstant", "isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new DateTimeListData<>("isStringConstant", new Seq<>(isNameExpr.isMethod("isStringConstant", "isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant"))), isMethod(isMethod(isMethod("isStringConstant", "isStringConstant"))));
    }

    @Test
    public void isMethod() {
        isMethod(new DateTimeListData<>("isStringConstant", new Seq<>(isNameExpr.isMethod("isStringConstant", "isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant"))), isMethod(isMethod(isMethod("isStringConstant", "isStringConstant"))));
    }
}
