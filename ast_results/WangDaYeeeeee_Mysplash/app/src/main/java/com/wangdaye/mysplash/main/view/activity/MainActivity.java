// isComment
package com.wangdaye.mysplash.main.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.basic.activity.LoadableActivity;
import com.wangdaye.mysplash.common.basic.fragment.LoadableFragment;
import com.wangdaye.mysplash.common.data.entity.unsplash.Collection;
import com.wangdaye.mysplash.common.data.entity.unsplash.Photo;
import com.wangdaye.mysplash.common.data.entity.unsplash.User;
import com.wangdaye.mysplash.common.i.model.DownloadModel;
import com.wangdaye.mysplash.common.i.presenter.DownloadPresenter;
import com.wangdaye.mysplash.common.basic.fragment.MysplashFragment;
import com.wangdaye.mysplash.common.ui.activity.invisible.RestartActivity;
import com.wangdaye.mysplash.common.ui.adapter.PhotoAdapter;
import com.wangdaye.mysplash.common.ui.widget.CircleImageView;
import com.wangdaye.mysplash.common.utils.DisplayUtils;
import com.wangdaye.mysplash.common.utils.helper.IntentHelper;
import com.wangdaye.mysplash.common.utils.helper.ImageHelper;
import com.wangdaye.mysplash.common.utils.manager.AuthManager;
import com.wangdaye.mysplash.common.i.model.DrawerModel;
import com.wangdaye.mysplash.common.i.presenter.DrawerPresenter;
import com.wangdaye.mysplash.common.i.presenter.FragmentManagePresenter;
import com.wangdaye.mysplash.common.i.presenter.MeManagePresenter;
import com.wangdaye.mysplash.common.i.presenter.MessageManagePresenter;
import com.wangdaye.mysplash.common.i.view.DrawerView;
import com.wangdaye.mysplash.common.i.view.MeManageView;
import com.wangdaye.mysplash.common.ui.activity.IntroduceActivity;
import com.wangdaye.mysplash.common.utils.BackToTopUtils;
import com.wangdaye.mysplash.common.utils.manager.ShortcutsManager;
import com.wangdaye.mysplash.common.utils.manager.ThemeManager;
import com.wangdaye.mysplash.common.utils.manager.ThreadManager;
import com.wangdaye.mysplash.main.model.activity.DownloadObject;
import com.wangdaye.mysplash.main.model.activity.DrawerObject;
import com.wangdaye.mysplash.main.model.activity.FragmentManageObject;
import com.wangdaye.mysplash.common.i.model.FragmentManageModel;
import com.wangdaye.mysplash.common.i.view.MessageManageView;
import com.wangdaye.mysplash.main.presenter.activity.DownloadImplementor;
import com.wangdaye.mysplash.main.presenter.activity.DrawerImplementor;
import com.wangdaye.mysplash.main.presenter.activity.FragmentManageImplementor;
import com.wangdaye.mysplash.main.presenter.activity.MeManageImplementor;
import com.wangdaye.mysplash.main.presenter.activity.MessageManageImplementor;
import com.wangdaye.mysplash.common.utils.widget.SafeHandler;
import com.wangdaye.mysplash.main.view.fragment.FollowingFragment;
import com.wangdaye.mysplash.main.view.fragment.HomeFragment;
import com.wangdaye.mysplash.main.view.fragment.MultiFilterFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import butterknife.BindView;
import butterknife.ButterKnife;

public class isClassOrIsInterface extends LoadableActivity<Photo> implements MessageManageView, MeManageView, DrawerView, View.OnClickListener, NavigationView.OnNavigationItemSelectedListener, PhotoAdapter.OnDownloadPhotoListener, AuthManager.OnAuthDataChangedListener, SafeHandler.HandlerContainer {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    DrawerLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    NavigationView isVariable;

    private AppCompatImageView isVariable;

    private CircleImageView isVariable;

    private TextView isVariable;

    private TextView isVariable;

    private AppCompatImageButton isVariable;

    private SafeHandler<MainActivity> isVariable;

    private FragmentManageModel isVariable;

    private FragmentManagePresenter isVariable;

    private MessageManagePresenter isVariable;

    private MeManagePresenter isVariable;

    private DrawerModel isVariable;

    private DrawerPresenter isVariable;

    private DownloadModel isVariable;

