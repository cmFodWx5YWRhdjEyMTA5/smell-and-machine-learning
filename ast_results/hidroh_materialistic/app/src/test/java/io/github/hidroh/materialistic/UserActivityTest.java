// isComment
package io.github.hidroh.materialistic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
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
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.android.controller.ActivityController;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.ResponseListener;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.data.UserManager;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerView;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerViewAdapter;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static junit.framework.Assert.assertEquals;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@Config(shadows = ShadowRecyclerViewAdapter.class)
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<UserActivity> isVariable;

    private UserActivity isVariable;

    @Inject
    UserManager isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Inject
    KeyDelegate isVariable;

    @Captor
    ArgumentCaptor<ResponseListener<UserManager.User>> isVariable;

    @Captor
    ArgumentCaptor<ResponseListener<Item>> isVariable;

    private UserManager.User isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr = isNameExpr.isMethod(UserActivity.class, isNameExpr);
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isMethod(UserManager.User.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(Context.class))).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isStringConstant);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(new Item[] { new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        }, new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        } });
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant), ((TabLayout) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isIntegerConstant).isMethod());
        isMethod(isIntegerConstant, (((RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod()).isMethod());
        isMethod(isNameExpr).isMethod();
        isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod(null);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(null);
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(null);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @Config(shadows = ShadowRecyclerView.class)
    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView isVariable = (RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
        TabLayout.Tab isVariable = ((TabLayout) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isIntegerConstant);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(UserActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"));
        isNameExpr = isNameExpr.isMethod(UserActivity.class, isNameExpr);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"));
        isNameExpr = isNameExpr.isMethod(UserActivity.class, isNameExpr);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(UserActivity.class, isNameExpr);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView isVariable = (RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestHnItem(isStringConstant) {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        RecyclerView.ViewHolder isVariable = isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, ThreadPreviewActivity.class).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView isVariable = (RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestHnItem(isStringConstant) {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        });
        RecyclerView.ViewHolder isVariable = isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant));
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod("isStringConstant");
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, ItemActivity.class).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
        RecyclerView isVariable = (RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestHnItem(isStringConstant) {

            @Override
            public boolean isMethod() {
                return true;
            }
        });
        RecyclerView.ViewHolder isVariable = isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Scrollable.class), isMethod());
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
