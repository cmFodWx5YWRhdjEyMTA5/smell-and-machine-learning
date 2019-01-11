// isComment
package com.wangdaye.mysplash.collection.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.collection.presenter.activity.PopupManageImplementor;
import com.wangdaye.mysplash.common.basic.activity.LoadableActivity;
import com.wangdaye.mysplash.common.data.entity.table.WallpaperSource;
import com.wangdaye.mysplash.common.data.entity.unsplash.Photo;
import com.wangdaye.mysplash.common.i.model.DownloadModel;
import com.wangdaye.mysplash.common.i.presenter.DownloadPresenter;
import com.wangdaye.mysplash.common.i.presenter.PopupManagePresenter;
import com.wangdaye.mysplash.common.i.view.PopupManageView;
import com.wangdaye.mysplash.common.ui.adapter.MiniTagAdapter;
import com.wangdaye.mysplash.common.ui.adapter.PhotoAdapter;
import com.wangdaye.mysplash.common.ui.dialog.DownloadRepeatDialog;
import com.wangdaye.mysplash.common.ui.popup.CollectionMenuPopupWindow;
import com.wangdaye.mysplash.common.ui.widget.CircleImageView;
import com.wangdaye.mysplash.common.ui.widget.nestedScrollView.NestedScrollAppBarLayout;
import com.wangdaye.mysplash.common.ui.widget.SwipeBackCoordinatorLayout;
import com.wangdaye.mysplash.common.utils.DisplayUtils;
import com.wangdaye.mysplash.common.utils.FileUtils;
import com.wangdaye.mysplash.common.utils.helper.DatabaseHelper;
import com.wangdaye.mysplash.common.utils.helper.NotificationHelper;
import com.wangdaye.mysplash.common.utils.helper.ImageHelper;
import com.wangdaye.mysplash.common.utils.helper.IntentHelper;
import com.wangdaye.mysplash.common.utils.manager.AuthManager;
import com.wangdaye.mysplash.common.i.model.BrowsableModel;
import com.wangdaye.mysplash.common.i.model.EditResultModel;
import com.wangdaye.mysplash.common.i.presenter.BrowsablePresenter;
import com.wangdaye.mysplash.common.i.presenter.EditResultPresenter;
import com.wangdaye.mysplash.common.i.presenter.SwipeBackManagePresenter;
import com.wangdaye.mysplash.common.i.view.BrowsableView;
import com.wangdaye.mysplash.common.i.view.EditResultView;
import com.wangdaye.mysplash.common.i.view.SwipeBackManageView;
import com.wangdaye.mysplash.common.ui.dialog.RequestBrowsableDataDialog;
import com.wangdaye.mysplash.common.ui.dialog.UpdateCollectionDialog;
import com.wangdaye.mysplash.common.utils.BackToTopUtils;
import com.wangdaye.mysplash.common.utils.manager.ThemeManager;
import com.wangdaye.mysplash.collection.model.activity.BorwsableObject;
import com.wangdaye.mysplash.collection.model.activity.DownloadObject;
import com.wangdaye.mysplash.collection.model.activity.EditResultObject;
import com.wangdaye.mysplash.collection.presenter.activity.BrowsableImplementor;
import com.wangdaye.mysplash.collection.presenter.activity.DownloadImplementor;
import com.wangdaye.mysplash.collection.presenter.activity.EditResultImplementor;
import com.wangdaye.mysplash.collection.presenter.activity.SwipeBackManageImplementor;
import com.wangdaye.mysplash.collection.presenter.activity.ToolbarImplementor;
import com.wangdaye.mysplash.collection.view.widget.CollectionPhotosView;
import com.wangdaye.mysplash.common.data.entity.unsplash.Collection;
import com.wangdaye.mysplash.common.i.presenter.ToolbarPresenter;
import com.wangdaye.mysplash.common.ui.widget.coordinatorView.StatusBarView;
import com.wangdaye.mysplash.me.view.activity.MeActivity;
import com.wangdaye.mysplash.user.view.activity.UserActivity;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class isClassOrIsInterface extends LoadableActivity<Photo> implements SwipeBackManageView, PopupManageView, EditResultView, BrowsableView, View.OnClickListener, Toolbar.OnMenuItemClickListener, PhotoAdapter.OnDownloadPhotoListener, NestedScrollAppBarLayout.OnNestedScrollingListener, SwipeBackCoordinatorLayout.OnSwipeListener, UpdateCollectionDialog.OnCollectionChangedListener, DownloadRepeatDialog.OnCheckOrDownloadListener {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    StatusBarView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    CoordinatorLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    View isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    NestedScrollAppBarLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    Toolbar isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    CircleImageView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    CollectionPhotosView isVariable;

    private RequestBrowsableDataDialog isVariable;

    private ToolbarPresenter isVariable;

    private SwipeBackManagePresenter isVariable;

    private PopupManagePresenter isVariable;

    private EditResultModel isVariable;

    private EditResultPresenter isVariable;

    private BrowsableModel isVariable;

    private BrowsablePresenter isVariable;

    private DownloadModel isVariable;

    private DownloadPresenter isVariable;

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static class isClassOrIsInterface extends BaseSavedStateFragment {

        private List<Photo> isVariable;

        public List<Photo> isMethod() {
            return isNameExpr;
        }

        public void isMethod(List<Photo> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr.isMethod().isMethod(isMethod());
        }
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
        isMethod();
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (!isMethod()) {
            isMethod();
            isNameExpr.isMethod(this);
            isMethod(true);
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }

    @Override
    protected void isMethod() {
        if (isNameExpr.isMethod(this)) {
            isNameExpr.isMethod(this);
        }
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public void isMethod(Bundle isParameter) {
        // isComment
        SavedStateFragment isVariable = new SavedStateFragment();
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(this);
        // isComment
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        if (isNameExpr.isMethod() && isNameExpr.isMethod(true)) {
            isMethod();
        } else {
            isMethod(true);
        }
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod(this, true);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(boolean isParameter) {
        Intent isVariable = new Intent();
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod() == null);
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr);
        isMethod();
        if (isNameExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    @Override
    public CoordinatorLayout isMethod() {
        return isNameExpr;
    }

    @Override
    public List<Photo> isMethod(List<Photo> isParameter, int isParameter, boolean isParameter, Bundle isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public Bundle isMethod() {
        return new Bundle();
    }

    @Override
    public void isMethod(Photo isParameter) {
        isNameExpr.isMethod(isNameExpr, true);
    }

    // isComment
    private void isMethod() {
        Object isVariable = isMethod().isMethod(isNameExpr);
        if (!(isNameExpr instanceof Collection)) {
            this.isFieldAccessExpr = new EditResultObject(null);
        } else {
            this.isFieldAccessExpr = new EditResultObject((Collection) isNameExpr);
        }
        this.isFieldAccessExpr = new BorwsableObject(isMethod());
        this.isFieldAccessExpr = new DownloadObject();
    }

    private void isMethod() {
        this.isFieldAccessExpr = new ToolbarImplementor();
        this.isFieldAccessExpr = new SwipeBackManageImplementor(this);
        this.isFieldAccessExpr = new PopupManageImplementor(this);
        this.isFieldAccessExpr = new EditResultImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new BrowsableImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new DownloadImplementor(isNameExpr);
    }

    @SuppressLint("isStringConstant")
    private void isMethod(boolean isParameter) {
        if (isNameExpr && isNameExpr.isMethod() && isNameExpr.isMethod() == null) {
            isNameExpr.isMethod();
        } else {
            Collection isVariable = (Collection) isNameExpr.isMethod();
            SwipeBackCoordinatorLayout isVariable = isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(this);
            isNameExpr.isMethod(this);
            AppCompatImageView isVariable = isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(this, isNameExpr, isNameExpr);
            TextView isVariable = isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            RecyclerView isVariable = isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr.isFieldAccessExpr == null || isNameExpr.isFieldAccessExpr.isMethod() == isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(new LinearLayoutManager(this, isNameExpr.isFieldAccessExpr, true));
                isNameExpr.isMethod(new MiniTagAdapter(isNameExpr.isFieldAccessExpr));
            }
            TextView isVariable = isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            if (isMethod()) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(this);
            isNameExpr.isMethod(this);
            if (isNameExpr.isMethod(this, isMethod())) {
                isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(true);
            } else {
                isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(true);
            }
            isNameExpr.isMethod(this, isNameExpr, isNameExpr.isFieldAccessExpr);
            TextView isVariable = isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(this, (Collection) isNameExpr.isMethod());
            BaseSavedStateFragment isVariable = isNameExpr.isMethod(this);
            if (isNameExpr instanceof SavedStateFragment) {
                isNameExpr.isMethod(((SavedStateFragment) isNameExpr).isMethod());
            } else {
                isNameExpr.isMethod();
                isNameExpr.isMethod();
            }
        }
    }

    // isComment
    public void isMethod() {
        isNameExpr.isMethod(this, isNameExpr, null, isIntegerConstant);
    }

    // isComment
    public void isMethod() {
        isNameExpr.isMethod(isMethod());
        if (isNameExpr.isMethod(this).isMethod(isNameExpr.isMethod(((Collection) isNameExpr.isMethod()).isFieldAccessExpr)) > isIntegerConstant) {
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } else if (isNameExpr.isMethod(this, isNameExpr.isMethod(((Collection) isNameExpr.isMethod()).isFieldAccessExpr))) {
            DownloadRepeatDialog isVariable = new DownloadRepeatDialog();
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(this);
            isNameExpr.isMethod(isMethod(), null);
        } else {
            isMethod();
        }
    }

    private void isMethod() {
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr < isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(this);
        } else {
            isMethod();
        }
    }

    // isComment
    public Collection isMethod() {
        return (Collection) isNameExpr.isMethod();
    }

    // isComment
    @Override
    protected void isMethod(int isParameter) {
        isNameExpr.isMethod(this);
    }

    // isComment
    // isComment
    @Override
    public void isMethod(View isParameter) {
        switch(isNameExpr.isMethod()) {
            case -isIntegerConstant:
                if (isMethod()) {
                    isNameExpr.isMethod();
                }
                isNameExpr.isMethod(this);
                break;
        }
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isNameExpr.isMethod(this, isNameExpr, isNameExpr, ((Collection) isNameExpr.isMethod()).isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    // isComment
    @Override
    public boolean isMethod(MenuItem isParameter) {
        return isNameExpr.isMethod(this, isNameExpr.isMethod());
    }

    // isComment
    @Override
    public void isMethod(Photo isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isMethod();
    }

    // isComment
    @Override
    public void isMethod() {
    // isComment
    }

    @Override
    public void isMethod() {
        if (isNameExpr.isMethod() > -isNameExpr.isMethod()) {
            // isComment
            if (!isNameExpr.isMethod()) {
                isNameExpr.isMethod();
                isNameExpr.isMethod(this, true);
            }
        } else {
            // isComment
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod();
                isNameExpr.isMethod(this, true);
            }
        }
    }

    @Override
    public void isMethod() {
    // isComment
    }

    // isComment
    @Override
    public boolean isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(float isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public void isMethod(int isParameter) {
        isNameExpr.isMethod(this, isNameExpr);
    }

    // isComment
    @Override
    public void isMethod(Collection isParameter) {
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Collection isParameter) {
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    // isComment
    @Override
    public void isMethod(Object isParameter) {
        isNameExpr.isMethod(this, isNameExpr.isMethod(((Collection) isNameExpr).isFieldAccessExpr));
    }

    @Override
    public void isMethod(Object isParameter) {
        isMethod();
    }

    // isComment
    // isComment
    @Override
    public boolean isMethod(int isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod() <= -isNameExpr.isMethod();
        } else {
            return isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod() >= isIntegerConstant;
        }
    }

    // isComment
    @Override
    public void isMethod(String isParameter, int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                UpdateCollectionDialog isVariable = new UpdateCollectionDialog();
                isNameExpr.isMethod(isMethod());
                isNameExpr.isMethod(this);
                isNameExpr.isMethod(isMethod(), null);
                break;
            case isNameExpr.isFieldAccessExpr:
                isMethod();
                break;
            case isNameExpr.isFieldAccessExpr:
                WallpaperSource isVariable = isNameExpr.isMethod(this).isMethod(isMethod().isFieldAccessExpr);
                if (isNameExpr == null) {
                    isNameExpr = new WallpaperSource(isMethod());
                    isNameExpr.isMethod(this).isMethod(isNameExpr);
                    isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                } else {
                    isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                }
                break;
        }
    }

    // isComment
    @Override
    public void isMethod(Object isParameter) {
    // isComment
    }

    @Override
    public void isMethod(Object isParameter) {
        Collection isVariable = (Collection) isNameExpr;
        TextView isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        TextView isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod(Object isParameter) {
        isNameExpr.isMethod(null);
        isMethod(true);
    }

    // isComment
    @Override
    public void isMethod() {
        isNameExpr = new RequestBrowsableDataDialog();
        isNameExpr.isMethod(isMethod(), null);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
        isNameExpr = null;
    }

    @Override
    public void isMethod(Object isParameter) {
        isMethod().isMethod(isNameExpr, (Collection) isNameExpr);
        isMethod();
        isMethod();
        isMethod(true);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(this);
    }
}
