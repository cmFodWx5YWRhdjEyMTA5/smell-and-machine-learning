// isComment
package org.andstatus.app.data;

import android.content.ContentResolver;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.util.UriUtils;
import org.junit.Test;
import cz.msebera.android.httpclient.entity.ContentType;
import static org.andstatus.app.context.DemoData.demoData;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        ContentType isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        final ContentResolver isVariable = isNameExpr.isMethod().isMethod().isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(null, isNameExpr.isMethod("isStringConstant")));
    }
}
