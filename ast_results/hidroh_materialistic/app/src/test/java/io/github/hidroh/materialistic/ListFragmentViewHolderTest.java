// isComment
package io.github.hidroh.materialistic;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import org.junit.After;
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
import org.robolectric.shadows.ShadowPopupMenu;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.android.controller.ActivityController;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.accounts.UserServices;
import io.github.hidroh.materialistic.data.FavoriteManager;
import io.github.hidroh.materialistic.data.HackerNewsClient;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.MaterialisticDatabase;
import io.github.hidroh.materialistic.data.ResponseListener;
import io.github.hidroh.materialistic.data.SessionManager;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.data.WebItem;
import io.github.hidroh.materialistic.test.ListActivity;
import io.github.hidroh.materialistic.test.TestLayoutManager;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowAnimation;
import io.github.hidroh.materialistic.test.shadow.ShadowItemTouchHelper;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerView;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerViewAdapter;
import io.github.hidroh.materialistic.test.shadow.ShadowSnackbar;
import io.github.hidroh.materialistic.test.shadow.ShadowSwipeRefreshLayout;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyFloat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@Config(shadows = { ShadowSwipeRefreshLayout.class, ShadowRecyclerViewAdapter.class, ShadowRecyclerView.class, ShadowItemTouchHelper.class, ShadowAnimation.class, ShadowSnackbar.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<ListActivity> isVariable;

    private ShadowRecyclerViewAdapter isVariable;

    private ListActivity isVariable;

    private TestHnItem isVariable;

    @Inject
    SessionManager isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Inject
    FavoriteManager isVariable;

    @Inject
    UserServices isVariable;

    @Captor
    ArgumentCaptor<ResponseListener<Item>> isVariable;

    @Captor
    ArgumentCaptor<UserServices.Callback> isVariable;

    private RecyclerView isVariable;

    private ItemTouchHelper.SimpleCallback isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr = new TestHnItem(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        isMethod(isNameExpr.isMethod(isMethod(), isMethod())).isMethod(new Item[] { isNameExpr });
        isNameExpr = isNameExpr.isMethod(ListActivity.class).isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr = (RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (ItemTouchHelper.SimpleCallback) isMethod(isNameExpr).isMethod();
        isNameExpr = isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new PopulatedStory(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(true);
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod();
        isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new PopulatedStory(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public long[] isMethod() {
                return new long[] { isIntegerConstant };
            }
        });
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        View isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr, isMethod()).isMethod(isMethod(WebItem.class));
        Intent isVariable = isMethod(isNameExpr).isMethod();
        isMethod(ItemActivity.class.isMethod(), isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, true);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new PopulatedStory(isIntegerConstant) {

            @Override
            public String isMethod() {
                return isNameExpr;
            }
        });
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new PopulatedStory(isIntegerConstant) {

            @Override
            public String isMethod() {
                return isNameExpr;
            }
        });
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod(WebItem.class));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod());
        isNameExpr.isMethod();
        isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod());
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod());
        isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod()).isMethod();
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
        View isVariable = isNameExpr.isMethod();
        isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr)).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
        Canvas isVariable = isMethod(Canvas.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, -isDoubleConstant, isDoubleConstant, isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod()), isMethod(), isMethod(), isMethod(Paint.class));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(isNameExpr));
        isNameExpr.isMethod(true);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isIntegerConstant);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, UserActivity.class).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod()).isMethod();
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(isNameExpr.isMethod()), isNameExpr.isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
        Canvas isVariable = isMethod(Canvas.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isDoubleConstant, isDoubleConstant, isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod()), isMethod(), isMethod(), isMethod(Paint.class));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(isNameExpr.isMethod()), isNameExpr.isMethod());
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(isNameExpr.isMethod()), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, LoginActivity.class);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(isNameExpr.isMethod()), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new IOException());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, ComposeActivity.class).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isMethod();
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr);
        Canvas isVariable = isMethod(Canvas.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isDoubleConstant, isDoubleConstant, isNameExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod()), isMethod(), isMethod(), isMethod(Paint.class));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr.isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        ShadowRecyclerView isVariable = isMethod(isNameExpr);
        TestLayoutManager isVariable = new TestLayoutManager(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod());
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod());
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        // isComment
        isMethod(isNameExpr).isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isMethod(isNameExpr.isMethod());
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }

    private void isMethod() {
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)));
    }

    private void isMethod() {
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @SuppressLint("isStringConstant")
    private static class isClassOrIsInterface extends TestHnItem {

        public isConstructor(long isParameter) {
            super(isNameExpr);
        }

        @Override
        public String isMethod() {
            return "isStringConstant";
        }

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public long[] isMethod() {
            return new long[isIntegerConstant];
        }

        @Override
        public int isMethod() {
            return isIntegerConstant;
        }
    }
}
