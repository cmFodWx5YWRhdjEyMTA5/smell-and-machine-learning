// isComment
package com.btmura.android.reddit.app;

import android.app.Activity;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import com.btmura.android.reddit.widget.SubredditAdapter;
import com.btmura.android.reddit.widget.SubredditView;

abstract class isClassOrIsInterface<C extends SubredditListController<A>, MC extends MenuController, AC extends ActionModeController, A extends SubredditAdapter> extends AbstractListFragment<C, MC, AC, A> {

    private OnSubredditSelectedListener isVariable;

    @Override
    public void isMethod(Activity isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr instanceof OnSubredditSelectedListener) {
            isNameExpr = (OnSubredditSelectedListener) isNameExpr;
        }
    }

    @Override
    public void isMethod(Loader<Cursor> isParameter, Cursor isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        SubredditAdapter isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() > isIntegerConstant && isNameExpr.isMethod(isNameExpr.isMethod())) {
            String isVariable = isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(null, isNameExpr, true);
            }
        }
    }

    @Override
    public void isMethod(ListView isParameter, View isParameter, int isParameter, long isParameter) {
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod() && isNameExpr instanceof SubredditView) {
            ((SubredditView) isNameExpr).isMethod(true);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), true);
        }
    }
}
