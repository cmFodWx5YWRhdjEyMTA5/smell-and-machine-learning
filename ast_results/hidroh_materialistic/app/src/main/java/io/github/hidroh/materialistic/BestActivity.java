// isComment
package io.github.hidroh.materialistic;

import android.support.annotation.NonNull;
import io.github.hidroh.materialistic.data.ItemManager;

public class isClassOrIsInterface extends BaseStoriesActivity {

    @NonNull
    @Override
    protected String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
