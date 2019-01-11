// isComment
package org.sufficientlysecure.keychain.ui.adapter;

import android.support.v7.widget.RecyclerView;
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem;
import eu.davidea.flexibleadapter.items.ISectionable;

public abstract class isClassOrIsInterface<VH extends RecyclerView.ViewHolder> extends AbstractFlexibleItem<VH> {

    public abstract static class isClassOrIsInterface<VH extends RecyclerView.ViewHolder> extends FlexibleKeyItem<VH> implements ISectionable<VH, FlexibleKeyHeader> {

        FlexibleKeyHeader isVariable;

        isConstructor(FlexibleKeyHeader isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public FlexibleKeyHeader isMethod() {
            return isNameExpr;
        }

        @Override
        public void isMethod(FlexibleKeyHeader isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }
}
