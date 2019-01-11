// isComment
package io.github.hidroh.materialistic;

import android.support.v4.widget.NestedScrollView;
import android.view.View;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.github.hidroh.materialistic.test.TestRunner;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private NestedScrollView isVariable;

    private KeyDelegate.NestedScrollViewHelper isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isMethod(NestedScrollView.class);
        isNameExpr = new KeyDelegate.NestedScrollViewHelper(isNameExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isIntegerConstant), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
    }
}
