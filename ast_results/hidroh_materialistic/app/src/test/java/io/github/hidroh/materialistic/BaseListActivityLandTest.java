// isComment
package io.github.hidroh.materialistic;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupMenu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import org.robolectric.shadow.api.Shadow;
import org.robolectric.shadows.ShadowApplication;
import org.robolectric.shadows.ShadowLooper;
import org.robolectric.shadows.ShadowPopupMenu;
import javax.inject.Inject;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.data.WebItem;
import io.github.hidroh.materialistic.test.TestListActivity;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.TestWebItem;
import io.github.hidroh.materialistic.test.shadow.ShadowFloatingActionButton;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerView;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.android.support.v4.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.robolectric.Shadows.shadowOf;

@Config(qualifiers = "isStringConstant", shadows = { ShadowFloatingActionButton.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<TestListActivity> isVariable;

    private TestListActivity isVariable;

    @Inject
    KeyDelegate isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isNameExpr = isNameExpr.isMethod(TestListActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod(null).isMethod().isMethod().isMethod();
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
        isMethod(((ShadowFloatingActionButton) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        });
        isMethod(isNameExpr).isMethod("isStringConstant");
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(TestListActivity.class);
        isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod(null).isMethod().isMethod().isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr = new Bundle();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod(TestListActivity.class);
        isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod(null).isMethod().isMethod().isMethod();
        isMethod(isNameExpr).isMethod("isStringConstant");
        isMethod(((ShadowFloatingActionButton) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        });
        isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, ComposeActivity.class);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        });
        ViewPager isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isMethod());
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isMethod());
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(null);
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(((ShadowFloatingActionButton) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isMethod());
        TabLayout isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod();
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isMethod();
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isMethod();
    }

    @Config(shadows = ShadowRecyclerView.class)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        });
        TabLayout isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        ViewPager isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(KeyDelegate.BackInterceptor.class));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
    }

    private void isMethod() {
        isMethod((ViewPager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isIntegerConstant);
        isMethod(((ShadowFloatingActionButton) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod());
    }

    private void isMethod() {
        isMethod((ViewPager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isIntegerConstant);
        isMethod(((ShadowFloatingActionButton) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod());
    }

    private WebItem isMethod() {
        return new TestWebItem() {

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
