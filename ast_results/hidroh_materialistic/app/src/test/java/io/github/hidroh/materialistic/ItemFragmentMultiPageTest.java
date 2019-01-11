// isComment
package io.github.hidroh.materialistic;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenuItem;
import org.robolectric.shadow.api.Shadow;
import org.robolectric.shadows.ShadowNetworkInfo;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.ResponseListener;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.data.WebItem;
import io.github.hidroh.materialistic.test.TestItem;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.CustomShadows;
import io.github.hidroh.materialistic.test.shadow.ShadowPreferenceFragmentCompat;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerViewAdapter;
import io.github.hidroh.materialistic.test.shadow.ShadowSwipeRefreshLayout;
import static junit.framework.Assert.assertEquals;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.android.support.v4.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@Config(shadows = { ShadowSwipeRefreshLayout.class, ShadowRecyclerViewAdapter.class, ShadowPreferenceFragmentCompat.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Captor
    ArgumentCaptor<ResponseListener<Item>> isVariable;

    private ActivityController<TestItemActivity> isVariable;

    private TestItemActivity isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isMethod((ConnectivityManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant, true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr = isNameExpr.isMethod(TestItemActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {
        });
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isMethod(isNameExpr);
        isMethod((View) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        WebItem isVariable = isMethod(WebItem.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestItem() {

            @Override
            public Item[] isMethod() {
                return new Item[] { new TestItem() {
                } };
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        });
        isMethod((View) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        Item isVariable = new TestHnItem(isStringConstant);
        isNameExpr.isMethod(new TestItem() {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public long[] isMethod() {
                return new long[] { isStringConstant };
            }
        });
        isNameExpr.isMethod()[isIntegerConstant].isMethod(new TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public long[] isMethod() {
                return new long[] { isStringConstant };
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        });
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isMethod(isNameExpr);
        isMethod((View) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        RecyclerView isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        Intent isVariable = isMethod(isNameExpr.isMethod()).isMethod();
        isMethod(ItemActivity.class.isMethod(), isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, true);
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        Item isVariable = new TestHnItem(isStringConstant);
        isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @Override
            public long[] isMethod() {
                return new long[] { isStringConstant };
            }
        });
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestHnItem(isStringConstant) {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isMethod(isIntegerConstant, isNameExpr.isMethod()[isIntegerConstant].isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod()[isIntegerConstant].isMethod());
    }

    @Test
    public void isMethod() {
        WebItem isVariable = isMethod(WebItem.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isMethod(isNameExpr);
        ShadowSwipeRefreshLayout isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(new TestHnItem(isStringConstant));
        isMethod((SwipeRefreshLayout) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(((TestItemActivity) isNameExpr.isMethod()).isFieldAccessExpr).isMethod(isMethod(Item.class));
    }

    @Test
    public void isMethod() {
        WebItem isVariable = isMethod(WebItem.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isMethod(isNameExpr);
        ShadowSwipeRefreshLayout isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(null);
        isMethod((SwipeRefreshLayout) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        WebItem isVariable = isMethod(WebItem.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isMethod(isNameExpr);
        isNameExpr.isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod()).isMethod(PopupSettingsFragment.class.isMethod());
    }

    @After
    public void isMethod() {
        isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
    }

    private void isMethod(Fragment isParameter) {
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, "isStringConstant").isMethod();
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
    }

    public static class isClassOrIsInterface extends InjectableActivity implements ItemFragment.ItemChangedListener {

        ItemFragment.ItemChangedListener isVariable = isMethod(ItemFragment.ItemChangedListener.class);

        @Override
        protected void isMethod(Bundle isParameter) {
            super.isMethod(isNameExpr);
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }

        @Override
        public void isMethod(@NonNull Item isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
