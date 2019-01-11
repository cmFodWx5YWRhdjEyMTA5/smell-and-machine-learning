// isComment
package org.andstatus.app.user;

import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.context.TestSuite;
import org.andstatus.app.net.social.Actor;
import org.andstatus.app.origin.Origin;
import org.junit.Before;
import org.junit.Test;
import static org.andstatus.app.context.DemoData.demoData;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface {

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
    }

    @Test
    public void isMethod() {
        CachedUsersAndActors isVariable = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod() > isIntegerConstant);
        Origin isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        Actor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod(), true, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(), true, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }
}
