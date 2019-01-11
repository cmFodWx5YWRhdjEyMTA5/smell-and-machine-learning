// isComment
package org.sufficientlysecure.materialchips.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public class isClassOrIsInterface {

    public static Activity isMethod(Context isParameter) {
        if (isNameExpr == null)
            return null;
        else if (isNameExpr instanceof Activity)
            return (Activity) isNameExpr;
        else if (isNameExpr instanceof ContextWrapper)
            return isMethod(((ContextWrapper) isNameExpr).isMethod());
        return null;
    }
}
