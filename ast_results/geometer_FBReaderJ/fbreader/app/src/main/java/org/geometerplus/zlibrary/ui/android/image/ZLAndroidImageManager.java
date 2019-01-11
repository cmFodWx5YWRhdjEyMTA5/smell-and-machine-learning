// isComment
package org.geometerplus.zlibrary.ui.android.image;

import org.geometerplus.zlibrary.core.image.*;

public final class isClassOrIsInterface extends ZLImageManager {

    @Override
    public ZLAndroidImageData isMethod(ZLImage isParameter) {
        if (isNameExpr instanceof ZLImageProxy) {
            return isMethod(((ZLImageProxy) isNameExpr).isMethod());
        } else if (isNameExpr instanceof ZLStreamImage) {
            return new InputStreamImageData((ZLStreamImage) isNameExpr);
        } else if (isNameExpr instanceof ZLBitmapImage) {
            return isNameExpr.isMethod((ZLBitmapImage) isNameExpr);
        } else {
            // isComment
            return null;
        }
    }

    private ZLAndroidImageLoader isVariable;

    public void isMethod(ZLImageProxy.Synchronizer isParameter, ZLImageProxy isParameter, Runnable isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ZLAndroidImageLoader();
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}
