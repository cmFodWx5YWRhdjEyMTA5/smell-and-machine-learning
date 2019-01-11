// isComment
package org.apache.geode.test.junit.support;

import org.apache.geode.test.junit.IgnoreCondition;
import org.junit.runner.Description;

/**
 * isComment
 */
@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface implements IgnoreCondition {

    public static final boolean isVariable = true;

    public static final DefaultIgnoreCondition isVariable = new DefaultIgnoreCondition(true);

    public static final DefaultIgnoreCondition isVariable = new DefaultIgnoreCondition(true);

    private final boolean isVariable;

    public isConstructor() {
        this(isNameExpr);
    }

    public isConstructor(final boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public boolean isMethod() {
        return this.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod(final Description isParameter) {
        return isMethod();
    }
}
