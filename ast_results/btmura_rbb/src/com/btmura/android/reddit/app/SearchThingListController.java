// isComment
package com.btmura.android.reddit.app;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.btmura.android.reddit.content.AccountPrefs;
import com.btmura.android.reddit.content.SearchThingLoader;
import com.btmura.android.reddit.util.Objects;
import com.btmura.android.reddit.widget.ThingView.OnThingViewClickListener;

class isClassOrIsInterface extends ThingTableListController {

    /**
     * isComment
     */
    static final String isVariable = "isStringConstant";

    private String isVariable;

    public isConstructor(Context isParameter, Bundle isParameter, OnThingViewClickListener isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public Loader<Cursor> isMethod() {
        return new SearchThingLoader(isNameExpr, isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod());
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(int isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
