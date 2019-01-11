// isComment
package io.github.hidroh.materialistic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.webkit.WebView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenuItem;
import org.robolectric.shadows.ShadowNetworkInfo;
import org.robolectric.shadows.ShadowPopupMenu;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.shadows.support.v4.ShadowLocalBroadcastManager;
import org.robolectric.android.controller.ActivityController;
import javax.inject.Inject;
import io.github.hidroh.materialistic.data.ReadabilityClient;
import io.github.hidroh.materialistic.data.WebItem;
import io.github.hidroh.materialistic.test.TestReadabilityActivity;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.TestWebItem;
import io.github.hidroh.materialistic.test.shadow.ShadowNestedScrollView;
import io.github.hidroh.materialistic.test.shadow.ShadowPreferenceFragmentCompat;
import io.github.hidroh.materialistic.test.shadow.ShadowWebView;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static junit.framework.Assert.assertEquals;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.android.support.v4.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@Config(shadows = { ShadowWebView.class, ShadowPreferenceFragmentCompat.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private TestReadabilityActivity isVariable;

    private ActivityController<TestReadabilityActivity> isVariable;

    @Inject
    ReadabilityClient isVariable;

    @Captor
    ArgumentCaptor<ReadabilityClient.Callback> isVariable;

    private WebFragment isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(TestReadabilityActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod((ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant, true, true));
        Bundle isVariable = new Bundle();
        WebItem isVariable = new TestWebItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = (WebFragment) isNameExpr.isMethod(isNameExpr, WebFragment.class.isMethod(), isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, "isStringConstant").isMethod();
    }

    @Test
    public void isMethod() {
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant");
        WebView isVariable = (WebView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isMethod(isNameExpr).isMethod().isFieldAccessExpr).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        isNameExpr = (WebView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isMethod(isNameExpr).isMethod().isFieldAccessExpr).isMethod("isStringConstant");
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(null);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        WebView isVariable = (WebView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Config(shadows = ShadowNestedScrollView.class)
    @Test
    public void isMethod() {
        NestedScrollView isVariable = (NestedScrollView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant");
        isNameExpr.isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod()).isMethod(PopupSettingsFragment.class.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), "isStringConstant").isMethod();
        WebView isVariable = (WebView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isMethod(isNameExpr).isMethod().isFieldAccessExpr).isMethod("isStringConstant");
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), "isStringConstant").isMethod();
        WebView isVariable = (WebView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isMethod(isNameExpr).isMethod().isFieldAccessExpr).isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        WebView isVariable = (WebView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isMethod(isNameExpr).isMethod()).isMethod("isStringConstant");
    }

    @SuppressLint("isStringConstant")
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod()).isMethod(PopupSettingsFragment.class.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant");
    }
}
