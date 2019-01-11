// isComment
package org.andstatus.app.timeline.meta;

import org.andstatus.app.context.ActivityTest;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.context.TestSuite;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityTest<ManageTimelines> {

    @Override
    protected Class<ManageTimelines> isMethod() {
        return ManageTimelines.class;
    }

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
    }

    @Test
    public void isMethod() throws InterruptedException {
        int isVariable = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr.isMethod(isMethod(), isNameExpr);
        isMethod("isStringConstant" + isMethod().isMethod().isMethod(), isMethod().isMethod().isMethod() == isNameExpr);
    }
}
