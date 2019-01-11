// isComment
package com.wangdaye.mysplash.search.view.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.basic.FooterAdapter;
import com.wangdaye.mysplash.common.basic.activity.MysplashActivity;
import com.wangdaye.mysplash.common.data.entity.unsplash.Collection;
import com.wangdaye.mysplash.common.data.entity.unsplash.Photo;
import com.wangdaye.mysplash.common.data.entity.unsplash.User;
import com.wangdaye.mysplash.common.i.model.LoadModel;
import com.wangdaye.mysplash.common.i.model.PagerModel;
import com.wangdaye.mysplash.common.i.model.ScrollModel;
import com.wangdaye.mysplash.common.i.model.SearchModel;
import com.wangdaye.mysplash.common.i.presenter.LoadPresenter;
import com.wangdaye.mysplash.common.i.presenter.PagerPresenter;
import com.wangdaye.mysplash.common.i.presenter.ScrollPresenter;
import com.wangdaye.mysplash.common.i.presenter.SearchPresenter;
import com.wangdaye.mysplash.common.i.presenter.SwipeBackPresenter;
import com.wangdaye.mysplash.common.i.view.LoadView;
import com.wangdaye.mysplash.common.i.view.PagerView;
import com.wangdaye.mysplash.common.i.view.ScrollView;
import com.wangdaye.mysplash.common.i.view.SearchView;
import com.wangdaye.mysplash.common.i.view.SwipeBackView;
import com.wangdaye.mysplash.common.ui.adapter.CollectionAdapter;
import com.wangdaye.mysplash.common.ui.adapter.PhotoAdapter;
import com.wangdaye.mysplash.common.ui.adapter.UserAdapter;
import com.wangdaye.mysplash.common.ui.adapter.multipleState.LargeErrorStateAdapter;
import com.wangdaye.mysplash.common.ui.adapter.multipleState.LargeLoadingStateAdapter;
import com.wangdaye.mysplash.common.ui.dialog.SelectCollectionDialog;
import com.wangdaye.mysplash.common.ui.widget.MultipleStateRecyclerView;
import com.wangdaye.mysplash.common.ui.widget.SwipeBackCoordinatorLayout;
import com.wangdaye.mysplash.common.ui.widget.swipeRefreshView.BothWaySwipeRefreshLayout;
import com.wangdaye.mysplash.common.utils.AnimUtils;
import com.wangdaye.mysplash.common.utils.BackToTopUtils;
import com.wangdaye.mysplash.common.utils.DisplayUtils;
import com.wangdaye.mysplash.common.utils.manager.ThemeManager;
import com.wangdaye.mysplash.search.model.widget.LoadObject;
import com.wangdaye.mysplash.search.model.widget.PagerObject;
import com.wangdaye.mysplash.search.model.widget.ScrollObject;
import com.wangdaye.mysplash.search.model.widget.SearchCollectionsObject;
import com.wangdaye.mysplash.search.model.widget.SearchPhotosObject;
import com.wangdaye.mysplash.search.model.widget.SearchUsersObject;
import com.wangdaye.mysplash.search.presenter.widget.LoadImplementor;
import com.wangdaye.mysplash.search.presenter.widget.PagerImplementor;
import com.wangdaye.mysplash.search.presenter.widget.ScrollImplementor;
import com.wangdaye.mysplash.search.presenter.widget.SearchCollectionsImplementor;
import com.wangdaye.mysplash.search.presenter.widget.SearchPhotosImplementor;
import com.wangdaye.mysplash.search.presenter.widget.SearchUsersImplementor;
import com.wangdaye.mysplash.search.presenter.widget.SwipeBackImplementor;
import com.wangdaye.mysplash.search.view.activity.SearchActivity;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

