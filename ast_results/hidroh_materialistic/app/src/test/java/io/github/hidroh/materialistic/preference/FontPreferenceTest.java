// isComment
package io.github.hidroh.materialistic.preference;

import android.content.Intent;
import android.support.v7.preference.PreferenceGroupAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Spinner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.ParameterizedRobolectricTestRunner;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import java.util.Arrays;
import java.util.List;
import io.github.hidroh.materialistic.Application;
import io.github.hidroh.materialistic.PreferencesActivity;
import io.github.hidroh.materialistic.R;
import io.github.hidroh.materialistic.test.shadow.CustomShadows;
import io.github.hidroh.materialistic.test.shadow.ShadowPreferenceFragmentCompat;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerViewAdapter;
import io.github.hidroh.materialistic.test.shadow.ShadowSupportPreference;
import io.github.hidroh.materialistic.test.shadow.ShadowSupportPreferenceManager;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

@Config(shadows = { ShadowSupportPreferenceManager.class, ShadowSupportPreference.class, ShadowPreferenceFragmentCompat.class, ShadowRecyclerViewAdapter.class })
@RunWith(ParameterizedRobolectricTestRunner.class)
public class isClassOrIsInterface {

    private final int isVariable;

    private PreferencesActivity isVariable;

    private ActivityController<PreferencesActivity> isVariable;

    private View isVariable;

    @ParameterizedRobolectricTestRunner.Parameters
    public static List<Object[]> isMethod() {
        return isNameExpr.isMethod(new Object[] { isIntegerConstant }, new Object[] { isIntegerConstant }, new Object[] { isIntegerConstant }, new Object[] { isIntegerConstant });
    }

    public isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(PreferencesActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr = isNameExpr.isMethod().isMethod(null).isMethod().isMethod().isMethod().isMethod();
        RecyclerView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new LinearLayoutManager(isNameExpr));
        RecyclerView.Adapter isVariable = isNameExpr.isMethod();
        int isVariable = isNameExpr.isMethod((PreferenceGroupAdapter) isNameExpr, FontPreference.class);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
        isNameExpr = isNameExpr.isFieldAccessExpr;
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        ((Spinner) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        ((Spinner) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
