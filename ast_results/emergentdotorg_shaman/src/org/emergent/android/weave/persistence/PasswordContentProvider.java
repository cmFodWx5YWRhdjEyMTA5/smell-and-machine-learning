// isComment
package org.emergent.android.weave.persistence;

import android.net.Uri;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractContentProvider {

    @Override
    protected String isMethod(Uri isParameter) {
        return isNameExpr;
    }

    @Override
    protected Uri isMethod(Uri isParameter) {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    protected String isMethod(Uri isParameter) {
        return "isStringConstant";
    }
}
