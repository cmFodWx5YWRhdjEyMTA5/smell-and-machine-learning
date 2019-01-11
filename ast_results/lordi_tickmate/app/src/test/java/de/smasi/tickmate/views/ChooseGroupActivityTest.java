// isComment
package de.smasi.tickmate.views;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;
import de.smasi.tickmate.BuildConfig;
import de.smasi.tickmate.TickmateTestRunner;
import de.smasi.tickmate.models.Group;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

@Config(sdk = isIntegerConstant, constants = BuildConfig.class)
@RunWith(TickmateTestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<ChooseGroupActivity> isVariable;

    private ChooseGroupActivity isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(ChooseGroupActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod();
    }

    @After
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = null;
    }

    @Test
    public void isMethod() {
        // isComment
        Group isVariable = new Group("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isIntegerConstant);
        // isComment
        GroupListAdapter isVariable = new GroupListAdapter(isNameExpr, new Group[] { isNameExpr });
        isNameExpr.isMethod().isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(), null, isIntegerConstant, isStringConstant);
        // isComment
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        Group isVariable = new Group("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isIntegerConstant);
        // isComment
        GroupListAdapter isVariable = new GroupListAdapter(isNameExpr, new Group[] { isNameExpr });
        isNameExpr.isMethod().isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(), null, isIntegerConstant, isStringConstant);
        // isComment
        isMethod(isNameExpr.isMethod());
    }
}
