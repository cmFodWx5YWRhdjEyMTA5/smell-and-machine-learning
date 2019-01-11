// isComment
package io.github.hidroh.materialistic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import io.github.hidroh.materialistic.test.TestRunner;
import org.robolectric.android.controller.ActivityController;
import io.github.hidroh.materialistic.data.ItemManager;
import static junit.framework.Assert.assertEquals;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        ActivityController<ShowActivity> isVariable = isNameExpr.isMethod(ShowActivity.class);
        ShowActivity isVariable = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        ActivityController<NewActivity> isVariable = isNameExpr.isMethod(NewActivity.class);
        NewActivity isVariable = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        ActivityController<AskActivity> isVariable = isNameExpr.isMethod(AskActivity.class);
        AskActivity isVariable = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        ActivityController<JobsActivity> isVariable = isNameExpr.isMethod(JobsActivity.class);
        JobsActivity isVariable = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
