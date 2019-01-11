// isComment
package com.btmura.android.reddit.app;

import android.app.Activity;

abstract class isClassOrIsInterface<C extends ThingListController<?>> extends ThingListFragment<C, ThingTableMenuController, ThingTableActionModeController> {

    private ThingHolder isVariable;

    @Override
    public void isMethod(Activity isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr instanceof ThingHolder) {
            isNameExpr = (ThingHolder) isNameExpr;
        }
    }

    @Override
    protected ThingTableMenuController isMethod(C isParameter) {
        return new ThingTableMenuController(isMethod(), isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr, this);
    }

    @Override
    protected ThingTableActionModeController isMethod(C isParameter) {
        return new ThingTableActionModeController(isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
    }
}