    private DownloadPresenter isVariable;

    public static final String isVariable = "isStringConstant";

    private final String isVariable = "isStringConstant";

    private final String isVariable = "isStringConstant";

    private final int isVariable = isIntegerConstant;

    private final int isVariable = isIntegerConstant;

    private final int isVariable = isIntegerConstant;

    private Runnable isVariable = new Runnable() {

        @Override
        public void isMethod() {
            // isComment
            isNameExpr.isMethod().isMethod(isNameExpr.this);
            // isComment
            if (isNameExpr.isMethod().isMethod() && (isNameExpr.isMethod(isNameExpr.isMethod().isMethod()) || isNameExpr.isMethod().isMethod() < isIntegerConstant)) {
                isNameExpr.isMethod(isNameExpr).isMethod();
            } else {
                isNameExpr.isMethod(isNameExpr).isMethod();
            }
            // isComment
            isNameExpr.isMethod(isNameExpr.this);
            // isComment
            isNameExpr.isMethod(isNameExpr).isMethod();
        }
    };

    public static class isClassOrIsInterface extends BaseSavedStateFragment {

        // isComment
        private List<Photo> isVariable;

        private List<Photo> isVariable;

        private List<Photo> isVariable;

        private List<Collection> isVariable;

        private List<Collection> isVariable;

        private List<Collection> isVariable;

        private List<Photo> isVariable;

        // isComment
        public List<Photo> isMethod() {
            return isNameExpr;
        }

        public void isMethod(List<Photo> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

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

        public List<Collection> isMethod() {
            return isNameExpr;
        }

        public void isMethod(List<Collection> isParameter) {
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
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isMethod();
    }

    @Override
    protected void isMethod(Intent isParameter) {
        super.isMethod(isNameExpr);
        if (isMethod(isNameExpr)) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (!isMethod()) {
            isMethod();
            isNameExpr.isMethod(this);
            isMethod();
            isMethod();
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
    }

    @Override
    protected void isMethod(int isParameter, int isParameter, Intent isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        MysplashFragment isVariable = isMethod();
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isMethod();
        }
    }

    /*isComment*/
    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod().isMethod(this);
        isNameExpr.isMethod().isMethod();
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
        List<MysplashFragment> isVariable = isNameExpr.isMethod(this, true);
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
        }
        isNameExpr.isMethod(this);
        // isComment
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Override
    public void isMethod() {
        DrawerLayout isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            MysplashFragment isVariable = isMethod();
            if (isNameExpr != null && isNameExpr.isMethod() && isNameExpr.isMethod(true)) {
                isNameExpr.isMethod();
            } else if (isNameExpr instanceof HomeFragment) {
                isMethod(true);
            } else {
                isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
    }

    @Override
    protected void isMethod() {
    // isComment
    }

    @Override
    public void isMethod(boolean isParameter) {
        isMethod();
    }

    @Override
    public CoordinatorLayout isMethod() {
        MysplashFragment isVariable = isMethod();
        if (isNameExpr == null) {
            return null;
        } else {
            return isNameExpr.isMethod();
        }
    }

    @Override
    public List<Photo> isMethod(List<Photo> isParameter, int isParameter, boolean isParameter, Bundle isParameter) {
        MysplashFragment isVariable = isMethod();
        if (isNameExpr != null) {
            int isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
            switch(isNameExpr) {
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    if (isNameExpr instanceof HomeFragment) {
                        return ((HomeFragment) isNameExpr).isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                    }
                    break;
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    if (isNameExpr instanceof FollowingFragment) {
                        return ((FollowingFragment) isNameExpr).isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                    }
                    break;
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    if (isNameExpr instanceof MultiFilterFragment) {
                        return ((MultiFilterFragment) isNameExpr).isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                    }
                    break;
            }
        }
        return new ArrayList<>();
    }

    @Override
    public Bundle isMethod() {
        Bundle isVariable = new Bundle();
        MysplashFragment isVariable = isMethod();
        if (isNameExpr instanceof LoadableFragment) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            return ((LoadableFragment) isNameExpr).isMethod(isNameExpr);
        } else {
            return isNameExpr;
        }
    }

    @Override
    public void isMethod(Photo isParameter) {
        MysplashFragment isVariable = isMethod();
        if (isNameExpr instanceof LoadableFragment) {
            ((LoadableFragment) isNameExpr).isMethod(isNameExpr);
        }
    }

