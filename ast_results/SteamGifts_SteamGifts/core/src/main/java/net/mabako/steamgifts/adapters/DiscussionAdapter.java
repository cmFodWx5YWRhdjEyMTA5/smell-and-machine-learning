// isComment
package net.mabako.steamgifts.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import net.mabako.steamgifts.adapters.viewholder.DiscussionListItemViewHolder;
import net.mabako.steamgifts.data.Discussion;
import java.util.List;

public class isClassOrIsInterface extends EndlessAdapter {

    private static final long isVariable = isStringConstant;

    /**
     * isComment
     */
    private static final int isVariable = isIntegerConstant;

    /**
     * isComment
     */
    private transient Activity isVariable;

    public void isMethod(OnLoadListener isParameter, @NonNull Activity isParameter) {
        isMethod(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected RecyclerView.ViewHolder isMethod(View isParameter, int isParameter) {
        if (isNameExpr == null)
            throw new IllegalStateException("isStringConstant");
        return new DiscussionListItemViewHolder(isNameExpr, isNameExpr, this);
    }

    @Override
    protected void isMethod(RecyclerView.ViewHolder isParameter, int isParameter) {
        if (isNameExpr instanceof DiscussionListItemViewHolder) {
            DiscussionListItemViewHolder isVariable = (DiscussionListItemViewHolder) isNameExpr;
            Discussion isVariable = (Discussion) isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    protected boolean isMethod(List<IEndlessAdaptable> isParameter) {
        return isNameExpr.isMethod() == isNameExpr;
    }
}
