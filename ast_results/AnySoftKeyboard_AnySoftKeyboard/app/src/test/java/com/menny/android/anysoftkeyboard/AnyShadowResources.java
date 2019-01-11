// isComment
package com.menny.android.anysoftkeyboard;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import org.mockito.Mockito;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowResources;

@Implements(value = Resources.class)
public class isClassOrIsInterface extends ShadowResources {

    @Implementation
    @Override
    public Drawable isMethod(TypedValue isParameter, int isParameter, Resources.Theme isParameter) throws Resources.NotFoundException {
        if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            return isNameExpr.isMethod(Drawable.class);
        } else {
            return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }
}