@SuppressLint("isStringConstant")
public class isClassOrIsInterface extends BothWaySwipeRefreshLayout implements SearchView, PagerView, LoadView, ScrollView, SwipeBackView, BothWaySwipeRefreshLayout.OnRefreshAndLoadListener, LargeErrorStateAdapter.OnRetryListener, SelectCollectionDialog.OnCollectionsChangedListener {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    MultipleStateRecyclerView isVariable;

    private OnClickListener isVariable;

    private SearchModel isVariable;

    private SearchPresenter isVariable;

    private PagerModel isVariable;

    private PagerPresenter isVariable;

    private LoadModel isVariable;

    private LoadPresenter isVariable;

    private ScrollModel isVariable;

    private ScrollPresenter isVariable;

    private SwipeBackPresenter isVariable;

    public static final int isVariable = isIntegerConstant;

    public static final int isVariable = isIntegerConstant;

    public static final int isVariable = isIntegerConstant;

    @IntDef({ isNameExpr, isNameExpr, isNameExpr })
    private @interface TypeRule {
    }

    private static class isClassOrIsInterface implements Parcelable {

        String isVariable;

        int isVariable;

        boolean isVariable;

        isConstructor(SearchPageView isParameter) {
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

        public static final Creator<SavedState> isVariable = new Creator<SearchPageView.SavedState>() {

            public SearchPageView.SavedState isMethod(Parcel isParameter) {
                return new SearchPageView.SavedState(isNameExpr);
            }

            public SearchPageView.SavedState[] isMethod(int isParameter) {
                return new SearchPageView.SavedState[isNameExpr];
            }
        };
    }

