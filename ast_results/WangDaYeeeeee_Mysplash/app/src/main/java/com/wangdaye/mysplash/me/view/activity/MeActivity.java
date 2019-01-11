// isComment
package com.wangdaye.mysplash.me.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.basic.activity.LoadableActivity;
import com.wangdaye.mysplash.common.data.entity.unsplash.Collection;
import com.wangdaye.mysplash.common.data.entity.unsplash.Me;
import com.wangdaye.mysplash.common.data.entity.unsplash.Photo;
import com.wangdaye.mysplash.common.data.entity.unsplash.User;
import com.wangdaye.mysplash.common.i.model.DownloadModel;
import com.wangdaye.mysplash.common.i.presenter.DownloadPresenter;
import com.wangdaye.mysplash.common.ui.adapter.PhotoAdapter;
import com.wangdaye.mysplash.common.ui.dialog.ProfileDialog;
import com.wangdaye.mysplash.common.ui.dialog.SelectCollectionDialog;
import com.wangdaye.mysplash.common.ui.widget.AutoHideInkPageIndicator;
import com.wangdaye.mysplash.common.ui.widget.CircleImageView;
import com.wangdaye.mysplash.common.ui.widget.nestedScrollView.NestedScrollAppBarLayout;
import com.wangdaye.mysplash.common.ui.widget.SwipeBackCoordinatorLayout;
import com.wangdaye.mysplash.common.utils.helper.IntentHelper;
import com.wangdaye.mysplash.common.utils.helper.ImageHelper;
import com.wangdaye.mysplash.common.utils.manager.AuthManager;
import com.wangdaye.mysplash.common.i.model.PagerManageModel;
import com.wangdaye.mysplash.common.i.presenter.PagerManagePresenter;
import com.wangdaye.mysplash.common.i.presenter.PopupManagePresenter;
import com.wangdaye.mysplash.common.i.presenter.SwipeBackManagePresenter;
import com.wangdaye.mysplash.common.i.presenter.ToolbarPresenter;
import com.wangdaye.mysplash.common.i.view.PagerManageView;
import com.wangdaye.mysplash.common.i.view.PagerView;
import com.wangdaye.mysplash.common.i.view.PopupManageView;
import com.wangdaye.mysplash.common.i.view.SwipeBackManageView;
import com.wangdaye.mysplash.common.ui.adapter.MyPagerAdapter;
import com.wangdaye.mysplash.common.ui.widget.coordinatorView.StatusBarView;
import com.wangdaye.mysplash.common.utils.AnimUtils;
import com.wangdaye.mysplash.common.utils.BackToTopUtils;
import com.wangdaye.mysplash.common.utils.DisplayUtils;
import com.wangdaye.mysplash.common.utils.manager.ThemeManager;
import com.wangdaye.mysplash.me.model.activity.DownloadObject;
import com.wangdaye.mysplash.me.model.activity.PagerManageObject;
import com.wangdaye.mysplash.me.model.widget.PhotosObject;
import com.wangdaye.mysplash.me.presenter.activity.DownloadImplementor;
import com.wangdaye.mysplash.me.presenter.activity.PagerManageImplementor;
import com.wangdaye.mysplash.me.presenter.activity.PopupManageImplementor;
import com.wangdaye.mysplash.me.presenter.activity.SwipeBackManageImplementor;
import com.wangdaye.mysplash.me.presenter.activity.ToolbarImplementor;
import com.wangdaye.mysplash.me.view.widget.MeCollectionsView;
import com.wangdaye.mysplash.me.view.widget.MePhotosView;
import com.wangdaye.mysplash.me.view.widget.MeProfileView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class isClassOrIsInterface extends LoadableActivity<Photo> implements PagerManageView, PopupManageView, SwipeBackManageView, View.OnClickListener, Toolbar.OnMenuItemClickListener, PhotoAdapter.OnDownloadPhotoListener, ViewPager.OnPageChangeListener, NestedScrollAppBarLayout.OnNestedScrollingListener, SwipeBackCoordinatorLayout.OnSwipeListener, SelectCollectionDialog.OnCollectionsChangedListener, AuthManager.OnAuthDataChangedListener {

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
    TextView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ViewPager isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    AutoHideInkPageIndicator isVariable;

    private MyPagerAdapter isVariable;

    private PagerView[] isVariable = new PagerView[isIntegerConstant];

    private ToolbarPresenter isVariable;

    private PagerManageModel isVariable;

    private PagerManagePresenter isVariable;

    private PopupManagePresenter isVariable;

    private SwipeBackManagePresenter isVariable;

    private DownloadModel isVariable;

    private DownloadPresenter isVariable;

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static class isClassOrIsInterface extends BaseSavedStateFragment {

        private List<Photo> isVariable;

        private List<Collection> isVariable;

        private List<Photo> isVariable;

        public List<Photo> isMethod() {
            return isNameExpr;
        }

        public void isMethod(List<Photo> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        public List<Collection> isMethod() {
            return isNameExpr;
        }

        public void isMethod(List<Collection> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

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
        isMethod(isNameExpr);
        isMethod();
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (!isMethod()) {
            isMethod();
            isNameExpr.isMethod(this);
            isMethod();
        }
    }

    @Override
    protected void isMethod(int isParameter, int isParameter, Intent isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr == null) {
            return;
        }
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                Collection isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    if (isNameExpr.isMethod(isNameExpr, true)) {
                        // isComment
                        if (isNameExpr.isMethod().isMethod() != null) {
                            isNameExpr.isMethod().isMethod().isFieldAccessExpr--;
                            isMethod(isNameExpr.isMethod().isMethod());
                        }
                        ((MeCollectionsView) isNameExpr[isIntegerConstant]).isMethod(isNameExpr);
                    } else {
                        ((MeCollectionsView) isNameExpr[isIntegerConstant]).isMethod(isNameExpr, true);
                    }
                }
                break;
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod().isMethod(this);
        isNameExpr.isMethod().isMethod();
        for (PagerView isVariable : isNameExpr) {
            isNameExpr.isMethod();
        }
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
        if (isNameExpr[isIntegerConstant] != null) {
            isNameExpr.isMethod(((MePhotosView) isNameExpr[isIntegerConstant]).isMethod());
        }
        if (isNameExpr[isIntegerConstant] != null) {
            isNameExpr.isMethod(((MePhotosView) isNameExpr[isIntegerConstant]).isMethod());
        }
        if (isNameExpr[isIntegerConstant] != null) {
            isNameExpr.isMethod(((MeCollectionsView) isNameExpr[isIntegerConstant]).isMethod());
        }
        isNameExpr.isMethod(this);
        // isComment
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
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
    protected void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod(this, true);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(boolean isParameter) {
        isMethod(isNameExpr);
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
        int isVariable = isNameExpr.isMethod(isNameExpr, -isIntegerConstant);
        switch(isNameExpr) {
            case isIntegerConstant:
            case isIntegerConstant:
                if (((MePhotosView) isNameExpr[isNameExpr]).isMethod().isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"))) {
                    return ((MePhotosView) isNameExpr[isNameExpr]).isMethod(isNameExpr, isNameExpr, isNameExpr);
                }
        }
        return new ArrayList<>();
    }

    @Override
    public Bundle isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        if (isNameExpr.isMethod() < isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr, ((MePhotosView) isNameExpr[isNameExpr.isMethod()]).isMethod());
        }
        return isNameExpr;
    }

    @Override
    public void isMethod(Photo isParameter) {
        ((MePhotosView) isNameExpr[isNameExpr.isMethod()]).isMethod(isNameExpr);
    }

    // isComment
    private void isMethod(Bundle isParameter) {
        int isVariable = isIntegerConstant;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else {
            isNameExpr = isMethod().isMethod(isNameExpr, isNameExpr);
        }
        this.isFieldAccessExpr = new PagerManageObject(isNameExpr);
        this.isFieldAccessExpr = new DownloadObject();
        isNameExpr.isMethod().isMethod(this);
        if (isNameExpr.isMethod().isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod().isMethod();
        }
    }

    private void isMethod() {
        this.isFieldAccessExpr = new ToolbarImplementor();
        this.isFieldAccessExpr = new PagerManageImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new PopupManageImplementor(this);
        this.isFieldAccessExpr = new SwipeBackManageImplementor(this);
        this.isFieldAccessExpr = new DownloadImplementor(isNameExpr);
    }

    private void isMethod() {
        SwipeBackCoordinatorLayout isVariable = isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        if (isMethod()) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(new OnClickAvatarListener());
        isMethod();
        isMethod();
    }

    private void isMethod() {
        List<View> isVariable = new ArrayList<>();
        isNameExpr.isMethod(new MePhotosView(this, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isMethod() == isIntegerConstant));
        isNameExpr.isMethod(new MePhotosView(this, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isMethod() == isIntegerConstant));
        isNameExpr.isMethod(new MeCollectionsView(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isMethod() == isIntegerConstant));
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            isNameExpr[isNameExpr] = (PagerView) isNameExpr.isMethod(isNameExpr);
        }
        String[] isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        List<String> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = new MyPagerAdapter(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(this);
        TabLayout isVariable = isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isDoubleConstant);
        BaseSavedStateFragment isVariable = isNameExpr.isMethod(this);
        if (isNameExpr instanceof SavedStateFragment) {
            ((MePhotosView) isNameExpr[isIntegerConstant]).isMethod(((SavedStateFragment) isNameExpr).isMethod());
            ((MePhotosView) isNameExpr[isIntegerConstant]).isMethod(((SavedStateFragment) isNameExpr).isMethod());
            ((MeCollectionsView) isNameExpr[isIntegerConstant]).isMethod(((SavedStateFragment) isNameExpr).isMethod());
            if (isMethod() != null) {
                for (PagerView isVariable : isNameExpr) {
                    isNameExpr.isMethod(isMethod());
                }
            }
        } else {
            isNameExpr.isMethod((View) isNameExpr[isNameExpr.isMethod()], isIntegerConstant);
            for (PagerView isVariable : isNameExpr) {
                isNameExpr.isMethod();
            }
        }
    }

    private void isMethod(@Nullable Me isParameter) {
        if (isNameExpr != null) {
            List<String> isVariable = new ArrayList<>();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) + "isStringConstant" + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)[isIntegerConstant]);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) + "isStringConstant" + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)[isIntegerConstant]);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) + "isStringConstant" + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)[isIntegerConstant]);
            isNameExpr.isFieldAccessExpr = isNameExpr;
            isNameExpr.isMethod();
        }
    }

    @SuppressLint("isStringConstant")
    private void isMethod() {
        if (isNameExpr.isMethod().isMethod() != null) {
            Me isVariable = isNameExpr.isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr);
        } else if (!isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod() + "isStringConstant" + isNameExpr.isMethod().isMethod());
        } else {
            isNameExpr.isMethod("isStringConstant");
        }
        if (isNameExpr.isMethod().isMethod() != null) {
            isNameExpr.isMethod(this, isNameExpr, isNameExpr.isMethod().isMethod());
            MeProfileView isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        } else if (!isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
            isNameExpr.isMethod(this, isNameExpr, isNameExpr.isMethod().isMethod());
        } else {
            isNameExpr.isMethod(this, isNameExpr, new User());
        }
    }

    // isComment
    public void isMethod(boolean isParameter) {
        if (isNameExpr) {
            int isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(this, isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr);
        } else {
            isNameExpr.isMethod(this, isNameExpr, null, -isIntegerConstant);
        }
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
                    isNameExpr.isMethod(this);
                }
                isNameExpr.isMethod(this);
                break;
        }
    }

    private class isClassOrIsInterface implements View.OnClickListener {

        // isComment
        @Override
        public void isMethod(View isParameter) {
            if (isNameExpr.isMethod().isMethod() != null) {
                isNameExpr.isMethod(isNameExpr.this, isNameExpr.isMethod().isMethod(), true);
            }
        }
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        if (isNameExpr.isMethod().isMethod() && !isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
            ProfileDialog isVariable = new ProfileDialog();
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod(isMethod(), null);
        }
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
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr < isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(this);
        } else {
            isMethod();
        }
    }

    // isComment
    @Override
    public void isMethod(int isParameter, float isParameter, int isParameter) {
    // isComment
    }

    @Override
    public void isMethod(int isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr[isNameExpr].isMethod(isNameExpr == isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod().isMethod() != isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr.isMethod(this, isNameExpr[isNameExpr].isMethod(), true);
    }

    @Override
    public void isMethod(int isParameter) {
        if (isNameExpr.isMethod() <= -isNameExpr.isMethod()) {
            switch(isNameExpr) {
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr.isMethod(true);
                    break;
                case isNameExpr.isFieldAccessExpr:
                    isNameExpr.isMethod(true);
                    break;
            }
        }
    }

    // isComment
    @Override
    public void isMethod() {
    // isComment
    }

    @Override
    public void isMethod() {
        if (isNameExpr.isMethod() > -isNameExpr.isMethod()) {
            if (!isNameExpr.isMethod()) {
                isNameExpr.isMethod();
                isNameExpr.isMethod(this, true);
            }
        } else {
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
        if (isNameExpr.isMethod().isMethod() != null) {
            isNameExpr.isMethod().isMethod().isFieldAccessExpr++;
            isMethod(isNameExpr.isMethod().isMethod());
        }
        ((MeCollectionsView) isNameExpr[isIntegerConstant]).isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Collection isParameter, User isParameter, Photo isParameter) {
        ((MePhotosView) isNameExpr[isIntegerConstant]).isMethod(isNameExpr);
        ((MePhotosView) isNameExpr[isIntegerConstant]).isMethod(isNameExpr);
        ((MeCollectionsView) isNameExpr[isIntegerConstant]).isMethod(isNameExpr, true);
    }

    // isComment
    @Override
    public void isMethod() {
        isMethod();
    }

    @Override
    public void isMethod() {
        isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    public void isMethod() {
        isMethod();
    }

    @Override
    public void isMethod() {
    // isComment
    }

    // isComment
    // isComment
    @Override
    public PagerView isMethod(int isParameter) {
        return isNameExpr[isNameExpr];
    }

    @Override
    public boolean isMethod(int isParameter, int isParameter) {
        return isNameExpr[isNameExpr].isMethod(isNameExpr);
    }

    @Override
    public int isMethod(int isParameter) {
        return isNameExpr[isNameExpr].isMethod();
    }

    // isComment
    @Override
    public void isMethod(String isParameter, int isParameter) {
        isNameExpr[isNameExpr].isMethod(isNameExpr);
        if (isNameExpr.isMethod().isMethod() != isNameExpr.isFieldAccessExpr) {
            isNameExpr[isNameExpr].isMethod();
        }
    }

    // isComment
    @Override
    public boolean isMethod(int isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod() <= -isNameExpr.isMethod() + isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            return isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod() >= isIntegerConstant;
        }
    }
}
