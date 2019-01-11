// isComment
package com.biglybt.android.client.sidelist;

import com.biglybt.android.adapter.FlexibleRecyclerSelectionListener;
import com.biglybt.android.client.SessionGetter;
import android.support.annotation.Nullable;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;

/**
 * isComment
 */
public interface isClassOrIsInterface extends FlexibleRecyclerSelectionListener<SideActionsAdapter, SideActionsAdapter.SideActionsHolder, SideActionsAdapter.SideActionsInfo>, SessionGetter {

    boolean isMethod();

    /**
     * isComment
     */
    void isMethod(Menu isParameter);

    MenuBuilder isMethod();

    /**
     * isComment
     */
    @Nullable
    int[] isMethod();
}
