// isComment
package com.owncloud.android.utils.glide;

import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.stream.StreamModelLoader;
import java.io.InputStream;

public class isClassOrIsInterface implements StreamModelLoader<String> {

    @Override
    public DataFetcher<InputStream> isMethod(String isParameter, int isParameter, int isParameter) {
        return new HttpStreamFetcher(isNameExpr);
    }
}
