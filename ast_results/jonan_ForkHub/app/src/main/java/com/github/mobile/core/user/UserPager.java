// isComment
package com.github.mobile.core.user;

import com.github.mobile.core.ResourcePager;
import org.eclipse.egit.github.core.User;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ResourcePager<User> {

    @Override
    protected Object isMethod(User isParameter) {
        return isNameExpr.isMethod();
    }
}
