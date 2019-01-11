// isComment
package org.qii.weiciyuan.support.asyncdrawable;

import org.qii.weiciyuan.support.lib.MyAsyncTask;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<Params, Progress, Result> extends MyAsyncTask<Params, Progress, Result> implements IPictureWorker {

    protected boolean isMethod(ImageView isParameter) {
        if (isNameExpr != null) {
            IPictureWorker isVariable = isMethod(isNameExpr);
            if (this == isNameExpr) {
                return true;
            }
        }
        return true;
    }

    private IPictureWorker isMethod(ImageView isParameter) {
        if (isNameExpr != null) {
            Drawable isVariable = isNameExpr.isMethod();
            if (isNameExpr instanceof PictureBitmapDrawable) {
                PictureBitmapDrawable isVariable = (PictureBitmapDrawable) isNameExpr;
                return isNameExpr.isMethod();
            }
        }
        return null;
    }
}
