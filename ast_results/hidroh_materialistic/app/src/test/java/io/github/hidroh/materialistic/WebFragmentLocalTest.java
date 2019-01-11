// isComment
package io.github.hidroh.materialistic;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.webkit.WebView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenuItem;
import org.robolectric.shadows.ShadowDialog;
import org.robolectric.shadows.ShadowNetworkInfo;
import org.robolectric.shadows.ShadowWebView;
import org.robolectric.android.controller.ActivityController;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.data.HackerNewsClient;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.ResponseListener;
import io.github.hidroh.materialistic.test.TestItem;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.TestWebItem;
import io.github.hidroh.materialistic.test.WebActivity;
import io.github.hidroh.materialistic.test.shadow.ShadowPreferenceFragmentCompat;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@Config(shadows = { ShadowPreferenceFragmentCompat.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<WebActivity> isVariable;

    private WebActivity isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Captor
    ArgumentCaptor<ResponseListener<Item>> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(WebActivity.class);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isMethod((ConnectivityManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant, true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        TestWebItem isVariable = new TestWebItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(WebActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ShadowWebView isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        TestItem isVariable = new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(WebActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ShadowWebView isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        TestWebItem isVariable = new TestWebItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(WebActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        Fragment isVariable = isNameExpr.isMethod().isMethod(WebFragment.class.isMethod());
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), "isStringConstant").isMethod();
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ShadowWebView isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod("isStringConstant").isMethod("isStringConstant");
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
