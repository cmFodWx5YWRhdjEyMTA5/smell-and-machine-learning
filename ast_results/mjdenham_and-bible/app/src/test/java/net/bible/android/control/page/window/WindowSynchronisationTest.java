// isComment
package net.bible.android.control.page.window;

import net.bible.android.TestBibleApplication;
import net.bible.android.control.event.ABEventBus;
import net.bible.android.control.event.EventManager;
import net.bible.android.control.page.ChapterVerse;
import net.bible.android.control.page.CurrentPageManager;
import net.bible.service.sword.SwordDocumentFacade;
import net.bible.test.DatabaseResetter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import javax.inject.Provider;
import robolectric.MyRobolectricTestRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

@RunWith(MyRobolectricTestRunner.class)
@Config(application = TestBibleApplication.class)
public class isClassOrIsInterface {

    private EventManager isVariable;

    private WindowRepository isVariable;

    private WindowControl isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isNameExpr.isMethod();
        Provider<CurrentPageManager> isVariable = new Provider<CurrentPageManager>() {

            @Override
            public CurrentPageManager isMethod() {
                return new CurrentPageManager(null, new SwordDocumentFacade(null), null, null);
            }
        };
        isNameExpr = new WindowRepository(isNameExpr);
        isNameExpr = new WindowControl(isNameExpr, isNameExpr);
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        ChapterVerse isVariable = isNameExpr.isMethod().isMethod().isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(isMethod(isIntegerConstant)));
        Window isVariable = isNameExpr.isMethod();
        ChapterVerse isVariable = new ChapterVerse(isNameExpr.isMethod(), isIntegerConstant);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod().isMethod().isMethod(), isMethod(isIntegerConstant));
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        ChapterVerse isVariable = isNameExpr.isMethod().isMethod().isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(isMethod(isIntegerConstant)));
        ChapterVerse isVariable = new ChapterVerse(isIntegerConstant, isIntegerConstant);
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod().isMethod().isMethod(), isMethod(isIntegerConstant));
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), isMethod(isNameExpr));
    }
}