    // isComment
    private void isMethod(@Nullable Bundle isParameter) {
        int isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        int isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else if (isMethod(isMethod())) {
            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        this.isFieldAccessExpr = new FragmentManageObject(isNameExpr, isMethod());
        this.isFieldAccessExpr = new DrawerObject(isNameExpr);
        this.isFieldAccessExpr = new DownloadObject();
    }

    private void isMethod() {
        this.isFieldAccessExpr = new FragmentManageImplementor(isNameExpr);
        this.isFieldAccessExpr = new MessageManageImplementor(this);
        this.isFieldAccessExpr = new MeManageImplementor(this);
        this.isFieldAccessExpr = new DrawerImplementor(isNameExpr, this);
        this.isFieldAccessExpr = new DownloadImplementor(isNameExpr);
    }

    private void isMethod() {
        this.isFieldAccessExpr = new SafeHandler<>(this);
        if (isNameExpr.isMethod(this).isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(this);
        if (isNameExpr.isMethod().isMethod() && isNameExpr.isMethod()) {
            isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(true);
        } else {
            isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(true);
        }
        View isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(this);
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
    }

    private void isMethod() {
        BaseSavedStateFragment isVariable = isNameExpr.isMethod(this);
        if (isNameExpr instanceof SavedStateFragment) {
            List<MysplashFragment> isVariable = isNameExpr.isMethod(this, true);
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
            }
        } else {
            isMethod(isNameExpr.isMethod());
        }
    }

    // isComment
    private void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(isNameExpr.isMethod(this).isMethod() ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
        isMethod();
    }

    public void isMethod() {
        Intent isVariable = new Intent(this, RestartActivity.class);
        isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
    }

    public void isMethod(int isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this, isNameExpr);
    }

    @Nullable
    public MysplashFragment isMethod() {
        return isNameExpr.isMethod(this);
    }

    private boolean isMethod(Intent isParameter) {
        return !(isNameExpr == null || isNameExpr.isMethod(isNameExpr.isMethod())) && isNameExpr.isMethod().isMethod(isNameExpr);
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
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this);
                break;
        }
    }

    // isComment
    @Override
    public boolean isMethod(@NonNull MenuItem isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
        return true;
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
    @SuppressLint("isStringConstant")
    @Override
    public void isMethod() {
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(true);
        }
        isNameExpr.isMethod();
    }

    @SuppressLint("isStringConstant")
    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(true);
        isNameExpr.isMethod();
    }

    // isComment
    @Override
    public void isMethod(Message isParameter) {
        switch(isNameExpr.isFieldAccessExpr) {
            case isNameExpr:
                isNameExpr.isMethod().isMethod();
                break;
            case isNameExpr:
                if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant) {
                    isNameExpr.isMethod(isNameExpr.this);
                }
                break;
            case isNameExpr:
                isMethod();
                isMethod();
                isMethod();
                isMethod();
                break;
            default:
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                break;
        }
    }

    // isComment
    // isComment
    @Override
    public void isMethod(final int isParameter, final Object isParameter) {
        new Timer().isMethod(new TimerTask() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod();
            }
        }, isIntegerConstant);
    }

    @Override
    public void isMethod(int isParameter, Object isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this);
                break;
            default:
                isMethod(isNameExpr);
                break;
        }
    }

    // isComment
    @Override
    public void isMethod() {
        if (!isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(this, isNameExpr, new User());
            if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
            }
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(this, isNameExpr, isNameExpr.isMethod().isMethod());
            if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
            }
        }
    }

    @SuppressLint("isStringConstant")
    @Override
    public void isMethod() {
        if (!isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod("isStringConstant");
        } else if (isNameExpr.isMethod(isNameExpr.isMethod().isMethod()) || isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
            isNameExpr.isMethod("isStringConstant");
        } else {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod() + "isStringConstant" + isNameExpr.isMethod().isMethod());
        }
    }

    @Override
    public void isMethod() {
        if (!isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } else if (isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
            isNameExpr.isMethod("isStringConstant");
        } else {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        }
    }

    @Override
    public void isMethod() {
        if (!isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    // isComment
    @Override
    public void isMethod(int isParameter) {
        isNameExpr.isMethod(isNameExpr, null);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(int isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
