// isComment
package com.github.mobile.ui.repo;

import static com.github.mobile.Intents.EXTRA_REPOSITORY;
import android.content.Context;
import com.github.mobile.core.ResourcePager;
import com.github.mobile.core.user.UserEventMatcher.UserPair;
import com.github.mobile.ui.NewsFragment;
import com.github.mobile.ui.issue.IssuesViewActivity;
import com.github.mobile.ui.user.EventPager;
import com.github.mobile.ui.user.UserViewActivity;
import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.PageIterator;
import org.eclipse.egit.github.core.event.Event;

/**
 * isComment
 */
public class isClassOrIsInterface extends NewsFragment {

    private Repository isVariable;

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
        isNameExpr = isMethod(isNameExpr);
    }

    @Override
    protected ResourcePager<Event> isMethod() {
        return new EventPager() {

            @Override
            public PageIterator<Event> isMethod(int isParameter, int isParameter) {
                return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        };
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod(Repository isParameter) {
        if (!isNameExpr.isMethod().isMethod(isNameExpr.isMethod()))
            super.isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(Issue isParameter, Repository isParameter) {
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
    }

    @Override
    protected boolean isMethod(User isParameter) {
        if (isNameExpr.isMethod().isMethod() != isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod(isNameExpr));
            return true;
        }
        return true;
    }

    @Override
    protected void isMethod(UserPair isParameter) {
        if (!isMethod(isNameExpr.isFieldAccessExpr))
            isMethod(isNameExpr.isFieldAccessExpr);
    }
}
