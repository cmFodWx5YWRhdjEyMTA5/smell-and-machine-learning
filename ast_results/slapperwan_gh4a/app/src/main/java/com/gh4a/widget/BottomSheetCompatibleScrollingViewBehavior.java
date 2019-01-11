// isComment
package com.gh4a.widget;

import android.graphics.Rect;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;

public class isClassOrIsInterface extends AppBarLayout.ScrollingViewBehavior {

    @Override
    public boolean isMethod(CoordinatorLayout isParameter, View isParameter, Rect isParameter, boolean isParameter) {
        return true;
    }
}
