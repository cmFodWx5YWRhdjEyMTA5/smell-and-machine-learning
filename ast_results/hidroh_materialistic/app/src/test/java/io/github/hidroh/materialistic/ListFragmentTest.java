// isComment
package io.github.hidroh.materialistic;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import org.assertj.android.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenuItem;
import org.robolectric.shadow.api.Shadow;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.data.HackerNewsClient;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.test.ListActivity;
import io.github.hidroh.materialistic.test.TestItem;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowPreferenceFragmentCompat;
import io.github.hidroh.materialistic.test.shadow.ShadowSnackbar;
import io.github.hidroh.materialistic.test.shadow.ShadowSwipeRefreshLayout;
import io.github.hidroh.materialistic.widget.ListRecyclerViewAdapter;
import static junit.framework.Assert.assertEquals;
import static org.assertj.android.support.v4.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@Config(shadows = { ShadowSwipeRefreshLayout.class, ShadowSnackbar.class, ShadowPreferenceFragmentCompat.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<ListActivity> isVariable;

    private ListActivity isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(ListActivity.class).isMethod().isMethod(null).isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr)).isMethod();
        isMethod((SwipeRefreshLayout) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr)).isMethod();
        ShadowSwipeRefreshLayout isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod();
        // isComment
        isMethod(isNameExpr).isMethod(isMethod(String.class), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(String.class), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr))).isMethod(new Item[] { new TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        } });
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr))).isMethod(new Item[] { new TestHnItem(isStringConstant), new TestHnItem(isStringConstant) });
        ShadowSwipeRefreshLayout isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod();
        // isComment
        isMethod(isNameExpr).isMethod(isMethod(String.class), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isIntegerConstant, ((RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod());
        View isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isIntegerConstant, ((RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod());
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isIntegerConstant, ((RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod());
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr))).isMethod(new Item[] { new TestItem() {
        } });
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        Fragment isVariable = isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr);
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(String.class), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr))).isMethod(new Item[isIntegerConstant]);
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isMethod((SwipeRefreshLayout) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr))).isMethod(new Item[] {});
        ShadowSwipeRefreshLayout isVariable = (ShadowSwipeRefreshLayout) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr)).isMethod();
        isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr), ListFragment.class.isMethod()).isMethod();
        isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod().isMethod(ListFragment.class.isMethod()).isMethod(isMethod(isNameExpr).isMethod());
        isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr), ListFragment.class.isMethod()).isMethod();
        isNameExpr.isMethod().isMethod(ListFragment.class.isMethod()).isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod()).isMethod(PopupSettingsFragment.class.isMethod());
    }

    private void isMethod() {
        isMethod(((ListRecyclerViewAdapter) ((RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod()).isMethod()).isMethod();
    }

    private void isMethod() {
        isMethod(((ListRecyclerViewAdapter) ((RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod()).isMethod()).isMethod();
    }
}
