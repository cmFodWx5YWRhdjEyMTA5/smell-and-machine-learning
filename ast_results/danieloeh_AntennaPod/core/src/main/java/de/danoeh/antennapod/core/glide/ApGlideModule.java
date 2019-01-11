// isComment
package de.danoeh.antennapod.core.glide;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.module.GlideModule;
import java.io.InputStream;
import de.danoeh.antennapod.core.preferences.UserPreferences;

/**
 * isComment
 */
public class isClassOrIsInterface implements GlideModule {

    @Override
    public void isMethod(Context isParameter, GlideBuilder isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new InternalCacheDiskCacheFactory(isNameExpr, isNameExpr.isMethod()));
    }

    @Override
    public void isMethod(Context isParameter, Glide isParameter) {
        isNameExpr.isMethod(String.class, InputStream.class, new ApOkHttpUrlLoader.Factory());
    }
}
