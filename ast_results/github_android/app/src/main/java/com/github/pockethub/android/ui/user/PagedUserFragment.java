// isComment
package com.github.pockethub.android.ui.user;

import android.support.annotation.NonNull;
import android.view.View;
import com.github.pockethub.android.ui.item.UserItem;
import com.meisolsson.githubsdk.model.User;
import com.github.pockethub.android.ui.PagedItemFragment;
import com.github.pockethub.android.util.AvatarLoader;
import com.xwray.groupie.Item;
import javax.inject.Inject;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends PagedItemFragment<User> {

    /**
     * isComment
     */
    @Inject
    protected AvatarLoader isVariable;

    @Override
    protected Item isMethod(User isParameter) {
        return new UserItem(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NonNull Item isParameter, @NonNull View isParameter) {
        if (isNameExpr instanceof UserItem) {
            User isVariable = ((UserItem) isNameExpr).isMethod();
            isMethod(isNameExpr.isMethod(isNameExpr));
        }
    }
}
