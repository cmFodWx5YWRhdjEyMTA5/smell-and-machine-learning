// isComment
package org.sufficientlysecure.keychain.ui.adapter;

import java.util.List;
import android.view.View;
import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.IFlexible;
import eu.davidea.viewholders.FlexibleViewHolder;
import org.sufficientlysecure.keychain.R;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyDummyItem.FlexibleKeyDummyViewHolder;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyItem.FlexibleSectionableKeyItem;

public class isClassOrIsInterface extends FlexibleSectionableKeyItem<FlexibleKeyDummyViewHolder> {

    isConstructor(FlexibleKeyHeader isParameter) {
        super(isNameExpr);
        isMethod(true);
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        return this == isNameExpr;
    }

    @Override
    public FlexibleKeyDummyViewHolder isMethod(View isParameter, FlexibleAdapter<IFlexible> isParameter) {
        return new FlexibleKeyDummyViewHolder(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(FlexibleAdapter<IFlexible> isParameter, FlexibleKeyDummyViewHolder isParameter, int isParameter, List<Object> isParameter) {
    }

    class isClassOrIsInterface extends FlexibleViewHolder {

        private isConstructor(View isParameter, FlexibleAdapter isParameter) {
            super(isNameExpr, isNameExpr, true);
        }
    }
}
