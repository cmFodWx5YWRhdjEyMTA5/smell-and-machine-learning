// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import org.robolectric.shadows.ShadowViewGroup;
import static org.robolectric.shadow.api.Shadow.directlyOn;

@Implements(RecyclerView.class)
public class isClassOrIsInterface extends ShadowViewGroup {

    @RealObject
    RecyclerView isVariable;

    private int isVariable;

    private ItemTouchHelper.Callback isVariable;

    private RecyclerView.OnScrollListener isVariable;

    @Implementation
    public void isMethod(int isParameter) {
        isMethod().isMethod(isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Implementation
    public void isMethod(int isParameter) {
        isMethod().isMethod(isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Implementation
    public void isMethod(RecyclerView.OnScrollListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(RecyclerView.OnScrollListener isParameter) {
        if (isNameExpr == isNameExpr) {
            isNameExpr = null;
        }
    }

    public ItemTouchHelper.Callback isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public RecyclerView.OnScrollListener isMethod() {
        return isNameExpr;
    }

    void isMethod(ItemTouchHelper.Callback isParameter) {
        isNameExpr = isNameExpr;
    }

    private RecyclerView isMethod() {
        return isMethod(isNameExpr, RecyclerView.class);
    }
}
