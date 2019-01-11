// isComment
package com.github.mobile.ui.user;

import com.github.mobile.accounts.AccountUtils;
import com.github.mobile.core.ResourcePager;
import org.eclipse.egit.github.core.client.PageIterator;
import org.eclipse.egit.github.core.event.Event;

/**
 * isComment
 */
public class isClassOrIsInterface extends UserNewsFragment {

    @Override
    protected ResourcePager<Event> isMethod() {
        return new EventPager() {

            @Override
            public PageIterator<Event> isMethod(int isParameter, int isParameter) {
                String isVariable = isNameExpr.isMethod(isMethod());
                return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            }
        };
    }
}
