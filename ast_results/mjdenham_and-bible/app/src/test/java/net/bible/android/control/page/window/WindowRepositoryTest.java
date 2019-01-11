// isComment
package net.bible.android.control.page.window;

import net.bible.android.control.event.EventManager;
import net.bible.android.control.event.EventManagerStub;
import net.bible.android.control.page.CurrentPageManager;
import net.bible.test.DatabaseResetter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.inject.Provider;
import robolectric.MyRobolectricTestRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

@RunWith(MyRobolectricTestRunner.class)
public class isClassOrIsInterface {

    private WindowRepository isVariable;

    @Before
    public void isMethod() throws Exception {
        EventManager isVariable = new EventManagerStub();
        Provider<CurrentPageManager> isVariable = new Provider<CurrentPageManager>() {

            @Override
            public CurrentPageManager isMethod() {
                return isMethod(CurrentPageManager.class);
            }
        };
        isNameExpr = new WindowRepository(isNameExpr);
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isMethod(isNameExpr.isMethod())));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isMethod()));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        Window isVariable = isNameExpr.isMethod();
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr, isNameExpr, isNameExpr));
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr, isNameExpr, isNameExpr));
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr, isNameExpr, isNameExpr));
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr, isNameExpr, isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr), isMethod(true));
        isMethod(isNameExpr.isMethod() == isNameExpr.isMethod(), isMethod(true));
    }
}
