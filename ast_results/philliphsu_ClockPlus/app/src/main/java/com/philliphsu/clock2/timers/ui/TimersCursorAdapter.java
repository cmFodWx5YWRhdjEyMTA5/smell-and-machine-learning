// isComment
package com.philliphsu.clock2.timers.ui;

import android.view.ViewGroup;
import com.philliphsu.clock2.timers.data.AsyncTimersTableUpdateHandler;
import com.philliphsu.clock2.list.BaseCursorAdapter;
import com.philliphsu.clock2.list.OnListItemInteractionListener;
import com.philliphsu.clock2.timers.Timer;
import com.philliphsu.clock2.timers.data.TimerCursor;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseCursorAdapter<Timer, TimerViewHolder, TimerCursor> {

    private final AsyncTimersTableUpdateHandler isVariable;

    public isConstructor(OnListItemInteractionListener<Timer> isParameter, AsyncTimersTableUpdateHandler isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    protected TimerViewHolder isMethod(ViewGroup isParameter, OnListItemInteractionListener<Timer> isParameter, int isParameter) {
        return new TimerViewHolder(isNameExpr, isNameExpr, isNameExpr);
    }
}
