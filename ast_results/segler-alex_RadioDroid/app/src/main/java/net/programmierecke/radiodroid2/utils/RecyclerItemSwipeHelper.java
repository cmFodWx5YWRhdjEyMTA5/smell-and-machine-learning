// isComment
package net.programmierecke.radiodroid2.utils;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

public class isClassOrIsInterface<ViewHolderType extends SwipeableViewHolder> extends ItemTouchHelper.SimpleCallback {

    public interface isClassOrIsInterface<ViewHolderType> {

        void isMethod(ViewHolderType isParameter, int isParameter);
    }

    private SwipeCallback<ViewHolderType> isVariable;

    public isConstructor(int isParameter, int isParameter, SwipeCallback<ViewHolderType> isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(RecyclerView.ViewHolder isParameter, int isParameter) {
        if (isNameExpr != null) {
            final View isVariable = ((SwipeableViewHolder) isNameExpr).isMethod();
            isMethod().isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(Canvas isParameter, RecyclerView isParameter, RecyclerView.ViewHolder isParameter, float isParameter, float isParameter, int isParameter, boolean isParameter) {
        final View isVariable = ((SwipeableViewHolder) isNameExpr).isMethod();
        isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(RecyclerView isParameter, RecyclerView.ViewHolder isParameter) {
        final View isVariable = ((SwipeableViewHolder) isNameExpr).isMethod();
        isMethod().isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Canvas isParameter, RecyclerView isParameter, RecyclerView.ViewHolder isParameter, float isParameter, float isParameter, int isParameter, boolean isParameter) {
        final View isVariable = ((SwipeableViewHolder) isNameExpr).isMethod();
        isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(RecyclerView isParameter, RecyclerView.ViewHolder isParameter, RecyclerView.ViewHolder isParameter) {
        return true;
    }

    @Override
    public void isMethod(RecyclerView.ViewHolder isParameter, int isParameter) {
        isNameExpr.isMethod((ViewHolderType) isNameExpr, isNameExpr);
    }
}
