// isComment
package com.wangdaye.mysplash.common.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.basic.FooterAdapter;
import com.wangdaye.mysplash.common.basic.activity.LoadableActivity;
import com.wangdaye.mysplash.common.data.entity.unsplash.ChangeCollectionPhotoResult;
import com.wangdaye.mysplash.common.data.entity.unsplash.LikePhotoResult;
import com.wangdaye.mysplash.common.data.entity.unsplash.Photo;
import com.wangdaye.mysplash.common.data.service.network.PhotoService;
import com.wangdaye.mysplash.common.basic.activity.MysplashActivity;
import com.wangdaye.mysplash.common.ui.dialog.DownloadRepeatDialog;
import com.wangdaye.mysplash.common.ui.widget.CircleImageView;
import com.wangdaye.mysplash.common.ui.widget.CircularProgressIcon;
import com.wangdaye.mysplash.common.utils.DisplayUtils;
import com.wangdaye.mysplash.common.utils.FileUtils;
import com.wangdaye.mysplash.common.utils.helper.NotificationHelper;
import com.wangdaye.mysplash.common.utils.helper.DatabaseHelper;
import com.wangdaye.mysplash.common.utils.helper.ImageHelper;
import com.wangdaye.mysplash.common.utils.helper.IntentHelper;
import com.wangdaye.mysplash.common.utils.manager.AuthManager;
import com.wangdaye.mysplash.common.ui.dialog.DeleteCollectionPhotoDialog;
import com.wangdaye.mysplash.common.ui.dialog.SelectCollectionDialog;
import com.wangdaye.mysplash.common.ui.widget.freedomSizeView.FreedomImageView;
import com.wangdaye.mysplash.collection.view.activity.CollectionActivity;
import com.wangdaye.mysplash.user.view.activity.UserActivity;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;

public class isClassOrIsInterface extends FooterAdapter<RecyclerView.ViewHolder> implements DeleteCollectionPhotoDialog.OnDeleteCollectionListener, DownloadRepeatDialog.OnCheckOrDownloadListener {

    private Context isVariable;

    private RecyclerView isVariable;

    private SelectCollectionDialog.OnCollectionsChangedListener isVariable;

    private OnDownloadPhotoListener isVariable;

    private List<Photo> isVariable;

    private PhotoService isVariable;

    private int isVariable;

    // isComment
    private boolean isVariable = true;

    class isClassOrIsInterface extends RecyclerView.ViewHolder implements ImageHelper.OnLoadImageListener<Photo> {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        CardView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        FreedomImageView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        CircleImageView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        AppCompatImageButton isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        AppCompatImageButton isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        CircularProgressIcon isVariable;

        private Photo isVariable;

        isConstructor(View isParameter) {
            super(isNameExpr);
            isNameExpr.isMethod(this, isNameExpr);
        }

