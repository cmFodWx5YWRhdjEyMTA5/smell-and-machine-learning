// isComment
package com.wangdaye.mysplash.common.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.i.model.AboutModel;
import com.wangdaye.mysplash.common.basic.activity.MysplashActivity;
import com.wangdaye.mysplash.about.presenter.CreateAboutModelImplementor;
import com.wangdaye.mysplash.about.view.holder.AppHolder;
import com.wangdaye.mysplash.about.view.holder.CategoryHolder;
import com.wangdaye.mysplash.about.view.holder.HeaderHolder;
import com.wangdaye.mysplash.about.view.holder.LibraryHolder;
import com.wangdaye.mysplash.about.view.holder.TranslatorHolder;
import java.util.List;

public class isClassOrIsInterface extends RecyclerView.Adapter<AboutAdapter.ViewHolder> {

    private MysplashActivity isVariable;

    private List<AboutModel> isVariable;

    /**
     * isComment
     */
    public abstract static class isClassOrIsInterface extends RecyclerView.ViewHolder {

        public isConstructor(View isParameter) {
            super(isNameExpr);
        }

        // isComment
        protected abstract void isMethod(MysplashActivity isParameter, AboutModel isParameter);

        protected abstract void isMethod();
    }

    public isConstructor(MysplashActivity isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public AboutAdapter.ViewHolder isMethod(ViewGroup isParameter, int isParameter) {
        switch(isNameExpr.isMethod(isNameExpr).isMethod()) {
            case isNameExpr.isFieldAccessExpr:
                return new HeaderHolder(isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true));
            case isNameExpr.isFieldAccessExpr:
                return new CategoryHolder(isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true));
            case isNameExpr.isFieldAccessExpr:
                return new AppHolder(isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true));
            case isNameExpr.isFieldAccessExpr:
                return new TranslatorHolder(isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true));
            case isNameExpr.isFieldAccessExpr:
                return new LibraryHolder(isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true));
            default:
                return null;
        }
    }

    @Override
    public void isMethod(AboutAdapter.ViewHolder isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public void isMethod(ViewHolder isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod(int isParameter) {
        return isNameExpr;
    }
}
