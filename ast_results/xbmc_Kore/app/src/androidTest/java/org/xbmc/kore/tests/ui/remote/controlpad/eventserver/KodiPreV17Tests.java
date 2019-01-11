// isComment
package org.xbmc.kore.tests.ui.remote.controlpad.eventserver;

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.xbmc.kore.R;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.method.Input;
import org.xbmc.kore.testhelpers.Utils;
import org.xbmc.kore.tests.ui.AbstractTestClass;
import org.xbmc.kore.testutils.eventserver.MockEventServer;
import org.xbmc.kore.ui.sections.remote.RemoteActivity;
import java.io.IOException;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertTrue;

public class isClassOrIsInterface extends AbstractTestClass<RemoteActivity> {

    private static MockEventServer isVariable;

    @Rule
    public ActivityTestRule<RemoteActivity> isVariable = new ActivityTestRule<>(RemoteActivity.class);

    @Override
    protected ActivityTestRule<RemoteActivity> isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Context isParameter) {
        isNameExpr.isMethod(isNameExpr, true);
    }

    @Override
    protected void isMethod(HostInfo isParameter) {
    }

    @BeforeClass
    public static void isMethod() throws Throwable {
        isNameExpr = new MockEventServer();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() throws Throwable {
        isMethod(isNameExpr.isFieldAccessExpr);
        super.isMethod();
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @AfterClass
    public static void isMethod() throws IOException {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() throws InterruptedException {
        isNameExpr.isMethod(isMethod()).isMethod().isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        String isVariable = isMethod().isMethod();
        isMethod(isNameExpr != null);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }
}
