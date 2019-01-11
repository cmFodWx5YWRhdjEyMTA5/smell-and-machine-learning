// isComment
package io.mrarm.irc.util;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class isClassOrIsInterface<VH extends ClickableRecyclerViewAdapter.ViewHolder<IT>, IT> extends SimpleRecyclerViewAdapter<VH, IT> {

    private ItemClickListener<IT> isVariable;

    public isConstructor() {
    }

    public isConstructor(ViewHolderFactory<VH> isParameter, int isParameter, List<IT> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod(ItemClickListener<IT> isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public VH isMethod(ViewGroup isParameter, int isParameter) {
        VH isVariable = super.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(this);
        return isNameExpr;
    }

    public static class isClassOrIsInterface<IT> extends SimpleRecyclerViewAdapter.ViewHolder<IT> {

        public isConstructor(View isParameter) {
            super(isNameExpr);
        }

        void isMethod(ClickableRecyclerViewAdapter<?, IT> isParameter) {
            isNameExpr.isMethod((View isParameter) -> {
                if (isNameExpr.isFieldAccessExpr != null)
                    isNameExpr.isFieldAccessExpr.isMethod(isMethod(), isNameExpr.isMethod().isMethod(isMethod()));
            });
        }
    }

    public interface isClassOrIsInterface<IT> {

        void isMethod(int isParameter, IT isParameter);
    }
}
