// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.support.v4.widget.SwipeRefreshLayout;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowViewGroup;

@Implements(value = SwipeRefreshLayout.class, inheritImplementationMethods = true)
public class isClassOrIsInterface extends ShadowViewGroup {

    private SwipeRefreshLayout.OnRefreshListener isVariable;

    @Implementation
    public void isMethod(SwipeRefreshLayout.OnRefreshListener isParameter) {
        isNameExpr = isNameExpr;
    }

    public SwipeRefreshLayout.OnRefreshListener isMethod() {
        return isNameExpr;
    }
}
