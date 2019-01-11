// isComment
package com.github.mobile.ui.gist;

import com.github.mobile.core.ResourcePager;
import com.github.mobile.core.gist.GistPager;
import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.client.PageIterator;

/**
 * isComment
 */
public class isClassOrIsInterface extends GistsFragment {

    @Override
    protected ResourcePager<Gist> isMethod() {
        return new GistPager(isNameExpr) {

            @Override
            public PageIterator<Gist> isMethod(int isParameter, int isParameter) {
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        };
    }
}
