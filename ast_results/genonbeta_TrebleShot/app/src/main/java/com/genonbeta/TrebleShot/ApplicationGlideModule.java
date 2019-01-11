// isComment
package com.genonbeta.TrebleShot;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * isComment
 */
@GlideModule
public final class isClassOrIsInterface extends AppGlideModule {

    @Override
    public void isMethod(@NonNull Context isParameter, @NonNull Glide isParameter, @NonNull Registry isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(ApplicationInfo.class, ApplicationInfo.class, new ModelLoaderFactory<ApplicationInfo, ApplicationInfo>() {

            @Override
            public ModelLoader<ApplicationInfo, ApplicationInfo> isMethod(MultiModelLoaderFactory isParameter) {
                return new ApplicationIconModelLoader();
            }

            @Override
            public void isMethod() {
            }
        }).isMethod(ApplicationInfo.class, Drawable.class, new ApplicationIconDecoder(isNameExpr));
    }

    private class isClassOrIsInterface implements ModelLoader<ApplicationInfo, ApplicationInfo> {

        @Nullable
        @Override
        public LoadData<ApplicationInfo> isMethod(final ApplicationInfo isParameter, int isParameter, int isParameter, Options isParameter) {
            return new LoadData<>(new ObjectKey(isNameExpr), new DataFetcher<ApplicationInfo>() {

                @Override
                public void isMethod(Priority isParameter, DataCallback<? super ApplicationInfo> isParameter) {
                    isNameExpr.isMethod(isNameExpr);
                }

                @Override
                public void isMethod() {
                }

                @Override
                public void isMethod() {
                }

                @Override
                public Class<ApplicationInfo> isMethod() {
                    return ApplicationInfo.class;
                }

                @Override
                public DataSource isMethod() {
                    return isNameExpr.isFieldAccessExpr;
                }
            });
        }

        @Override
        public boolean isMethod(ApplicationInfo isParameter) {
            return true;
        }
    }

    private class isClassOrIsInterface implements ResourceDecoder<ApplicationInfo, Drawable> {

        private final Context isVariable;

        public isConstructor(Context isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Nullable
        @Override
        public Resource<Drawable> isMethod(ApplicationInfo isParameter, int isParameter, int isParameter, Options isParameter) throws IOException {
            Drawable isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            return new DrawableResource<Drawable>(isNameExpr) {

                @Override
                public Class<Drawable> isMethod() {
                    return Drawable.class;
                }

                @Override
                public int isMethod() {
                    if (isNameExpr instanceof BitmapDrawable)
                        return isNameExpr.isMethod(((BitmapDrawable) isNameExpr).isMethod());
                    return isIntegerConstant;
                }

                @Override
                public void isMethod() {
                }
            };
        }

        @Override
        public boolean isMethod(ApplicationInfo isParameter, Options isParameter) throws IOException {
            return true;
        }
    }
}
