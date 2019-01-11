// isComment
package com.gh4a.adapter.timeline;

import android.view.View;
import android.widget.Button;
import com.gh4a.R;
import com.gh4a.model.TimelineItem;

class isClassOrIsInterface extends TimelineItemAdapter.TimelineItemViewHolder<TimelineItem.Reply> implements View.OnClickListener {

    public interface isClassOrIsInterface {

        long isMethod();

        void isMethod(long isParameter);
    }

    private final Callback isVariable;

    private final Button isVariable;

    public isConstructor(View isParameter, Callback isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
    }

    @Override
    public void isMethod(TimelineItem.Reply isParameter) {
        boolean isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod() == isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(final View isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            TimelineItem.TimelineComment isVariable = (TimelineItem.TimelineComment) isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        }
    }
}
