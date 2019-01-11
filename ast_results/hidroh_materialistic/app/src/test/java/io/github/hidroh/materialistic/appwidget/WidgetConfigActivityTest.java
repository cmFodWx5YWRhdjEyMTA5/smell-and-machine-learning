// isComment
package io.github.hidroh.materialistic.appwidget;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.job.JobScheduler;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import io.github.hidroh.materialistic.R;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowPreferenceFragmentCompat;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@Config(shadows = { ShadowPreferenceFragmentCompat.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<WidgetConfigActivity> isVariable;

    private WidgetConfigActivity isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(WidgetConfigActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant));
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(WidgetProvider.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isMethod((JobScheduler) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod()).isMethod();
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
