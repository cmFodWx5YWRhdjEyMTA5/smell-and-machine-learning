// isComment
package io.github.hidroh.materialistic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.test.ListActivity;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.widget.ListRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.StoryRecyclerViewAdapter;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<ListActivity> isVariable;

    private StoryRecyclerViewAdapter isVariable;

    private io.github.hidroh.materialistic.test.ListActivity isVariable;

    @Mock
    private ListRecyclerViewAdapter.ItemViewHolder isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr = isNameExpr.isMethod(ListActivity.class).isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = new StoryRecyclerViewAdapter(isNameExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isMethod(CustomTabsDelegate.class));
        isNameExpr.isMethod(new Item[] { new TestHnItem(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        }, new TestHnItem(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        } });
    }

    @Test
    public void isMethod() {
        TestHnItem isVariable = new TestHnItem(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        };
        isNameExpr.isMethod(new Item[] { new TestHnItem(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        }, new TestHnItem(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        }, isNameExpr });
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr), isMethod(true), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        TestHnItem isVariable = new TestHnItem(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        };
        isNameExpr.isMethod(new Item[] { isNameExpr, new TestHnItem(isIntegerConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        } });
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr), isMethod(true), isMethod(isIntegerConstant));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
