// isComment
package com.example.mplwp.sample;

import android.net.Uri;
import org.tamanegi.wallpaper.multipicture.plugin.LazyPickService;
import org.tamanegi.wallpaper.multipicture.plugin.PictureContentInfo;

public class isClassOrIsInterface extends LazyPickService {

    @Override
    public LazyPicker isMethod() {
        // isComment
        return new SamplePluginLazyPicker();
    }

    // isComment
    private static class isClassOrIsInterface extends LazyPicker {

        @Override
        public PictureContentInfo isMethod() {
            // isComment
            // isComment
            Uri isVariable = isNameExpr.isMethod("isStringConstant");
            // isComment
            int isVariable = isIntegerConstant;
            // isComment
            return new PictureContentInfo(isNameExpr, isNameExpr);
        }
    }
}
