// isComment
package com.wangdaye.mysplash.main.view.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.data.entity.unsplash.Collection;
import com.wangdaye.mysplash.common.i.model.CollectionsModel;
import com.wangdaye.mysplash.common.i.model.LoadModel;
import com.wangdaye.mysplash.common.i.model.PagerModel;
import com.wangdaye.mysplash.common.i.model.ScrollModel;
import com.wangdaye.mysplash.common.i.presenter.CollectionsPresenter;
import com.wangdaye.mysplash.common.i.presenter.LoadPresenter;
import com.wangdaye.mysplash.common.i.presenter.PagerPresenter;
import com.wangdaye.mysplash.common.i.presenter.ScrollPresenter;
import com.wangdaye.mysplash.common.basic.activity.MysplashActivity;
import com.wangdaye.mysplash.common.ui.adapter.CollectionAdapter;
import com.wangdaye.mysplash.common.ui.adapter.multipleState.LargeErrorStateAdapter;
import com.wangdaye.mysplash.common.ui.adapter.multipleState.LargeLoadingStateAdapter;
import com.wangdaye.mysplash.common.ui.widget.MultipleStateRecyclerView;
import com.wangdaye.mysplash.common.ui.widget.swipeRefreshView.BothWaySwipeRefreshLayout;
import com.wangdaye.mysplash.common.utils.AnimUtils;
import com.wangdaye.mysplash.common.utils.BackToTopUtils;
import com.wangdaye.mysplash.common.i.view.LoadView;
import com.wangdaye.mysplash.common.i.view.PagerView;
import com.wangdaye.mysplash.common.i.view.ScrollView;
import com.wangdaye.mysplash.common.utils.DisplayUtils;
import com.wangdaye.mysplash.common.utils.manager.ThemeManager;
import com.wangdaye.mysplash.main.model.widget.CollectionsObject;
import com.wangdaye.mysplash.main.model.widget.LoadObject;
import com.wangdaye.mysplash.main.model.widget.PagerObject;
import com.wangdaye.mysplash.main.model.widget.ScrollObject;
import com.wangdaye.mysplash.main.presenter.widget.CollectionsImplementor;
import com.wangdaye.mysplash.main.presenter.widget.LoadImplementor;
import com.wangdaye.mysplash.main.presenter.widget.PagerImplementor;
import com.wangdaye.mysplash.main.presenter.widget.ScrollImplementor;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

@SuppressLint("isStringConstant")
public class isClassOrIsInterface extends BothWaySwipeRefreshLayout implements com.wangdaye.mysplash.common.i.view.CollectionsView, PagerView, LoadView, ScrollView, BothWaySwipeRefreshLayout.OnRefreshAndLoadListener, LargeErrorStateAdapter.OnRetryListener {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    MultipleStateRecyclerView isVariable;

    private CollectionsModel isVariable;

    private CollectionsPresenter isVariable;

    private PagerModel isVariable;

    private PagerPresenter isVariable;

    private LoadModel isVariable;

    private LoadPresenter isVariable;

    private ScrollModel isVariable;

    private ScrollPresenter isVariable;

    private static class isClassOrIsInterface implements Parcelable {

        int isVariable;

        int isVariable;

        boolean isVariable;

        isConstructor(CollectionsView isParameter) {
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod();
        }

        private isConstructor(Parcel isParameter) {
            this.isFieldAccessExpr = isNameExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isMethod() != isIntegerConstant;
        }

        @Override
        public int isMethod() {
            return isIntegerConstant;
        }

        @Override
        public void isMethod(Parcel isParameter, int isParameter) {
            isNameExpr.isMethod(this.isFieldAccessExpr);
            isNameExpr.isMethod(this.isFieldAccessExpr);
            isNameExpr.isMethod(this.isFieldAccessExpr ? (byte) isIntegerConstant : (byte) isIntegerConstant);
        }

        public static final Parcelable.Creator<SavedState> isVariable = new Parcelable.Creator<SavedState>() {

            public SavedState isMethod(Parcel isParameter) {
                return new SavedState(isNameExpr);
            }

            public SavedState[] isMethod(int isParameter) {
                return new SavedState[isNameExpr];
            }
        };
    }

