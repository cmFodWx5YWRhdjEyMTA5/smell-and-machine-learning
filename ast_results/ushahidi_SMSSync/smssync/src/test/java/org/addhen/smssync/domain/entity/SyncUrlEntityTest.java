// isComment
package org.addhen.smssync.domain.entity;

import org.addhen.smssync.BaseRobolectricTestCase;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseRobolectricTestCase {

    private WebServiceEntity isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod());
    }
}
