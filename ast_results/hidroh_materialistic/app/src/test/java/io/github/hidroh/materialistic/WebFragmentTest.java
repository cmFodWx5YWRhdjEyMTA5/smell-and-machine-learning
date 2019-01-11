// isComment
package io.github.hidroh.materialistic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v4.widget.NestedScrollView;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ViewSwitcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenuItem;
import org.robolectric.shadow.api.Shadow;
import org.robolectric.shadows.ShadowNetworkInfo;
import org.robolectric.shadows.ShadowPackageManager;
import org.robolectric.shadows.ShadowPopupMenu;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.shadows.support.v4.ShadowLocalBroadcastManager;
import java.io.File;
import java.io.IOException;
import javax.inject.Inject;
import io.github.hidroh.materialistic.data.FavoriteManager;
import io.github.hidroh.materialistic.data.FileDownloader;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ReadabilityClient;
import io.github.hidroh.materialistic.data.WebItem;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.WebActivity;
import io.github.hidroh.materialistic.test.shadow.ShadowNestedScrollView;
import io.github.hidroh.materialistic.test.shadow.ShadowWebView;
import okio.Okio;
import static io.github.hidroh.materialistic.WebFragment.PDF_LOADER_URL;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@Config(shadows = { ShadowWebView.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private WebActivity isVariable;

    private ActivityController<WebActivity> isVariable;

    private WebItem isVariable;

    @Inject
    FavoriteManager isVariable;

    @Inject
    ReadabilityClient isVariable;

    private Intent isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isNameExpr = isMethod(WebItem.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(WebActivity.class, isNameExpr);
        isMethod((ConnectivityManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant, true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        ProgressBar isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        ResolveInfo isVariable = new ResolveInfo();
        isNameExpr.isFieldAccessExpr = new ActivityInfo();
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr = new ApplicationInfo();
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr = ListActivity.class.isMethod().isMethod();
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr = ListActivity.class.isMethod();
        ShadowPackageManager isVariable = isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr)), isNameExpr);
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ShadowWebView isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr, "isStringConstant", "isStringConstant", "isStringConstant", isStringConstant);
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod());
    }

    @Test
    public void isMethod() {
        ResolveInfo isVariable = new ResolveInfo();
        isNameExpr.isFieldAccessExpr = new ActivityInfo();
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr = new ApplicationInfo();
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr = ListActivity.class.isMethod().isMethod();
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr = ListActivity.class.isMethod();
        ShadowPackageManager isVariable = isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod())), isNameExpr);
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ShadowWebView isVariable = isNameExpr.isMethod(isNameExpr);
        WebFragment isVariable = (WebFragment) isNameExpr.isMethod().isMethod(WebFragment.class.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), "isStringConstant", "isStringConstant", "isStringConstant", isStringConstant);
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod("isStringConstant"), isMethod(FileDownloader.FileDownloaderCallback.class));
    }

    @Test
    public void isMethod() throws IOException {
        final String isVariable = this.isMethod().isMethod().isMethod("isStringConstant").isMethod();
        final File isVariable = new File(isNameExpr);
        final long isVariable = isNameExpr.isMethod();
        final String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(), isNameExpr.isFieldAccessExpr);
        final WebFragment.PdfAndroidJavascriptBridge isVariable = new WebFragment.PdfAndroidJavascriptBridge(isNameExpr, null);
        isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant, isNameExpr));
    }

    @Test
    public void isMethod() {
        final String isVariable = this.isMethod().isMethod().isMethod("isStringConstant").isMethod();
        final long isVariable = new File(isNameExpr).isMethod();
        final WebFragment.PdfAndroidJavascriptBridge isVariable = new WebFragment.PdfAndroidJavascriptBridge(isNameExpr, null);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Config(shadows = ShadowNestedScrollView.class)
    @Test
    public void isMethod() {
        NestedScrollView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(-isIntegerConstant, ((ShadowWebView) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        ViewSwitcher isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        ShadowWebView isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        // isComment
        EditText isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(null, isIntegerConstant, null);
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod().isMethod(null, isIntegerConstant, null);
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod().isMethod(null, isIntegerConstant, null);
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        isNameExpr.isFieldAccessExpr = null;
        ShadowWebView isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @SuppressLint("isStringConstant")
    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        ShadowWebView isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
    }

    @Config(shadows = ShadowNestedScrollView.class)
    @Test
    public void isMethod() {
        ShadowNestedScrollView isVariable = isMethod((NestedScrollView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        WebFragment isVariable = (WebFragment) isNameExpr.isMethod().isMethod(WebFragment.class.isMethod());
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        ShadowWebView isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        WebFragment isVariable = (WebFragment) isNameExpr.isMethod().isMethod(WebFragment.class.isMethod());
        isNameExpr.isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr).isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr).isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod("isStringConstant"), isMethod());
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
