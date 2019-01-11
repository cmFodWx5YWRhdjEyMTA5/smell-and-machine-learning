// isComment
package net.bible.android.control.page.window;

import net.bible.android.TestBibleApplication;
import net.bible.android.control.page.CurrentBiblePage;
import net.bible.android.control.page.CurrentPageManager;
import net.bible.android.control.page.window.WindowLayout.WindowState;
import net.bible.service.sword.SwordDocumentFacade;
import net.bible.test.DatabaseResetter;
import net.bible.test.PassageTestData;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import robolectric.MyRobolectricTestRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(MyRobolectricTestRunner.class)
@Config(application = TestBibleApplication.class)
public class isClassOrIsInterface {

    @Before
    public void isMethod() throws Exception {
    }

    @After
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        CurrentPageManager isVariable = new CurrentPageManager(null, new SwordDocumentFacade(null), null, null);
        // isComment
        Window isVariable = new Window(isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr);
        WindowLayout isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isDoubleConstant);
        CurrentPageManager isVariable = isNameExpr.isMethod();
        CurrentBiblePage isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        JSONObject isVariable = isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        // isComment
        isNameExpr = new Window(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod(isDoubleConstant));
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isMethod()));
    }
}
