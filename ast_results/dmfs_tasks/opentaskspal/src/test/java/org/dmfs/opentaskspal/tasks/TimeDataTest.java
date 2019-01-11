// isComment
package org.dmfs.opentaskspal.tasks;

import android.content.ContentProviderOperation;
import org.dmfs.android.contentpal.TransactionContext;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.rfc5545.Duration;
import org.dmfs.tasks.contract.TaskContract.Tasks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.util.TimeZone;
import static org.dmfs.android.contentpal.testing.contentoperationbuilder.WithValues.withValuesOnly;
import static org.dmfs.android.contentpal.testing.contentvalues.Containing.containing;
import static org.dmfs.android.contentpal.testing.contentvalues.NullValue.withNullValue;
import static org.dmfs.android.contentpal.testing.rowdata.RowDataMatcher.builds;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr)
public final class isClassOrIsInterface {

    @Test
    public void isMethod() {
        DateTime isVariable = isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(new TimeData(isNameExpr, isNameExpr), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant), isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr))));
    }

    @Test
    public void isMethod() {
        DateTime isVariable = isNameExpr.isMethod();
        Duration isVariable = new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isMethod(new TimeData(isNameExpr, isNameExpr), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr))));
    }

    @Test
    public void isMethod() {
        DateTime isVariable = isNameExpr.isMethod();
        isMethod(new TimeData(isNameExpr), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr))));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        new TimeData(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod()).isMethod(isMethod(TransactionContext.class), isMethod(ContentProviderOperation.Builder.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        new TimeData(isNameExpr.isMethod(), isNameExpr.isMethod().isMethod()).isMethod(isMethod(TransactionContext.class), isMethod(ContentProviderOperation.Builder.class));
    }

    @Test
    public void isMethod() {
        DateTime isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isMethod("isStringConstant"));
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant)).isMethod(isNameExpr.isMethod("isStringConstant"));
        DateTime isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(new TimeData(isNameExpr, isNameExpr), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant), isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr))));
    }

    @Test
    public void isMethod() {
        DateTime isVariable = isNameExpr.isMethod().isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(new TimeData(isNameExpr, isNameExpr), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant), isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr))));
    }
}
