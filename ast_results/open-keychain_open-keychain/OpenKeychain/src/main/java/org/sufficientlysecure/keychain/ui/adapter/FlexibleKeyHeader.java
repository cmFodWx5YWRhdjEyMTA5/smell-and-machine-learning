// isComment
package org.sufficientlysecure.keychain.ui.adapter;

import java.util.List;
import android.view.View;
import android.widget.TextView;
import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractHeaderItem;
import eu.davidea.flexibleadapter.items.IFlexible;
import eu.davidea.flexibleadapter.items.IHeader;
import eu.davidea.viewholders.FlexibleViewHolder;
import org.sufficientlysecure.keychain.R;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyHeader.FlexibleHeaderViewHolder;

public class isClassOrIsInterface extends FlexibleKeyItem<FlexibleHeaderViewHolder> implements IHeader<FlexibleHeaderViewHolder> {

    private final String isVariable;

    isConstructor(String isParameter) {
        super();
        this.isFieldAccessExpr = isNameExpr;
        isMethod(true);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof FlexibleKeyHeader) {
            FlexibleKeyHeader isVariable = (FlexibleKeyHeader) isNameExpr;
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return true;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public FlexibleHeaderViewHolder isMethod(View isParameter, FlexibleAdapter<IFlexible> isParameter) {
        return new FlexibleHeaderViewHolder(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(FlexibleAdapter<IFlexible> isParameter, FlexibleHeaderViewHolder isParameter, int isParameter, List<Object> isParameter) {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }

    static class isClassOrIsInterface extends FlexibleViewHolder {

        final TextView isVariable;

        isConstructor(View isParameter, FlexibleAdapter isParameter) {
            super(isNameExpr, isNameExpr, true);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }
}
