// isComment
package io.gresse.hugo.anecdote.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.bumptech.glide.load.resource.bitmap.GlideBitmapDrawable;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import java.io.File;
import io.gresse.hugo.anecdote.Configuration;
import io.gresse.hugo.anecdote.R;
import io.gresse.hugo.anecdote.util.ImageSaver;

public class isClassOrIsInterface extends android.support.v7.widget.AppCompatImageView {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, @Nullable AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, @Nullable AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Nullable
    public File isMethod() {
        Drawable isVariable = isMethod();
        Bitmap isVariable = null;
        if (isNameExpr instanceof BitmapDrawable) {
            isNameExpr = ((BitmapDrawable) isNameExpr).isMethod();
        } else if (isNameExpr instanceof GlideDrawable) {
            isNameExpr = ((GlideBitmapDrawable) isNameExpr.isMethod()).isMethod();
        }
        File isVariable = new ImageSaver(isMethod()).isMethod(true).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant").isMethod(isNameExpr);
        if (isNameExpr != null) {
            return isNameExpr;
        }
        return null;
    }
}
