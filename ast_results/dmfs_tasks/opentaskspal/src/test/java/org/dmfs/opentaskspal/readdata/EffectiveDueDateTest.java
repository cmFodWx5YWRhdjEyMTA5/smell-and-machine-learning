// isComment
package org.dmfs.opentaskspal.readdata;

import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.jems.hamcrest.matchers.AbsentMatcher;
import org.dmfs.optional.Present;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.rfc5545.Duration;
import org.dmfs.tasks.contract.TaskContract.Tasks;
import org.junit.Test;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static org.dmfs.jems.mockito.doubles.TestDoubles.failingMock;
import static org.dmfs.optional.Absent.absent;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    @Test
    public void isMethod() {
        long isVariable = isNameExpr.isMethod();
        RowDataSnapshot<Tasks> isVariable = isMethod(RowDataSnapshot.class);
        isMethod(new Present<>(isNameExpr)).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(true)).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isNameExpr.isMethod("isStringConstant"))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        DateTime isVariable = new EffectiveDueDate(isNameExpr).isMethod();
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        RowDataSnapshot<Tasks> isVariable = isMethod(RowDataSnapshot.class);
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(true)).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isNameExpr.isMethod("isStringConstant"))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new EffectiveDueDate(isNameExpr), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        RowDataSnapshot<Tasks> isVariable = isMethod(RowDataSnapshot.class);
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isIntegerConstant)).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(true)).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isNameExpr.isMethod("isStringConstant"))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new EffectiveDueDate(isNameExpr), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        RowDataSnapshot<Tasks> isVariable = isMethod(RowDataSnapshot.class);
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isNameExpr.isMethod("isStringConstant"))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(true)).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isNameExpr.isMethod("isStringConstant"))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new EffectiveDueDate(isNameExpr), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        long isVariable = isNameExpr.isMethod();
        RowDataSnapshot<Tasks> isVariable = isMethod(RowDataSnapshot.class);
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isNameExpr)).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isNameExpr.isMethod("isStringConstant"))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(true)).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(isNameExpr.isMethod("isStringConstant"))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        DateTime isVariable = new EffectiveDueDate(isNameExpr).isMethod();
        isMethod(isNameExpr + isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }
}
