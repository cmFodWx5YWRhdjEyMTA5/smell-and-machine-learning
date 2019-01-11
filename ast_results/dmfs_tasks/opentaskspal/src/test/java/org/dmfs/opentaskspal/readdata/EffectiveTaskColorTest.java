// isComment
package org.dmfs.opentaskspal.readdata;

import org.dmfs.android.bolts.color.elementary.ValueColor;
import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.optional.Present;
import org.dmfs.tasks.contract.TaskContract.Tasks;
import org.junit.Test;
import static org.dmfs.jems.mockito.doubles.TestDoubles.failingMock;
import static org.dmfs.optional.Absent.absent;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    @Test
    public void isMethod() {
        RowDataSnapshot<Tasks> isVariable = isMethod(RowDataSnapshot.class);
        isMethod(new Present<>(new ValueColor(isIntegerConstant))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new EffectiveTaskColor(isNameExpr).isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        RowDataSnapshot<Tasks> isVariable = isMethod(RowDataSnapshot.class);
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new Present<>(new ValueColor(isIntegerConstant))).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(new EffectiveTaskColor(isNameExpr).isMethod(), isMethod(isIntegerConstant));
    }

    @Test(expected = Exception.class)
    public void isMethod() {
        RowDataSnapshot<Tasks> isVariable = isMethod(RowDataSnapshot.class);
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        isMethod(isMethod()).isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod());
        new EffectiveTaskColor(isNameExpr).isMethod();
    }
}
