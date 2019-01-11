// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.support.v4.widget.NestedScrollView;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import org.robolectric.shadows.ShadowViewGroup;
import static org.robolectric.shadow.api.Shadow.directlyOn;

@Implements(NestedScrollView.class)
public class isClassOrIsInterface extends ShadowViewGroup {

    @RealObject
    NestedScrollView isVariable;

    private int isVariable = -isIntegerConstant;

    private int isVariable;

    @Implementation
    public void isMethod(int isParameter, int isParameter) {
        isNameExpr = isNameExpr;
        isMethod().isMethod(isNameExpr, isNameExpr);
    }

    @Implementation
    public boolean isMethod(int isParameter) {
        isNameExpr = isNameExpr;
        isMethod().isMethod(isNameExpr);
        return true;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    private NestedScrollView isMethod() {
        return isMethod(isNameExpr, NestedScrollView.class);
    }
}
