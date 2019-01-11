// isComment
package org.andstatus.app.activity;

import android.content.Intent;
import org.andstatus.app.account.MyAccount;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.context.TestSuite;
import org.andstatus.app.timeline.TimelineActivityTest;
import org.andstatus.app.timeline.meta.Timeline;
import org.andstatus.app.timeline.meta.TimelineType;
import org.andstatus.app.util.MyLog;
import org.junit.Test;
import static org.andstatus.app.context.DemoData.demoData;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface extends TimelineActivityTest<ActivityViewItem> {

    @Override
    protected Intent isMethod() {
        isNameExpr.isMethod(this, "isStringConstant");
        isNameExpr.isMethod(this);
        final MyAccount isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(this, "isStringConstant");
        return new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod());
    }

    @Test
    public void isMethod() throws InterruptedException {
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(isMethod(), isIntegerConstant);
    }
}
