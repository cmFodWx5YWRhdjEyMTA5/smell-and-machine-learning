// isComment
package me.ccrama.redditslide.Views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import me.ccrama.redditslide.util.LogUtil;

/**
 * isComment
 */
public class isClassOrIsInterface extends StaggeredGridLayoutManager {

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(RecyclerView.Recycler isParameter, RecyclerView.State isParameter) {
        try {
            super.isMethod(isNameExpr, isNameExpr);
        } catch (IndexOutOfBoundsException isParameter) {
            isNameExpr.isMethod("isStringConstant");
        }
    }
}
