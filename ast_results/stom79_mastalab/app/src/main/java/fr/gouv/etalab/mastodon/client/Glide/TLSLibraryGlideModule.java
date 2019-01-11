// isComment
package fr.gouv.etalab.mastodon.client.Glide;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.annotation.GlideModule;
import java.io.InputStream;

@GlideModule
public final class isClassOrIsInterface extends AppGlideModule {

    @Override
    public void isMethod(@NonNull Context isParameter, @NonNull Glide isParameter, @NonNull Registry isParameter) {
        isNameExpr.isMethod(GlideUrl.class, InputStream.class, new HttpsUrlLoader.Factory(isNameExpr));
    }

    @Override
    public void isMethod(Context isParameter, GlideBuilder isParameter) {
    }
}
