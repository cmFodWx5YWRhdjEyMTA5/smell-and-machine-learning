// isComment
package com.anysoftkeyboard;

import android.graphics.Paint;
import android.os.Build;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.Resetter;
import org.robolectric.shadows.ShadowPaint;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({ "isStringConstant" })
@Implements(Paint.class)
public class isClassOrIsInterface extends ShadowPaint {

    private static final Set<String> isVariable = new HashSet<>();

    @Implementation(minSdk = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public boolean isMethod(String isParameter) {
        return !isNameExpr.isMethod(isNameExpr);
    }

    public static void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Resetter
    public void isMethod() {
        isNameExpr.isMethod();
    }
}