    public isConstructor(MysplashActivity isParameter, @Mysplash.CollectionTypeRule int isParameter, int isParameter, int isParameter, boolean isParameter) {
        super(isNameExpr);
        this.isMethod(isNameExpr);
        this.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    // isComment
    @SuppressLint("isStringConstant")
    private void isMethod(MysplashActivity isParameter, @Mysplash.CollectionTypeRule int isParameter, int isParameter, boolean isParameter) {
        View isVariable = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr);
        isNameExpr.isMethod(this, this);
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr);
        isMethod();
    }

    private void isMethod(MysplashActivity isParameter, @Mysplash.CollectionTypeRule int isParameter, int isParameter, boolean isParameter) {
        this.isFieldAccessExpr = new CollectionsObject(new CollectionAdapter(isNameExpr, new ArrayList<Collection>(isNameExpr.isFieldAccessExpr)), isNameExpr);
        this.isFieldAccessExpr = new PagerObject(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = new LoadObject(isNameExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = new ScrollObject(true);
    }

    private void isMethod(MysplashActivity isParameter) {
        this.isFieldAccessExpr = new CollectionsImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new PagerImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new LoadImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new ScrollImplementor(isNameExpr, this);
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod(isMethod()));
        isMethod(isNameExpr.isMethod(isMethod()));
        isMethod(this);
        isMethod(true);
        isMethod(true);
        int isVariable = isNameExpr.isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        int isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr > isIntegerConstant) {
            int isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant, isIntegerConstant);
        } else {
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        }
        isNameExpr.isMethod(new StaggeredGridLayoutManager(isNameExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new LargeLoadingStateAdapter(isMethod(), isIntegerConstant), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new LargeErrorStateAdapter(isMethod(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), this), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    // isComment
    public void isMethod(Collection isParameter, boolean isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr, true);
    }

    /**
     * isComment
     */
    public List<Collection> isMethod() {
        return isNameExpr.isMethod().isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(List<Collection> isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<>();
        }
        isNameExpr.isMethod().isMethod(isNameExpr);
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isMethod();
        } else {
            isNameExpr.isMethod();
        }
    }

    // isComment
    // isComment
    @Override
    public void isMethod() {
        isNameExpr.isMethod(isMethod(), true);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isMethod(), true);
    }

    // isComment
    @Override
    public void isMethod() {
        isNameExpr.isMethod(isMethod());
    }

    // isComment
    private RecyclerView.OnScrollListener isVariable = new RecyclerView.OnScrollListener() {

        @Override
        public void isMethod(@NonNull RecyclerView isParameter, int isParameter, int isParameter) {
            super.isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    };

    // isComment
    // isComment
    @Override
    public void isMethod(boolean isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(String isParameter) {
        if (isNameExpr.isMethod().isMethod() > isIntegerConstant) {
            isNameExpr.isMethod();
        } else {
            isNameExpr.isMethod();
        }
    }

    // isComment
    @Override
    public void isMethod(Bundle isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod()), new SavedState(this));
    }

    @Override
    public void isMethod(Bundle isParameter) {
        SavedState isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isMethod();
        }
    }

    @Override
    public void isMethod() {
        // isComment
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod().isMethod() <= isIntegerConstant && !isNameExpr.isMethod() && !isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isMethod());
    }

    @Override
    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        // isComment
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(String isParameter) {
    // isComment
    }

    @Override
    public String isMethod() {
        return null;
    }

    @Override
    public int isMethod() {
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            return isIntegerConstant;
        } else {
            return isNameExpr.isMethod().isMethod();
        }
    }

    @Override
    public boolean isMethod(int isParameter) {
        return true;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
    }

    // isComment
    @Override
    public void isMethod(View isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final View isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(@Nullable MysplashActivity isParameter, int isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr, true, isNameExpr.isMethod());
        }
        isMethod(true);
        isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(@Nullable MysplashActivity isParameter, int isParameter) {
        isMethod(true);
        isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(@Nullable MysplashActivity isParameter, int isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr, true, isNameExpr.isMethod());
        }
        isMethod(true);
        isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    // isComment
    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(int isParameter) {
        if (isNameExpr.isMethod() != null) {
            int[] isVariable = ((StaggeredGridLayoutManager) isNameExpr.isMethod()).isMethod(null);
            int isVariable = isNameExpr.isMethod().isMethod();
            if (isNameExpr.isMethod() && isNameExpr[isNameExpr.isFieldAccessExpr - isIntegerConstant] >= isNameExpr - isIntegerConstant && isNameExpr > isIntegerConstant && isNameExpr > isIntegerConstant) {
                isNameExpr.isMethod(isMethod(), true);
            }
            if (!isNameExpr.isMethod(-isIntegerConstant)) {
                isNameExpr.isMethod(true);
            } else {
                isNameExpr.isMethod(true);
            }
            if (!isNameExpr.isMethod(isIntegerConstant) && isNameExpr.isMethod()) {
                isMethod(true);
            }
        }
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
    }
}
