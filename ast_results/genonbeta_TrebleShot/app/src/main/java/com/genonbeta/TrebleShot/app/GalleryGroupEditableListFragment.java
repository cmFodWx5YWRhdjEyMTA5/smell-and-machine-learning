// isComment
package com.genonbeta.TrebleShot.app;

import android.os.Bundle;
import com.genonbeta.TrebleShot.R;
import com.genonbeta.TrebleShot.adapter.ImageListAdapter;
import com.genonbeta.TrebleShot.widget.GroupEditableListAdapter;
import java.util.Map;
import androidx.annotation.Nullable;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T extends GroupEditableListAdapter.GroupShareable, V extends GroupEditableListAdapter.GroupViewHolder, E extends GroupEditableListAdapter<T, V>> extends GroupEditableListFragment<T, V, E> {

    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(Map<String, Integer> isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
    }
}
