// isComment
package com.github.mobile.ui.user;

import static com.github.mobile.Intents.EXTRA_USER;
import android.content.Context;
import com.github.mobile.core.ResourcePager;
import com.github.mobile.core.user.UserPager;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.PageIterator;

/**
 * isComment
 */
public class isClassOrIsInterface extends FollowingFragment {

    private User isVariable;

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr);
    }

    @Override
    protected ResourcePager<User> isMethod() {
        return new UserPager() {

            @Override
            public PageIterator<User> isMethod(int isParameter, int isParameter) {
                return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr);
            }
        };
    }
}
