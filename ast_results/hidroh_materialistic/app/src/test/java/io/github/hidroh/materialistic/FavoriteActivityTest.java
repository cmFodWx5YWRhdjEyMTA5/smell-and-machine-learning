// isComment
package io.github.hidroh.materialistic;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenuItem;
import org.robolectric.shadows.ShadowAlertDialog;
import org.robolectric.shadows.ShadowPopupMenu;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.android.controller.ActivityController;
import java.io.IOException;
import java.util.Set;
import javax.inject.Inject;
import io.github.hidroh.materialistic.accounts.UserServices;
import io.github.hidroh.materialistic.data.FavoriteManager;
import io.github.hidroh.materialistic.data.LocalItemManager;
import io.github.hidroh.materialistic.data.MaterialisticDatabase;
import io.github.hidroh.materialistic.data.SyncScheduler;
import io.github.hidroh.materialistic.data.TestFavorite;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.data.WebItem;
import io.github.hidroh.materialistic.test.TestFavoriteActivity;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowItemTouchHelper;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerView;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerViewAdapter;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@Config(shadows = { ShadowRecyclerViewAdapter.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<TestFavoriteActivity> isVariable;

    private TestFavoriteActivity isVariable;

    private RecyclerView.Adapter isVariable;

    private RecyclerView isVariable;

    private Fragment isVariable;

    @Inject
    FavoriteManager isVariable;

    @Inject
    ActionViewResolver isVariable;

    @Inject
    UserServices isVariable;

    @Inject
    KeyDelegate isVariable;

    @Inject
    SyncScheduler isVariable;

    @Captor
    ArgumentCaptor<Set<String>> isVariable;

    @Captor
    ArgumentCaptor<View.OnClickListener> isVariable;

    @Captor
    ArgumentCaptor<SearchView.OnCloseListener> isVariable;

    @Captor
    ArgumentCaptor<UserServices.Callback> isVariable;

    @Captor
    ArgumentCaptor<LocalItemManager.Observer> isVariable;

    private ShadowRecyclerViewAdapter isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(MenuItem.class)));
        isNameExpr = isNameExpr.isMethod(TestFavoriteActivity.class);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(isIntegerConstant))).isMethod(new TestFavorite("isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isMethod()));
        isMethod(isNameExpr.isMethod(isMethod(isIntegerConstant))).isMethod(new TestFavorite("isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isMethod()));
        // isComment
        isNameExpr = isNameExpr.isMethod().isMethod(null).isMethod().isMethod().isMethod().isMethod();
        isNameExpr = (RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(Activity.class));
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(new Intent());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        AlertDialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        SearchView isVariable = (SearchView) isNameExpr.isMethod(isMethod(MenuItem.class));
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isMethod().isMethod() - isIntegerConstant).isMethod(isNameExpr);
        isMethod(((FavoriteFragment) isNameExpr).isMethod(null));
        SearchView.OnCloseListener isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isMethod().isMethod() - isIntegerConstant);
        isNameExpr.isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        ((FavoriteFragment) isNameExpr).isMethod("isStringConstant");
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr.isMethod(), isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(isIntegerConstant))).isMethod(new TestFavorite("isStringConstant", "isStringConstant", "isStringConstant", isNameExpr.isMethod()));
        isNameExpr.isMethod().isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod(true));
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isMethod(isNameExpr).isMethod());
    }

    @Test
    public void isMethod() {
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isMethod(isNameExpr).isMethod());
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isMethod(isNameExpr).isMethod());
    }

    @Test
    public void isMethod() {
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod();
        ActionMode isVariable = isMethod(ActionMode.class);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        AlertDialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod();
        ActionMode isVariable = isMethod(ActionMode.class);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod());
        isMethod(isNameExpr).isMethod();
    }

    @Config(shadows = { ShadowRecyclerView.class, ShadowItemTouchHelper.class })
    @Test
    public void isMethod() {
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(WebItem.class));
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Config(shadows = { ShadowRecyclerView.class, ShadowItemTouchHelper.class })
    @Test
    public void isMethod() {
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(), isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod());
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(LocalItemManager.Observer.class), isMethod("isStringConstant"));
        isNameExpr = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(LocalItemManager.Observer.class), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr);
        ActivityController<TestFavoriteActivity> isVariable = isNameExpr.isMethod(TestFavoriteActivity.class).isMethod(isNameExpr).isMethod(isNameExpr).isMethod().isMethod().isMethod();
        isMethod(isIntegerConstant, ((RecyclerView) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod());
        isNameExpr.isMethod().isMethod().isMethod();
        isMethod(isNameExpr);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, LoginActivity.class);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new IOException());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, ComposeActivity.class);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new TestHnItem(isStringConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new TestHnItem(isStringConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Scrollable.class), isMethod(AppBarLayout.class));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Activity.class));
        isNameExpr.isMethod();
    }
}
