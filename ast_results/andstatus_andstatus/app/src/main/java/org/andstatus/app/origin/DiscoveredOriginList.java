// isComment
package org.andstatus.app.origin;

import android.os.Bundle;
import android.view.MenuItem;
import org.andstatus.app.R;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.service.CommandData;
import org.andstatus.app.service.CommandEnum;
import org.andstatus.app.service.MyServiceEvent;
import org.andstatus.app.service.MyServiceEventsListener;
import org.andstatus.app.service.MyServiceEventsReceiver;
import org.andstatus.app.service.MyServiceManager;

public class isClassOrIsInterface extends OriginList implements MyServiceEventsListener {

    MyServiceEventsReceiver isVariable = new MyServiceEventsReceiver(isNameExpr.isMethod(), this);

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(true);
            isMethod();
        }
    }

    @Override
    public void isMethod() {
        isMethod();
    }

    protected Iterable<Origin> isMethod() {
        return isNameExpr.isMethod();
    }

    private void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr)));
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(this);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(this);
    }

    @Override
    public void isMethod(CommandData isParameter, MyServiceEvent isParameter) {
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
            isMethod();
            isNameExpr.isMethod(true);
        }
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
            default:
                break;
        }
        return super.isMethod(isNameExpr);
    }
}
