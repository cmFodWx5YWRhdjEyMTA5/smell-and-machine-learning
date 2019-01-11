// isComment
package com.wangdaye.mysplash.common.ui.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.basic.Tag;
import com.wangdaye.mysplash.common.utils.helper.IntentHelper;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class isClassOrIsInterface extends RecyclerView.Adapter<TagAdapter.ViewHolder> {

    private List<Tag> isVariable;

    class isClassOrIsInterface extends RecyclerView.ViewHolder {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        isConstructor(View isParameter) {
            super(isNameExpr);
            isNameExpr.isMethod(this, isNameExpr);
        }

        void isMethod(int isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
        }

        // isComment
        @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        void isMethod() {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod(isMethod()).isMethod());
        }
    }

    public isConstructor(List<Tag> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    @Override
    public ViewHolder isMethod(@NonNull ViewGroup isParameter, int isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        return new ViewHolder(isNameExpr);
    }

    @Override
    public void isMethod(@NonNull ViewHolder isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }
}