        void isMethod(final int isParameter) {
            this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
            ViewGroup.MarginLayoutParams isVariable = (ViewGroup.MarginLayoutParams) isNameExpr.isMethod();
            if (isNameExpr > isIntegerConstant) {
                int isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            } else {
                isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isIntegerConstant);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr, isMethod(), null);
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, this);
            if (isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            if (isNameExpr.isFieldAccessExpr.isMethod() != isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod();
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr));
            if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
            }
        }

        void isMethod() {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        }

        void isMethod(int isParameter) {
            this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod() != isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod();
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }

        // isComment
        @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        void isMethod() {
            if (isNameExpr instanceof MysplashActivity && isMethod() < isNameExpr.isMethod()) {
                ArrayList<Photo> isVariable = new ArrayList<>();
                int isVariable = isMethod() - isIntegerConstant;
                int isVariable = isIntegerConstant;
                if (isNameExpr < isIntegerConstant) {
                    isNameExpr = isIntegerConstant;
                }
                if (isNameExpr + isNameExpr - isIntegerConstant > isNameExpr.isMethod() - isIntegerConstant) {
                    isNameExpr = isNameExpr.isMethod() - isNameExpr;
                }
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr + isNameExpr));
                }
                isNameExpr.isMethod((MysplashActivity) isNameExpr, isNameExpr, isNameExpr, isNameExpr, isMethod(), isNameExpr, isNameExpr instanceof LoadableActivity ? ((LoadableActivity) isNameExpr).isMethod() : new Bundle());
            }
        }

        @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        void isMethod() {
            if (isNameExpr instanceof CollectionActivity) {
                DeleteCollectionPhotoDialog isVariable = new DeleteCollectionPhotoDialog();
                isNameExpr.isMethod(((CollectionActivity) isNameExpr).isMethod(), isNameExpr.isMethod(isMethod()), isMethod());
                isNameExpr.isMethod(isNameExpr.this);
                isNameExpr.isMethod(((CollectionActivity) isNameExpr).isMethod(), null);
            }
        }

        @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        void isMethod() {
            if (isNameExpr instanceof MysplashActivity) {
                isNameExpr.isMethod((MysplashActivity) isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            }
        }

        @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        void isMethod() {
            if (isNameExpr.isMethod().isMethod()) {
                if (isNameExpr.isMethod()) {
                    isNameExpr.isMethod();
                    isMethod(!isNameExpr.isMethod(isMethod()).isFieldAccessExpr, isMethod());
                }
            } else {
                isNameExpr.isMethod((MysplashActivity) isNameExpr);
            }
        }

        @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        void isMethod() {
            if (isNameExpr instanceof MysplashActivity) {
                if (!isNameExpr.isMethod().isMethod()) {
                    isNameExpr.isMethod((MysplashActivity) isNameExpr);
                } else {
                    SelectCollectionDialog isVariable = new SelectCollectionDialog();
                    isNameExpr.isMethod(isNameExpr.isMethod(isMethod()), isNameExpr);
                    isNameExpr.isMethod(((MysplashActivity) isNameExpr).isMethod(), null);
                }
            }
        }

        @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        void isMethod() {
            Photo isVariable = isNameExpr.isMethod(isMethod());
            if (isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr) > isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            } else if (isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr)) {
                MysplashActivity isVariable = isNameExpr.isMethod().isMethod();
                if (isNameExpr != null) {
                    DownloadRepeatDialog isVariable = new DownloadRepeatDialog();
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isNameExpr.this);
                    isNameExpr.isMethod(isNameExpr.isMethod(), null);
                }
            } else {
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }

        @Override
        public void isMethod(Photo isParameter, int isParameter) {
            if (isNameExpr.isMethod(isNameExpr)) {
                Photo isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(true);
        }

        @Override
        public void isMethod(Photo isParameter, int isParameter) {
        // isComment
        }
    }

    public isConstructor(Context isParameter, List<Photo> isParameter, SelectCollectionDialog.OnCollectionsChangedListener isParameter, OnDownloadPhotoListener isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, List<Photo> isParameter, int isParameter, SelectCollectionDialog.OnCollectionsChangedListener isParameter, OnDownloadPhotoListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder isMethod(@NonNull ViewGroup isParameter, int isParameter) {
        if (isMethod(isNameExpr)) {
            // isComment
            return isNameExpr.isMethod(isNameExpr);
        } else {
            View isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            return new ViewHolder(isNameExpr);
        }
    }

    @Override
    public void isMethod(@NonNull RecyclerView.ViewHolder isParameter, int isParameter) {
        if (isNameExpr instanceof ViewHolder && isNameExpr < isMethod()) {
            ((ViewHolder) isNameExpr).isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(@NonNull RecyclerView.ViewHolder isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr instanceof ViewHolder) {
            ((ViewHolder) isNameExpr).isMethod();
        }
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod(int isParameter) {
        return isNameExpr;
    }

    @Override
    protected boolean isMethod() {
        return !isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr.isMethod()) != isIntegerConstant;
    }

    public void isMethod(MysplashActivity isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(RecyclerView isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(Photo isParameter) {
        if (isNameExpr.isFieldAccessExpr != isIntegerConstant && isNameExpr.isFieldAccessExpr != isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod() - isIntegerConstant);
        }
    }

    public void isMethod(Photo isParameter) {
        if (isNameExpr.isFieldAccessExpr != isIntegerConstant && isNameExpr.isFieldAccessExpr != isIntegerConstant) {
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isMethod(isIntegerConstant);
        }
    }

    public void isMethod(Photo isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isMethod(isNameExpr);
                isMethod(isNameExpr);
                return;
            }
        }
    }

    public void isMethod() {
        isNameExpr.isMethod();
        isMethod();
    }

    private void isMethod(boolean isParameter, int isParameter) {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
        }
        isNameExpr.isMethod(isNameExpr).isFieldAccessExpr = true;
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr, isNameExpr, new OnSetLikeListener(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr, isNameExpr));
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(RecyclerView isParameter, Photo isParameter, boolean isParameter, boolean isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr).isFieldAccessExpr;
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr).isFieldAccessExpr;
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr).isFieldAccessExpr;
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                if (isNameExpr) {
                    isMethod(isNameExpr, isNameExpr);
                }
                if (!isNameExpr) {
                    return;
                }
            }
        }
    }

    private void isMethod(@Nullable RecyclerView isParameter, int isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr);
        } else if (isNameExpr.isMethod() instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager isVariable = (StaggeredGridLayoutManager) isNameExpr.isMethod();
            int[] isVariable = isNameExpr.isMethod(null);
            int[] isVariable = isNameExpr.isMethod(null);
            if (isNameExpr[isIntegerConstant] <= isNameExpr && isNameExpr <= isNameExpr[isNameExpr.isFieldAccessExpr - isIntegerConstant]) {
                // isComment
                ((ViewHolder) isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
            } else {
                isMethod(isNameExpr);
            }
        } else if (isNameExpr.isMethod() instanceof LinearLayoutManager) {
            int isVariable = ((LinearLayoutManager) isNameExpr.isMethod()).isMethod();
            int isVariable = ((LinearLayoutManager) isNameExpr.isMethod()).isMethod();
            if (isNameExpr <= isNameExpr && isNameExpr <= isNameExpr) {
                // isComment
                ((ViewHolder) isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
            } else {
                isMethod(isNameExpr);
            }
        }
    }

    public void isMethod(List<Photo> isParameter) {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod();
    }

    public List<Photo> isMethod() {
        return new ArrayList<>(isNameExpr);
    }

    private void isMethod(int isParameter) {
        if (isNameExpr instanceof LoadableActivity) {
            isNameExpr.isMethod().isMethod((LoadableActivity<Photo>) isNameExpr, isNameExpr.isMethod(isNameExpr));
        }
    }

    public interface isClassOrIsInterface {

        void isMethod(Photo isParameter);
    }

    public void isMethod(OnDownloadPhotoListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    private class isClassOrIsInterface implements PhotoService.OnSetLikeListener {

        private String isVariable;

        private int isVariable;

        isConstructor(String isParameter, int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        // isComment
        @Override
        public void isMethod(Call<LikePhotoResult> isParameter, Response<LikePhotoResult> isParameter) {
            if (isNameExpr.isMethod() > isNameExpr && isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr).isFieldAccessExpr = true;
                if (isNameExpr.isMethod() && isNameExpr.isMethod() != null) {
                    isNameExpr.isMethod(isNameExpr).isFieldAccessExpr = isNameExpr.isMethod().isFieldAccessExpr.isFieldAccessExpr;
                    isNameExpr.isMethod(isNameExpr).isFieldAccessExpr = isNameExpr.isMethod().isFieldAccessExpr.isFieldAccessExpr;
                }
                isMethod(isNameExpr, isNameExpr);
                isMethod(isNameExpr);
            }
        }

        @Override
        public void isMethod(Call<LikePhotoResult> isParameter, Throwable isParameter) {
            if (isNameExpr.isMethod() > isNameExpr && isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr).isFieldAccessExpr = true;
                isMethod(isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) : isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            }
        }
    }

    // isComment
    @Override
    public void isMethod(ChangeCollectionPhotoResult isParameter, int isParameter) {
        if (isNameExpr.isMethod() > isNameExpr && isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)) {
            isNameExpr.isMethod(isNameExpr);
            isMethod(isNameExpr);
        }
    }

    // isComment
    @Override
    public void isMethod(Object isParameter) {
        isNameExpr.isMethod(isNameExpr, ((Photo) isNameExpr).isFieldAccessExpr);
    }

    @Override
    public void isMethod(Object isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod((Photo) isNameExpr);
        }
    }
}
