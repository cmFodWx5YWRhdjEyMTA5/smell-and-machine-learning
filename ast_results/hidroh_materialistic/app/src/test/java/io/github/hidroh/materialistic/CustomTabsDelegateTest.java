// isComment
package io.github.hidroh.materialistic;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowApplication;
import org.robolectric.shadows.ShadowResolveInfo;
import org.robolectric.android.controller.ActivityController;
import java.util.List;
import io.github.hidroh.materialistic.test.TestRunner;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private CustomTabsDelegate isVariable;

    private ActivityController<Activity> isVariable;

    private Activity isVariable;

    private ICustomTabsService isVariable;

    @Before
    public void isMethod() throws RemoteException {
        isNameExpr = isNameExpr.isMethod(Activity.class);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isNameExpr = new CustomTabsDelegate();
        isNameExpr = isMethod(ICustomTabsService.class);
        isMethod(isNameExpr.isMethod(isMethod(ICustomTabsCallback.class))).isMethod(true);
        IBinder isVariable = isMethod(IBinder.class);
        isMethod(isNameExpr.isMethod(isMethod())).isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isMethod(ComponentName.class), isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), null, null));
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws RemoteException {
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod()).isMethod();
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant")), isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(new Intent("isStringConstant").isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"));
        isNameExpr.isMethod(isNameExpr);
        List<ServiceConnection> isVariable = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
        // isComment
        isMethod(isNameExpr).isMethod(isMethod());
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isMethod(ICustomTabsCallback.class));
        // isComment
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod())).isMethod(true);
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), null, null));
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }
}
