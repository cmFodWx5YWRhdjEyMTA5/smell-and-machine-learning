// isComment
package org.geometerplus.android.fbreader;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.github.johnpersano.supertoasts.SuperActivityToast;
import com.github.johnpersano.supertoasts.SuperToast;
import com.github.johnpersano.supertoasts.util.OnClickWrapper;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.fbreader.book.Bookmark;
import org.geometerplus.fbreader.fbreader.FBReaderApp;
import org.geometerplus.android.fbreader.api.FBReaderIntents;
import org.geometerplus.android.fbreader.bookmark.EditBookmarkActivity;
import org.geometerplus.android.util.OrientationUtil;

public class isClassOrIsInterface extends FBAndroidAction {

    isConstructor(FBReader isParameter, FBReaderApp isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Object... isParameter) {
        final Bookmark isVariable;
        if (isNameExpr.isFieldAccessExpr != isIntegerConstant) {
            isNameExpr = (Bookmark) isNameExpr[isIntegerConstant];
        } else {
            isNameExpr = isNameExpr.isMethod();
        }
        if (isNameExpr == null) {
            return;
        }
        final SuperActivityToast isVariable = new SuperActivityToast(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isNameExpr.isMethod(new OnClickWrapper("isStringConstant", new SuperToast.OnClickListener() {

            @Override
            public void isMethod(View isParameter, Parcelable isParameter) {
                final Intent isVariable = new Intent(isNameExpr.isMethod(), EditBookmarkActivity.class);
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }));
        isNameExpr.isMethod(isNameExpr);
    }
}
