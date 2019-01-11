// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;

@Implements(ItemTouchHelper.class)
public class isClassOrIsInterface {

    private ItemTouchHelper.Callback isVariable;

    public void isMethod(ItemTouchHelper.Callback isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Implementation
    public void isMethod(RecyclerView isParameter) {
        if (isNameExpr == null) {
            return;
        }
        isMethod(isNameExpr).isMethod(this.isFieldAccessExpr);
    }
}
