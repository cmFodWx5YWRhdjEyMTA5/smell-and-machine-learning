// isComment
package com.github.mobile.ui.user;

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
                return isNameExpr.isMethod(isNameExpr.isMethod(), true, isNameExpr, isNameExpr);
            }
        };
    }
}
