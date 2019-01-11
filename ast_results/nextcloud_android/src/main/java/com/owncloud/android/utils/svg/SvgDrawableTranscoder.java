// isComment
package com.owncloud.android.utils.svg;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.caverock.androidsvg.SVG;

/**
 * isComment
 */
public class isClassOrIsInterface implements ResourceTranscoder<SVG, PictureDrawable> {

    @Override
    public Resource<PictureDrawable> isMethod(Resource<SVG> isParameter) {
        SVG isVariable = isNameExpr.isMethod();
        Picture isVariable = isNameExpr.isMethod();
        PictureDrawable isVariable = new PictureDrawable(isNameExpr);
        return new SimpleResource<PictureDrawable>(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
