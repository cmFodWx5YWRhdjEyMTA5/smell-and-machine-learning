// isComment
package com.github.mobile.ui.repo;

import com.github.mobile.core.ResourcePager;
import com.google.inject.Inject;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.PageIterator;
import org.eclipse.egit.github.core.service.RepositoryService;

/**
 * isComment
 */
public class isClassOrIsInterface extends UserRepositoryListFragment {

    @Inject
    private RepositoryService isVariable;

    @Override
    protected ResourcePager<Repository> isMethod() {
        return new ResourcePager<Repository>() {

            @Override
            protected Object isMethod(Repository isParameter) {
                return isNameExpr.isMethod();
            }

            @Override
            public PageIterator<Repository> isMethod(int isParameter, int isParameter) {
                if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
                    return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr);
                }
                return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr);
            }
        };
    }
}
