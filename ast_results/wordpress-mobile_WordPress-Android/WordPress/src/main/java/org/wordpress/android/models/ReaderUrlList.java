// isComment
package org.wordpress.android.models;

import org.wordpress.android.util.UrlUtils;
import java.util.HashSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends HashSet<String> {

    @Override
    public boolean isMethod(String isParameter) {
        return super.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof String) {
            return super.isMethod(isNameExpr.isMethod((String) isNameExpr));
        } else {
            return super.isMethod(isNameExpr);
        }
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof String) {
            return super.isMethod(isNameExpr.isMethod((String) isNameExpr));
        } else {
            return super.isMethod(isNameExpr);
        }
    }
}
