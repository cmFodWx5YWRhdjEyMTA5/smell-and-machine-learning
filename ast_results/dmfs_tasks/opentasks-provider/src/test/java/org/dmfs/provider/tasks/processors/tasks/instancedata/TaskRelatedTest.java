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
import static org.junit.Assert.assertThat;

/**
 * isComment
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(new TaskRelated(isIntegerConstant, ContentValues::new), isMethod(new ContentValuesWithLong(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant)));
    }
}
