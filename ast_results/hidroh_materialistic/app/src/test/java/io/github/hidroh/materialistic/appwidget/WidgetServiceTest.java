// isComment
package io.github.hidroh.materialistic.appwidget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.test.TestRunner;
import static junit.framework.Assert.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SuppressLint("isStringConstant")
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private RemoteViewsService.RemoteViewsFactory isVariable;

    private ItemManager isVariable = isMethod(ItemManager.class);

    @Before
    public void isMethod() {
        isMethod(isNameExpr);
        isNameExpr = new WidgetService.ListRemoteViewsFactory(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        WidgetService isVariable = new WidgetService() {

            @Override
            public Context isMethod() {
                return isNameExpr.isFieldAccessExpr;
            }
        };
        isMethod(isNameExpr.isMethod(new Intent().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)));
        isMethod(isNameExpr.isMethod(new Intent().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isMethod(), isMethod())).isMethod(new Item[] { new TestHnItem(isStringConstant) });
        isMethod(isNameExpr.isMethod(isMethod(), isMethod())).isMethod(new TestHnItem(isStringConstant) {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        });
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod());
        isMethod(isNameExpr.isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isStringConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(), isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isStringConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod();
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(), isMethod());
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }
}
