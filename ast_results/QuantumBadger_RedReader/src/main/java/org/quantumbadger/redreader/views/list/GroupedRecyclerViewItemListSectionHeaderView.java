// isComment
package org.quantumbadger.redreader.views.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import org.quantumbadger.redreader.R;
import org.quantumbadger.redreader.adapters.GroupedRecyclerViewAdapter;

public class isClassOrIsInterface extends GroupedRecyclerViewAdapter.Item {

    @NonNull
    private final CharSequence isVariable;

    public isConstructor(@NonNull final CharSequence isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Class isMethod() {
        // isComment
        return GroupedRecyclerViewItemListSectionHeaderView.class;
    }

    @Override
    public RecyclerView.ViewHolder isMethod(final ViewGroup isParameter) {
        return new RecyclerView.ViewHolder(isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true)) {
        };
    }

    @Override
    public void isMethod(final RecyclerView.ViewHolder isParameter) {
        final TextView isVariable = (TextView) isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }
}
