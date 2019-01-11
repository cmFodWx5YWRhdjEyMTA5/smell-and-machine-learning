// isComment
package com.wangdaye.mysplash.main.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.data.entity.unsplash.Photo;
import com.wangdaye.mysplash.common.data.entity.unsplash.User;
import com.wangdaye.mysplash.common.i.model.FollowingModel;
import com.wangdaye.mysplash.common.i.model.LoadModel;
import com.wangdaye.mysplash.common.i.model.ScrollModel;
import com.wangdaye.mysplash.common.i.presenter.FollowingPresenter;
import com.wangdaye.mysplash.common.i.presenter.LoadPresenter;
import com.wangdaye.mysplash.common.i.presenter.ScrollPresenter;
import com.wangdaye.mysplash.common.i.view.FollowingView;
import com.wangdaye.mysplash.common.i.view.LoadView;
import com.wangdaye.mysplash.common.i.view.ScrollView;
import com.wangdaye.mysplash.common.basic.activity.MysplashActivity;
import com.wangdaye.mysplash.common.ui.adapter.FollowingAdapter;
import com.wangdaye.mysplash.common.ui.adapter.multipleState.LargeErrorStateAdapter;
import com.wangdaye.mysplash.common.ui.adapter.multipleState.LargeLoadingStateAdapter;
import com.wangdaye.mysplash.common.ui.widget.CircleImageView;
import com.wangdaye.mysplash.common.ui.widget.MultipleStateRecyclerView;
import com.wangdaye.mysplash.common.ui.widget.nestedScrollView.NestedScrollFrameLayout;
import com.wangdaye.mysplash.common.ui.widget.swipeRefreshView.BothWaySwipeRefreshLayout;
import com.wangdaye.mysplash.common.utils.AnimUtils;
import com.wangdaye.mysplash.common.utils.BackToTopUtils;
import com.wangdaye.mysplash.common.utils.DisplayUtils;
import com.wangdaye.mysplash.common.utils.helper.ImageHelper;
import com.wangdaye.mysplash.common.utils.helper.IntentHelper;
import com.wangdaye.mysplash.common.utils.manager.ThemeManager;
import com.wangdaye.mysplash.main.model.widget.FollowingObject;
import com.wangdaye.mysplash.main.model.widget.LoadObject;
import com.wangdaye.mysplash.main.model.widget.ScrollObject;
import com.wangdaye.mysplash.main.presenter.widget.FollowingImplementor;
import com.wangdaye.mysplash.main.presenter.widget.LoadImplementor;
import com.wangdaye.mysplash.main.presenter.widget.ScrollImplementor;
import com.wangdaye.mysplash.user.view.activity.UserActivity;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class isClassOrIsInterface extends NestedScrollFrameLayout implements FollowingView, LoadView, ScrollView, BothWaySwipeRefreshLayout.OnRefreshAndLoadListener, LargeErrorStateAdapter.OnRetryListener {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    BothWaySwipeRefreshLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    MultipleStateRecyclerView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    RelativeLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    FrameLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    CircleImageView isVariable;

    private AvatarScrollListener isVariable;

    private FollowingModel isVariable;

    private FollowingPresenter isVariable;

    private LoadModel isVariable;

    private LoadPresenter isVariable;

    private ScrollModel isVariable;

    private ScrollPresenter isVariable;

    // isComment
    // isComment
    private float isVariable = isIntegerConstant;

    private float isVariable;

    private float isVariable;

    private static class isClassOrIsInterface extends BaseSavedState {

        int isVariable;

        boolean isVariable;

        float isVariable;

        isConstructor(FollowingFeedView isParameter, Parcelable isParameter) {
            super(isNameExpr);
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        }

        private isConstructor(Parcel isParameter) {
            super(isNameExpr);
            this.isFieldAccessExpr = isNameExpr.isMethod();
            this.isFieldAccessExpr = isNameExpr.isMethod() != isIntegerConstant;
            this.isFieldAccessExpr = isNameExpr.isMethod();
        }

        @Override
        public void isMethod(Parcel isParameter, int isParameter) {
            super.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(this.isFieldAccessExpr);
            isNameExpr.isMethod(this.isFieldAccessExpr ? (byte) isIntegerConstant : (byte) isIntegerConstant);
            isNameExpr.isMethod(this.isFieldAccessExpr);
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

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        this.isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        this.isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isMethod();
    }

    // isComment
    @SuppressLint("isStringConstant")
    private void isMethod() {
        View isVariable = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr);
        View isVariable = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr);
        isNameExpr.isMethod(this, this);
        isMethod();
        isMethod();
        isMethod();
    }

    private void isMethod() {
        this.isFieldAccessExpr = new FollowingObject(new FollowingAdapter(isMethod(), new ArrayList<Photo>(isNameExpr.isFieldAccessExpr)));
        this.isFieldAccessExpr = new LoadObject(isNameExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = new ScrollObject(true);
        this.isFieldAccessExpr = new DisplayUtils(isMethod()).isMethod(isIntegerConstant);
        this.isFieldAccessExpr = isNameExpr.isMethod(isMethod());
    }

    private void isMethod() {
        this.isFieldAccessExpr = new FollowingImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new LoadImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new ScrollImplementor(isNameExpr, this);
    }

    private void isMethod() {
        this.isMethod();
        this.isMethod();
    }

    private void isMethod() {
        FrameLayout.LayoutParams isVariable = (FrameLayout.LayoutParams) isNameExpr.isMethod();
        int isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr + isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod(isMethod()) > isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        int isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        int isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr > isIntegerConstant) {
            int isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        } else {
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        }
        isNameExpr.isMethod(new StaggeredGridLayoutManager(isNameExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new LargeLoadingStateAdapter(isMethod(), isIntegerConstant), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new LargeErrorStateAdapter(isMethod(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), this), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = new AvatarScrollListener(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    // isComment
    @Override
    public Parcelable isMethod() {
        return new SavedState(this, super.isMethod());
    }

    @Override
    public void isMethod(Parcelable isParameter) {
        SavedState isVariable = (SavedState) isNameExpr;
        super.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    // isComment
    /**
     * isComment
     */
    public void isMethod(MysplashActivity isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    public List<Photo> isMethod(List<Photo> isParameter, int isParameter, boolean isParameter) {
        if ((isNameExpr && isNameExpr.isMethod().isMethod() < isNameExpr) || (!isNameExpr && isNameExpr.isMethod().isMethod() < isNameExpr + isNameExpr.isMethod())) {
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
                return isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant, isNameExpr - isIntegerConstant);
            }
        } else {
            if (isNameExpr.isMethod().isMethod() == isNameExpr + isNameExpr.isMethod()) {
                return new ArrayList<>();
            } else {
                return isNameExpr.isMethod().isMethod().isMethod(isNameExpr + isNameExpr.isMethod(), isNameExpr.isMethod().isMethod() - isIntegerConstant);
            }
        }
    }

    public boolean isMethod() {
        return isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
    }

    // isComment
    /**
     * isComment
     */
    public List<Photo> isMethod() {
        return isNameExpr.isMethod().isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(List<Photo> isParameter) {
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

    public void isMethod(Photo isParameter, boolean isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr, true);
    }

    // isComment
    public void isMethod() {
        isNameExpr.isMethod(isMethod());
    }

    public void isMethod() {
        isNameExpr.isMethod();
    }

    // isComment
    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    public void isMethod() {
        isNameExpr.isMethod();
    }

    // isComment
    /**
     * isComment
     */
    public void isMethod(float isParameter) {
        if (this.isFieldAccessExpr != isNameExpr) {
            this.isFieldAccessExpr = isNameExpr;
            if (isNameExpr != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
            }
        }
    }

    public float isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    private float isMethod() {
        return isNameExpr.isMethod(isMethod() - isNameExpr, isIntegerConstant);
    }

    // isComment
    // isComment
    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
    // isComment
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        if (isNameExpr.isMethod() != null) {
            int isVariable = ((StaggeredGridLayoutManager) isNameExpr.isMethod()).isMethod(null)[isIntegerConstant];
            User isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
            }
        }
    }

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
    /**
     * isComment
     */
    private RecyclerView.OnScrollListener isVariable = new RecyclerView.OnScrollListener() {

        @Override
        public void isMethod(@NonNull RecyclerView isParameter, int isParameter, int isParameter) {
            super.isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    };

    /**
     * isComment
     */
    private class isClassOrIsInterface extends RecyclerView.OnScrollListener {

        // isComment
        private StaggeredGridLayoutManager isVariable;

        // isComment
        private int isVariable;

        @Nullable
        private User isVariable;

        private int isVariable;

        private int isVariable;

        isConstructor(int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = null;
            this.isFieldAccessExpr = isIntegerConstant;
            this.isFieldAccessExpr = isIntegerConstant;
        }

        @Override
        public void isMethod(@NonNull RecyclerView isParameter, int isParameter, int isParameter) {
            if (isNameExpr != isIntegerConstant) {
                return;
            }
            isMethod();
            if (isNameExpr == null) {
                return;
            }
            int isVariable = isNameExpr.isMethod(null)[isIntegerConstant];
            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                // isComment
                // isComment
                View isVariable = isNameExpr.isMethod(isNameExpr);
                View isVariable = isNameExpr.isMethod(isNameExpr + isIntegerConstant);
                if (isNameExpr != null && isNameExpr != null) {
                    float isVariable = isNameExpr.isMethod() + isNameExpr.isMethod();
                    float isVariable = isNameExpr.isMethod();
                    if (isNameExpr < isNameExpr + isMethod() && isNameExpr > isMethod()) {
                        // isComment
                        // isComment
                        // isComment
                        isNameExpr.isMethod(isNameExpr - isNameExpr - isNameExpr);
                        isNameExpr = isNameExpr;
                        isNameExpr = isNameExpr;
                        isMethod(isNameExpr);
                    } else {
                        // isComment
                        // isComment
                        // isComment
                        isNameExpr.isMethod(-isNameExpr + isMethod());
                        isNameExpr = isNameExpr;
                        isNameExpr = isNameExpr + (isNameExpr <= isMethod() ? isIntegerConstant : isIntegerConstant);
                        isMethod(isNameExpr);
                    }
                }
            } else {
                // isComment
                // isComment
                isNameExpr.isMethod(-isNameExpr + isMethod());
                isNameExpr = isNameExpr;
                isNameExpr = isNameExpr;
                isMethod(isNameExpr);
            }
        }

        private void isMethod() {
            if (isNameExpr.isMethod() != null && isNameExpr.isMethod() instanceof StaggeredGridLayoutManager) {
                this.isFieldAccessExpr = (StaggeredGridLayoutManager) isNameExpr.isMethod();
            }
        }

        private void isMethod(RecyclerView isParameter) {
            User isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
            if (isNameExpr == null) {
                return;
            }
            if (isNameExpr == null || !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isMethod(isNameExpr);
            }
            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
        }

        private void isMethod(int isParameter) {
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isIntegerConstant, null);
            }
        }
    }

    // isComment
    // isComment
    @Override
    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
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
    public void isMethod(View isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final View isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(@Nullable MysplashActivity isParameter, int isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, true, isNameExpr.isMethod());
        }
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isMethod()) == isIntegerConstant) {
            isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(@Nullable MysplashActivity isParameter, int isParameter) {
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isMethod()) == isIntegerConstant) {
            isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(@Nullable MysplashActivity isParameter, int isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, true, isNameExpr.isMethod());
        }
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isMethod()) == isIntegerConstant) {
            isMethod(isNameExpr);
        }
    }

    // isComment
    @Override
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant);
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
                isNameExpr.isMethod(true);
            }
        }
    }

    @Override
    public boolean isMethod() {
        return !isNameExpr.isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr;
    }
}
