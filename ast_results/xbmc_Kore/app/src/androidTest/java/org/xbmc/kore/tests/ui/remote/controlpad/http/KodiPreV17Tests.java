// isComment
package org.xbmc.kore.tests.ui.remote.controlpad.http;

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.xbmc.kore.R;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.jsonrpc.method.Input;
import org.xbmc.kore.testhelpers.TestUtils;
import org.xbmc.kore.testhelpers.Utils;
import org.xbmc.kore.tests.ui.AbstractTestClass;
import org.xbmc.kore.ui.sections.remote.RemoteActivity;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class isClassOrIsInterface extends AbstractTestClass<RemoteActivity> {

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
        isNameExpr.isMethod(isIntegerConstant);
    }

    @Override
    public void isMethod() throws Throwable {
        isMethod(isNameExpr.isFieldAccessExpr);
        super.isMethod();
    }

    @Test
    public void isMethod() throws InterruptedException {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
