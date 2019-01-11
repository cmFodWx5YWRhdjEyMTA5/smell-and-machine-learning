// isComment
package com.github.mobile.ui.user;

import com.github.mobile.core.ResourcePager;
import org.eclipse.egit.github.core.event.Event;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ResourcePager<Event> {

    @Override
    protected Object isMethod(Event isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    protected Event isMethod(Event isParameter) {
        return isNameExpr.isMethod(isNameExpr) ? isNameExpr : null;
    }
}
