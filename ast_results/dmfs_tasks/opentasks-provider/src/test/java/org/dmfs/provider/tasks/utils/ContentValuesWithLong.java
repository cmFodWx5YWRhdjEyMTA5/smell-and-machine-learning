// isComment
package org.dmfs.provider.tasks.utils;

import android.content.ContentValues;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.Matchers.is;

/**
 * isComment
 */
public final class isClassOrIsInterface extends FeatureMatcher<ContentValues, Long> {

    private final String isVariable;

    public isConstructor(String isParameter, long isParameter) {
        this(isNameExpr, isMethod(isNameExpr));
    }

    public isConstructor(String isParameter, Matcher<Long> isParameter) {
        super(isNameExpr, "isStringConstant" + isNameExpr, "isStringConstant" + isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    protected Long isMethod(ContentValues isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
