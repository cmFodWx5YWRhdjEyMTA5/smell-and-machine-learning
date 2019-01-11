// isComment
package com.github.mobile.ui.repo;

import com.github.mobile.core.ResourcePager;
import com.google.inject.Inject;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.PageIterator;
import org.eclipse.egit.github.core.service.StargazerService;
import java.io.IOException;

/**
 * isComment
 */
public class isClassOrIsInterface extends UserRepositoryListFragment {

    @Inject
    private StargazerService isVariable;

    @Override
    protected ResourcePager<Repository> isMethod() {
        return new ResourcePager<Repository>() {

            @Override
            protected Object isMethod(Repository isParameter) {
                return isNameExpr.isMethod();
            }

            @Override
            public PageIterator<Repository> isMethod(int isParameter, int isParameter) {
                try {
                    return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr);
                } catch (IOException isParameter) {
                    isNameExpr.isMethod();
                }
                return null;
            }
        };
    }
}
