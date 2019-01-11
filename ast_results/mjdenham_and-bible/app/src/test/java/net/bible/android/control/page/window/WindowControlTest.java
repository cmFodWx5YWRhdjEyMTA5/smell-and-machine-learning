// isComment
package net.bible.android.control.page.window;

import androidx.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;
import net.bible.android.TestBibleApplication;
import net.bible.android.activity.R;
import net.bible.android.control.event.EventManager;
import net.bible.android.control.event.window.NumberOfWindowsChangedEvent;
import net.bible.android.control.page.CurrentBiblePage;
import net.bible.android.control.page.CurrentPageManager;
import net.bible.android.control.page.window.WindowLayout.WindowState;
import net.bible.service.sword.SwordDocumentFacade;
import net.bible.test.DatabaseResetter;
import net.bible.test.PassageTestData;
import org.crosswire.jsword.book.Book;
import org.crosswire.jsword.book.Books;
import org.crosswire.jsword.passage.Key;
import org.crosswire.jsword.passage.Verse;
import org.crosswire.jsword.versification.BibleBook;
import org.crosswire.jsword.versification.system.Versifications;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenu;
import javax.inject.Provider;
import robolectric.MyRobolectricTestRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.hamcrest.MockitoHamcrest.argThat;

@RunWith(MyRobolectricTestRunner.class)
@Config(application = TestBibleApplication.class)
public class isClassOrIsInterface {

    private static final Book isVariable = isNameExpr.isMethod().isMethod("isStringConstant");

    private static final Verse isVariable = new Verse(isNameExpr.isMethod().isMethod("isStringConstant"), isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant);

    private EventManager isVariable;

    private WindowRepository isVariable;

    private WindowControl isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(EventManager.class);
        Provider<CurrentPageManager> isVariable = new Provider<CurrentPageManager>() {

            @Override
            public CurrentPageManager isMethod() {
                return new CurrentPageManager(null, new SwordDocumentFacade(null), null, null);
            }
        };
        isNameExpr = new WindowRepository(isNameExpr);
        isNameExpr = new WindowControl(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod(isNameExpr.isMethod()));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr), isMethod(true));
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), isMethod((Key) isNameExpr));
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(), isMethod(true));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), isMethod((Key) isNameExpr));
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(isNameExpr), isMethod(true));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        // isComment
        CurrentBiblePage isVariable = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isMethod()));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(isMethod(NumberOfWindowsChangedEvent.class)));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        Window isVariable = isNameExpr.isMethod();
        Window isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isMethod(isNameExpr)));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(isMethod(NumberOfWindowsChangedEvent.class)));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(isMethod(NumberOfWindowsChangedEvent.class)));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr, isNameExpr.isMethod()));
        // isComment
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isMethod(isNameExpr)));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(isMethod(NumberOfWindowsChangedEvent.class)));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        Window isVariable = isNameExpr.isMethod();
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(isMethod(NumberOfWindowsChangedEvent.class)));
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(isMethod(NumberOfWindowsChangedEvent.class)));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(), isMethod(true));
        Window isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(true));
    }

    @Test
    public void isMethod() {
        Menu isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isNameExpr.isMethod().isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(true));
    }

    @Test
    public void isMethod() {
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
        Menu isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(), isMethod(true));
        Window isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(true));
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        Menu isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod(true));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        Menu isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(), isMethod(true));
    }

    @NonNull
    public Menu isMethod() {
        Menu isVariable = new RoboMenu(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, "isStringConstant");
        return isNameExpr;
    }
}
