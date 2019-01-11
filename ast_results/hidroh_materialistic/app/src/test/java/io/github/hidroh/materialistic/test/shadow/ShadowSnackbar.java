// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.view.View;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import java.util.Deque;
import java.util.LinkedList;

@Implements(BaseTransientBottomBar.class)
public class isClassOrIsInterface {

    @RealObject
    Snackbar isVariable;

    private static Deque<View> isVariable = new LinkedList<>();

    @Implementation
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    public static View isMethod() {
        return isNameExpr.isMethod() ? null : isNameExpr.isMethod();
    }

    public static void isMethod() {
        isNameExpr.isMethod();
    }
}
