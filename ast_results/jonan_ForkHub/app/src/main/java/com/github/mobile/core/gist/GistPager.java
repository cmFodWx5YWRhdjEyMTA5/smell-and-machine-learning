// isComment
package com.github.mobile.core.gist;

import com.github.mobile.core.ResourcePager;
import org.eclipse.egit.github.core.Gist;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ResourcePager<Gist> {

    private final GistStore isVariable;

    /**
     * isComment
     */
    public isConstructor(final GistStore isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected Object isMethod(Gist isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    protected Gist isMethod(Gist isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
