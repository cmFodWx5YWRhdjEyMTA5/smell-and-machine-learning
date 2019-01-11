// isComment
package com.anysoftkeyboard.ui.settings;

import static android.Manifest.permission.READ_CONTACTS;
import static android.content.Intent.ACTION_VIEW;
import static com.anysoftkeyboard.PermissionsRequestCodes.CONTACTS;
import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import android.Manifest;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.anysoftkeyboard.PermissionsRequestCodes;
import com.anysoftkeyboard.quicktextkeys.ui.QuickTextKeysBrowseFragment;
import com.menny.android.anysoftkeyboard.R;
import net.evendanan.chauffeur.lib.permissions.PermissionsFragmentChauffeurActivity;
import net.evendanan.chauffeur.lib.permissions.PermissionsRequest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.Shadows;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import androidx.test.core.app.ApplicationProvider;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface {

    private static Intent isMethod(String isParameter) {
        Intent isVariable = new Intent(isNameExpr, null, isMethod(), MainSettingsActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return isNameExpr;
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        ActivityController<MainSettingsActivity> isVariable = isNameExpr.isMethod(MainSettingsActivity.class, isMethod("isStringConstant"));
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        ActivityController<MainSettingsActivity> isVariable = isNameExpr.isMethod(MainSettingsActivity.class);
        isNameExpr.isMethod();
        MainSettingsActivity isVariable = isNameExpr.isMethod();
        Fragment isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr instanceof MainFragment);
    }

    @Test
    public void isMethod() {
        ActivityController<MainSettingsActivity> isVariable = isNameExpr.isMethod(MainSettingsActivity.class, new Intent(isMethod(), MainSettingsActivity.class));
        isNameExpr.isMethod();
        MainSettingsActivity isVariable = isNameExpr.isMethod();
        Fragment isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr instanceof MainFragment);
    }

    @Test
    public void isMethod() {
        ActivityController<MainSettingsActivity> isVariable = isNameExpr.isMethod(MainSettingsActivity.class);
        isNameExpr.isMethod();
        MainSettingsActivity isVariable = isNameExpr.isMethod();
        BottomNavigationView isVariable = (BottomNavigationView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) instanceof MainFragment);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) instanceof LanguageSettingsFragment);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) instanceof UserInterfaceSettingsFragment);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) instanceof QuickTextKeysBrowseFragment);
        /*isComment*/
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) instanceof MainFragment);
    }

    @Test
    public void isMethod() {
        ActivityController<MainSettingsActivity> isVariable = isNameExpr.isMethod(MainSettingsActivity.class, isMethod("isStringConstant"));
        isNameExpr.isMethod();
        MainSettingsActivity isVariable = isNameExpr.isMethod();
        Fragment isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr instanceof KeyboardAddOnBrowserFragment);
        BottomNavigationView isVariable = (BottomNavigationView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        ActivityController<MainSettingsActivity> isVariable = isNameExpr.isMethod(MainSettingsActivity.class, isMethod("isStringConstant"));
        isNameExpr.isMethod();
        MainSettingsActivity isVariable = isNameExpr.isMethod();
        Fragment isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr instanceof KeyboardThemeSelectorFragment);
        BottomNavigationView isVariable = (BottomNavigationView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        ActivityController<MainSettingsActivity> isVariable = isNameExpr.isMethod(MainSettingsActivity.class, isMethod("isStringConstant"));
        isNameExpr.isMethod();
        MainSettingsActivity isVariable = isNameExpr.isMethod();
        Fragment isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr instanceof GesturesSettingsFragment);
        BottomNavigationView isVariable = (BottomNavigationView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        ActivityController<MainSettingsActivity> isVariable = isNameExpr.isMethod(MainSettingsActivity.class, isMethod("isStringConstant"));
        isNameExpr.isMethod();
        MainSettingsActivity isVariable = isNameExpr.isMethod();
        Fragment isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr instanceof QuickTextKeysBrowseFragment);
        BottomNavigationView isVariable = (BottomNavigationView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    @Config(sdk = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        isNameExpr.isMethod((Application) isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Intent isVariable = isNameExpr.isMethod(isMethod(), MyMainSettingsActivity.class, isNameExpr.isMethod(), isNameExpr);
        isNameExpr.isFieldAccessExpr = null;
        ActivityController<MyMainSettingsActivity> isVariable = isNameExpr.isMethod(MyMainSettingsActivity.class, isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod());
        isNameExpr.isMethod(new String[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr }, isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    @Config(sdk = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        isNameExpr.isMethod((Application) isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Intent isVariable = isNameExpr.isMethod(isMethod(), MyMainSettingsActivity.class, isNameExpr.isMethod(), isNameExpr);
        isNameExpr.isFieldAccessExpr = null;
        ActivityController<MyMainSettingsActivity> isVariable = isNameExpr.isMethod(MyMainSettingsActivity.class, isNameExpr);
        isNameExpr.isMethod();
        PermissionsRequest isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr = null;
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod((Application) isNameExpr.isMethod()).isMethod());
    }

    @Test
    @Config(sdk = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        isNameExpr.isMethod((Application) isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Intent isVariable = isNameExpr.isMethod(isMethod(), MyMainSettingsActivity.class, isNameExpr.isMethod(), isNameExpr);
        isNameExpr.isFieldAccessExpr = null;
        ActivityController<MyMainSettingsActivity> isVariable = isNameExpr.isMethod(MyMainSettingsActivity.class, isNameExpr);
        isNameExpr.isMethod();
        PermissionsRequest isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr = null;
        isNameExpr.isMethod(new String[isIntegerConstant], new String[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr }, new String[isIntegerConstant]);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod((Application) isNameExpr.isMethod()).isMethod());
    }

    @Test
    @Config(sdk = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        isNameExpr.isMethod((Application) isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Intent isVariable = isNameExpr.isMethod(isMethod(), MyMainSettingsActivity.class, isNameExpr.isMethod(), isNameExpr);
        isNameExpr.isFieldAccessExpr = null;
        ActivityController<MyMainSettingsActivity> isVariable = isNameExpr.isMethod(MyMainSettingsActivity.class, isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    public static class isClassOrIsInterface extends MainSettingsActivity {

        public static PermissionsRequest isVariable;

        @NonNull
        @Override
        protected PermissionsRequest isMethod(int isParameter, @NonNull String[] isParameter, @NonNull Intent isParameter) {
            return isNameExpr = super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }
}
