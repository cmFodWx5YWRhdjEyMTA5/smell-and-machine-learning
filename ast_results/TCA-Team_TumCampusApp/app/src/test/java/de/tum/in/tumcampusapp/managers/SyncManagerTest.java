// isComment
package de.tum.in.tumcampusapp.managers;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import de.tum.in.tumcampusapp.TestApp;
import de.tum.in.tumcampusapp.database.TcaDb;
import de.tum.in.tumcampusapp.utils.sync.SyncDao;
import de.tum.in.tumcampusapp.utils.sync.SyncManager;
import de.tum.in.tumcampusapp.utils.sync.model.Sync;
import static org.assertj.core.api.Assertions.assertThat;

@Ignore
@RunWith(RobolectricTestRunner.class)
@Config(application = TestApp.class)
public class isClassOrIsInterface {

    private SyncManager isVariable;

    private SyncDao isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod();
        isNameExpr = new SyncManager(isNameExpr.isFieldAccessExpr);
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(new Sync(isNameExpr, new DateTime(isIntegerConstant)));
        isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant)).isMethod();
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant)).isMethod();
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(new Sync(isNameExpr, isNameExpr.isMethod()));
        isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant)).isMethod();
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(new Sync(isNameExpr, new DateTime(isIntegerConstant)));
        isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant)).isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant)).isMethod();
    }
}
