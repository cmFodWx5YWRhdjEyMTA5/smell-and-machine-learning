// isComment
package net.bible.service.sword;

import net.bible.android.TestBibleApplication;
import net.bible.service.download.FakeSwordBookFactory;
import org.crosswire.jsword.book.Book;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import robolectric.MyRobolectricTestRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(MyRobolectricTestRunner.class)
@Config(application = TestBibleApplication.class)
public class isClassOrIsInterface {

    private SwordDocumentFacade isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new SwordDocumentFacade(null);
    }

    @Test
    public void isMethod() throws Exception {
        Book isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr + "isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr), isMethod(true));
    }

    interface isClassOrIsInterface {

        String isVariable = "isStringConstant";
    }
}
