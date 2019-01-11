// isComment
package org.dmfs.opentaskspal.tasks;

import org.dmfs.rfc5545.recur.RecurrenceRule;
import org.dmfs.tasks.contract.TaskContract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.dmfs.android.contentpal.testing.contentoperationbuilder.WithValues.withValuesOnly;
import static org.dmfs.android.contentpal.testing.contentvalues.Containing.containing;
import static org.dmfs.android.contentpal.testing.rowdata.RowDataMatcher.builds;
import static org.junit.Assert.assertThat;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isMethod(new RRuleTaskData(new RecurrenceRule("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))));
    }
}
