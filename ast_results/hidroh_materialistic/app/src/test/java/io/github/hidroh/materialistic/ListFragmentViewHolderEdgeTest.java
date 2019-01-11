// isComment
package io.github.hidroh.materialistic;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
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
import org.robolectric.android.controller.ActivityController;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.data.HackerNewsClient;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.ResponseListener;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.test.ListActivity;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerViewAdapter;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static org.assertj.android.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@Config(shadows = { ShadowRecyclerViewAdapter.class })
@SuppressWarnings("isStringConstant")
@SuppressLint("isStringConstant")
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<ListActivity> isVariable;

    private RecyclerView.ViewHolder isVariable;

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
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr))).isMethod(new Item[] { new TestHnItem(isStringConstant) });
        isNameExpr = isNameExpr.isMethod(ListActivity.class).isMethod().isMethod().isMethod().isMethod();
        ListActivity isVariable = isNameExpr.isMethod();
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, HackerNewsClient.class.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, ListFragment.class.isMethod(), isNameExpr)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
        RecyclerView isVariable = (RecyclerView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ShadowRecyclerViewAdapter isVariable = isMethod(isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(null);
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(null);
        isMethod((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
