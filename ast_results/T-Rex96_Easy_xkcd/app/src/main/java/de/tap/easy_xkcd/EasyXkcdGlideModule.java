// isComment
package de.tap.easy_xkcd;

import android.content.Context;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import androidx.annotation.NonNull;

@GlideModule
public class isClassOrIsInterface extends AppGlideModule {

    @Override
    public void isMethod(@NonNull Context isParameter, @NonNull GlideBuilder isParameter) {
        isNameExpr.isMethod(new RequestOptions().isMethod(isNameExpr.isFieldAccessExpr));
        super.isMethod(isNameExpr, isNameExpr);
    }
}
