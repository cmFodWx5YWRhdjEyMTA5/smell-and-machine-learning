// isComment
package io.github.hidroh.materialistic;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.ResponseListener;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.CustomShadows;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerViewAdapter;
import static junit.framework.Assert.assertEquals;
import static org.assertj.android.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.robolectric.Shadows.shadowOf;

@Config(shadows = { ShadowRecyclerViewAdapter.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<ThreadPreviewActivity> isVariable;

    private ThreadPreviewActivity isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Inject
    KeyDelegate isVariable;

    @Captor
    ArgumentCaptor<ResponseListener<Item>> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(ThreadPreviewActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, new TestHnItem(isStringConstant) {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        }));
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(ThreadPreviewActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        RecyclerView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr.isFieldAccessExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr.isFieldAccessExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        // isComment
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant);
        isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod(isIntegerConstant));
        RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod(isIntegerConstant));
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, ItemActivity.class).isMethod(isNameExpr.isFieldAccessExpr);
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
