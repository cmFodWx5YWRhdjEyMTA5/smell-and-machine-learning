// isComment
package net.nightwhistler.pageturner.activity;

import android.annotation.TargetApi;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.inject.AbstractModule;
import com.google.inject.util.Modules;
import jedi.option.Option;
import net.nightwhistler.pageturner.scheduling.TaskQueue;
import net.nightwhistler.pageturner.testutils.SynchronousTaskQueue;
import net.nightwhistler.ui.UiUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import roboguice.RoboGuice;
import roboguice.inject.RoboInjector;
import static jedi.option.Options.none;

/**
 * isComment
 */
@TargetApi(isIntegerConstant)
@Config(emulateSdk = isIntegerConstant, reportSdk = isIntegerConstant)
@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    // isComment
    // isComment
    // isComment
    private FragmentActivity isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr = isNameExpr.isMethod(CatalogActivity.class).isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(new MyTestModule()));
        RoboInjector isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
    }

    @Test
    public void isMethod() {
    }

    private class isClassOrIsInterface extends AbstractModule {

        @Override
        protected void isMethod() {
            isMethod(FragmentManager.class).isMethod(isNameExpr.isMethod());
            isMethod(TaskQueue.class).isMethod(SynchronousTaskQueue.class);
        }
    }
}