    public isConstructor(SearchActivity isParameter, @TypeRule int isParameter, int isParameter, int isParameter, boolean isParameter) {
        super(isNameExpr);
        this.isMethod(isNameExpr);
        this.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    // isComment
    @SuppressLint("isStringConstant")
    private void isMethod(SearchActivity isParameter, @TypeRule int isParameter, int isParameter, boolean isParameter) {
        View isVariable = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr);
        isNameExpr.isMethod(this, this);
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isMethod());
        }
    }

    private void isMethod(SearchActivity isParameter, @TypeRule int isParameter, int isParameter, boolean isParameter) {
        this.isFieldAccessExpr = new ScrollObject(true);
        this.isFieldAccessExpr = new PagerObject(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = new LoadObject(isNameExpr.isFieldAccessExpr);
        switch(isNameExpr) {
            case isNameExpr:
                this.isFieldAccessExpr = new SearchPhotosObject(new PhotoAdapter(isMethod(), new ArrayList<Photo>(isNameExpr.isFieldAccessExpr), this, isNameExpr));
                break;
            case isNameExpr:
                this.isFieldAccessExpr = new SearchCollectionsObject(new CollectionAdapter(isMethod(), new ArrayList<Collection>()));
                break;
            case isNameExpr:
                this.isFieldAccessExpr = new SearchUsersObject(new UserAdapter(isMethod(), new ArrayList<User>()));
                break;
        }
    }

    private void isMethod(MysplashActivity isParameter, @TypeRule int isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                this.isFieldAccessExpr = new SearchPhotosImplementor(isNameExpr, this);
                break;
            case isNameExpr:
                this.isFieldAccessExpr = new SearchCollectionsImplementor(isNameExpr, this);
                break;
            case isNameExpr:
                this.isFieldAccessExpr = new SearchUsersImplementor(isNameExpr, this);
                break;
        }
        this.isFieldAccessExpr = new PagerImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new LoadImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new ScrollImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new SwipeBackImplementor(this);
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(int isParameter) {
        isMethod(isNameExpr.isMethod(isMethod()));
        isMethod(isNameExpr.isMethod(isMethod()));
        isMethod(this);
        isMethod(true);
        isMethod(true);
        int isVariable = isNameExpr.isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        int isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr == isNameExpr) {
            isNameExpr.isMethod(new GridLayoutManager(isMethod(), isNameExpr));
        } else {
            if (isNameExpr > isIntegerConstant) {
                int isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant, isIntegerConstant);
            } else {
                isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
            }
            isNameExpr.isMethod(new StaggeredGridLayoutManager(isNameExpr, isNameExpr.isFieldAccessExpr));
        }
        isNameExpr.isMethod(new LargeLoadingStateAdapter(isMethod(), isIntegerConstant, isNameExpr), isNameExpr.isFieldAccessExpr);
        String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                break;
            case isNameExpr:
                isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                break;
            case isNameExpr:
                isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                break;
        }
        isNameExpr.isMethod(new LargeErrorStateAdapter(isMethod(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true, true, isNameExpr, this), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod() instanceof PhotoAdapter) {
            ((PhotoAdapter) isNameExpr.isMethod()).isMethod(isNameExpr);
        }
    }

    // isComment
    public void isMethod() {
        RecyclerView.Adapter isVariable = isNameExpr.isMethod();
        if (isNameExpr instanceof PhotoAdapter) {
            ((PhotoAdapter) isNameExpr).isMethod();
        } else if (isNameExpr instanceof CollectionAdapter) {
            ((CollectionAdapter) isNameExpr).isMethod();
        } else {
            ((UserAdapter) isNameExpr).isMethod();
        }
    }

    public SearchPageView isMethod(OnClickListener isParameter) {
        isNameExpr = isNameExpr;
        return this;
    }

    public List<Photo> isMethod(List<Photo> isParameter, int isParameter, boolean isParameter) {
        if (isNameExpr.isMethod() instanceof PhotoAdapter) {
            PhotoAdapter isVariable = (PhotoAdapter) isNameExpr.isMethod();
            if ((isNameExpr && isNameExpr.isMethod() < isNameExpr) || (!isNameExpr && isNameExpr.isMethod() < isNameExpr + isNameExpr.isMethod())) {
                return new ArrayList<>();
            }
            if (!isNameExpr && isNameExpr.isMethod()) {
                isNameExpr.isMethod(isMethod(), true);
            }
            if (!isNameExpr.isMethod(isIntegerConstant) && isNameExpr.isMethod()) {
                isMethod(true);
            }
            if (isNameExpr) {
                if (isNameExpr == isIntegerConstant) {
                    return new ArrayList<>();
                } else {
                    return isNameExpr.isMethod().isMethod(isIntegerConstant, isNameExpr - isIntegerConstant);
                }
            } else {
                if (isNameExpr.isMethod() == isNameExpr + isNameExpr.isMethod()) {
                    return new ArrayList<>();
                } else {
                    return isNameExpr.isMethod().isMethod(isNameExpr + isNameExpr.isMethod(), isNameExpr.isMethod() - isIntegerConstant);
                }
            }
        }
        return new ArrayList<>();
    }

    public String isMethod() {
        return isNameExpr.isMethod();
    }

    // isComment
    public void isMethod(Photo isParameter, boolean isParameter) {
        if (isNameExpr.isMethod() instanceof PhotoAdapter) {
            ((PhotoAdapter) isNameExpr.isMethod()).isMethod(isNameExpr, isNameExpr, isNameExpr, true);
        }
    }

    /**
     * isComment
     */
    public List<Photo> isMethod() {
        return ((PhotoAdapter) isNameExpr.isMethod()).isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(List<Photo> isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<>();
        }
        ((PhotoAdapter) isNameExpr.isMethod()).isMethod(isNameExpr);
        if (isNameExpr.isMethod() == isIntegerConstant && !isNameExpr.isMethod(isNameExpr.isMethod())) {
            isMethod();
        } else {
            isNameExpr.isMethod();
        }
    }

    // isComment
    public void isMethod(Collection isParameter, boolean isParameter) {
        if (isNameExpr.isMethod() instanceof CollectionAdapter) {
            ((CollectionAdapter) isNameExpr.isMethod()).isMethod(isNameExpr, isNameExpr, isNameExpr, true);
        }
    }

    /**
     * isComment
     */
    public List<Collection> isMethod() {
        return ((CollectionAdapter) isNameExpr.isMethod()).isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(List<Collection> isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<>();
        }
        ((CollectionAdapter) isNameExpr.isMethod()).isMethod(isNameExpr);
        if (isNameExpr.isMethod() == isIntegerConstant && !isNameExpr.isMethod(isNameExpr.isMethod())) {
            isMethod();
        } else {
            isNameExpr.isMethod();
        }
    }

    // isComment
    public void isMethod(User isParameter, boolean isParameter) {
        if (isNameExpr.isMethod() instanceof UserAdapter) {
            ((UserAdapter) isNameExpr.isMethod()).isMethod(isNameExpr, isNameExpr, true);
        }
    }

    /**
     * isComment
     */
    public List<User> isMethod() {
        return ((UserAdapter) isNameExpr.isMethod()).isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(List<User> isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<>();
        }
        ((UserAdapter) isNameExpr.isMethod()).isMethod(isNameExpr);
        if (isNameExpr.isMethod() == isIntegerConstant && !isNameExpr.isMethod(isNameExpr.isMethod())) {
            isMethod();
        } else {
            isNameExpr.isMethod();
        }
    }

    // isComment
    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    public void isMethod() {
        isNameExpr.isMethod();
    }

    // isComment
    // isComment
    private OnClickListener isVariable = new OnClickListener() {

        @Override
        public void isMethod(View isParameter) {
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
    };

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
    @Override
    public void isMethod(Collection isParameter) {
    // isComment
    }

    @Override
    public void isMethod(Collection isParameter, User isParameter, Photo isParameter) {
        if (isNameExpr.isMethod() instanceof PhotoAdapter) {
            ((PhotoAdapter) isNameExpr.isMethod()).isMethod(isNameExpr, isNameExpr, true, true);
        }
    }

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
        if (isNameExpr.isMethod() instanceof FooterAdapter && ((FooterAdapter) isNameExpr.isMethod()).isMethod() > isIntegerConstant) {
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
        return isNameExpr.isMethod() <= isIntegerConstant && !isNameExpr.isMethod().isMethod("isStringConstant") && !isNameExpr.isMethod() && !isNameExpr.isMethod();
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
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod() {
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            return isIntegerConstant;
        } else {
            return isNameExpr.isMethod();
        }
    }

    @Override
    public boolean isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
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
        if (isNameExpr != null && isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr, true, isNameExpr.isMethod());
        }
        isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(@Nullable MysplashActivity isParameter, int isParameter) {
        if (isNameExpr != null && isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr, true, isNameExpr.isMethod());
        }
        isMethod(true);
        isNameExpr.isMethod(new LargeErrorStateAdapter(isMethod(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true, true, isNameExpr, this), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(@Nullable MysplashActivity isParameter, int isParameter) {
        if (isNameExpr != null && isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr, true, isNameExpr.isMethod());
        }
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
            RecyclerView.LayoutManager isVariable = isNameExpr.isMethod();
            int isVariable;
            if (isNameExpr instanceof StaggeredGridLayoutManager) {
                int[] isVariable = ((StaggeredGridLayoutManager) isNameExpr).isMethod(null);
                isNameExpr = isNameExpr[isNameExpr.isFieldAccessExpr - isIntegerConstant];
            } else {
                isNameExpr = ((GridLayoutManager) isNameExpr).isMethod();
            }
            if (isNameExpr.isMethod() != null) {
                int isVariable = isNameExpr.isMethod().isMethod() - isIntegerConstant;
                if (isNameExpr.isMethod() && isNameExpr >= isNameExpr - isIntegerConstant && isNameExpr > isIntegerConstant && isNameExpr > isIntegerConstant) {
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
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
    }

    // isComment
    @Override
    public boolean isMethod(int isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod(isNameExpr, isNameExpr) || ((FooterAdapter) isNameExpr.isMethod()).isMethod() <= isIntegerConstant;
            default:
                return true;
        }
    }
}
