// isComment
package com.wangdaye.mysplash.common.basic;

import android.os.Message;
import android.support.v7.widget.RecyclerView;
import com.wangdaye.mysplash.common.utils.widget.SafeHandler;

public abstract class isClassOrIsInterface<VH extends RecyclerView.ViewHolder> extends FooterAdapter<VH> implements SafeHandler.HandlerContainer {

    private SafeHandler<AsynUpdateAdapter<VH>> isVariable;

    private boolean isVariable;

    public isConstructor() {
        isNameExpr = new SafeHandler<>(this);
        isNameExpr = true;
    }

    @Override
    public void isMethod(RecyclerView isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = true;
    }

    @Override
    public void isMethod(RecyclerView isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(null);
        isNameExpr = true;
    }

    protected void isMethod(int isParameter) {
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr).isMethod();
        }
    }

    @Override
    public void isMethod(Message isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr);
    }
}
