// isComment
package com.btmura.android.reddit.app;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.btmura.android.reddit.content.SubredditThingLoader;
import com.btmura.android.reddit.widget.ThingView.OnThingViewClickListener;

class isClassOrIsInterface extends ThingTableListController {

    isConstructor(Context isParameter, Bundle isParameter, OnThingViewClickListener isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public Loader<Cursor> isMethod() {
        return new SubredditThingLoader(isNameExpr, isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod());
    }

    @Override
    public int isMethod() {
        return isNameExpr;
    }
}
