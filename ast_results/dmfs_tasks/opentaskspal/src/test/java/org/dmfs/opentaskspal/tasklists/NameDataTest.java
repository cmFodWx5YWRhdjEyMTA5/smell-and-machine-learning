// isComment
package org.dmfs.opentaskspal.tasklists;

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
public final class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(new NameData("isStringConstant"), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"))));
    }
}
