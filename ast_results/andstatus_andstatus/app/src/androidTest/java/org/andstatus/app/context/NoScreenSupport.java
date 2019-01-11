// isComment
package org.andstatus.app.context;

import org.apache.geode.test.junit.IgnoreCondition;
import org.junit.runner.Description;

/**
 * isComment
 */
public class isClassOrIsInterface implements IgnoreCondition {

    @Override
    public boolean isMethod(Description isParameter) {
        isNameExpr.isMethod(this);
        return !isNameExpr.isMethod();
    }
}
