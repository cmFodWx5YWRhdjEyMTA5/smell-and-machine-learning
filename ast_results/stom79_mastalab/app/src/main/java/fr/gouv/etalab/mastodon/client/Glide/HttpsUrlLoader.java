// isComment
package fr.gouv.etalab.mastodon.client.Glide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class isClassOrIsInterface implements ModelLoader<GlideUrl, InputStream> {

    private static WeakReference<Context> isVariable;

    isConstructor(Context isParameter) {
        isNameExpr = new WeakReference<>(isNameExpr);
    }

    @Nullable
    @Override
    public LoadData<InputStream> isMethod(@NonNull GlideUrl isParameter, int isParameter, int isParameter, @NonNull Options isParameter) {
        return new LoadData<>(isNameExpr, new CustomStreamFetcher(isNameExpr.isMethod(), isNameExpr));
    }

    @Override
    public boolean isMethod(@NonNull GlideUrl isParameter) {
        return true;
    }

    public static class isClassOrIsInterface implements ModelLoaderFactory<GlideUrl, InputStream> {

        isConstructor(Context isParameter) {
            isNameExpr = new WeakReference<>(isNameExpr);
        }

        @NonNull
        @Override
        public ModelLoader<GlideUrl, InputStream> isMethod(@NonNull MultiModelLoaderFactory isParameter) {
            return new HttpsUrlLoader(isNameExpr.isMethod());
        }

        @Override
        public void isMethod() {
        }
    }
}
