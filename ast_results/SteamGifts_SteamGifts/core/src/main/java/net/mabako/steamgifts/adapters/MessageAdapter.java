// isComment
package net.mabako.steamgifts.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import net.mabako.steamgifts.adapters.viewholder.MessageHeaderViewHolder;
import net.mabako.steamgifts.adapters.viewholder.MessageViewHolder;
import net.mabako.steamgifts.data.Comment;
import net.mabako.steamgifts.data.MessageHeader;
import net.mabako.steamgifts.fragments.profile.MessageListFragment;
import java.util.List;

public class isClassOrIsInterface extends EndlessAdapter {

    private static final long isVariable = isStringConstant;

    private transient MessageListFragment isVariable;

    public void isMethod(MessageListFragment isParameter) {
        isMethod(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected RecyclerView.ViewHolder isMethod(View isParameter, int isParameter) {
        if (isNameExpr == null)
            throw new IllegalStateException("isStringConstant");
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            return new MessageViewHolder(isNameExpr, isNameExpr.isMethod(), isNameExpr);
        } else if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            return new MessageHeaderViewHolder(isNameExpr, isNameExpr.isMethod());
        }
        throw new IllegalStateException();
    }

    @Override
    protected void isMethod(RecyclerView.ViewHolder isParameter, int isParameter) {
        if (isNameExpr instanceof MessageHeaderViewHolder) {
            ((MessageHeaderViewHolder) isNameExpr).isMethod((MessageHeader) isMethod(isNameExpr));
        } else if (isNameExpr instanceof MessageViewHolder) {
            ((MessageViewHolder) isNameExpr).isMethod((Comment) isMethod(isNameExpr));
        }
    }

    @Override
    protected boolean isMethod(List<IEndlessAdaptable> isParameter) {
        return isNameExpr.isMethod() > isIntegerConstant;
    }
}
