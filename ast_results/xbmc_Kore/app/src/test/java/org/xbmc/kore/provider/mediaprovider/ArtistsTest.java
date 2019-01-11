// isComment
package org.xbmc.kore.provider.mediaprovider;

import android.database.Cursor;
import android.net.Uri;
import org.junit.Test;
import org.xbmc.kore.provider.MediaContract;
import org.xbmc.kore.testutils.TestUtils;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface extends AbstractTestClass {

    @Test
    public void isMethod() {
        Uri isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        Cursor isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isIntegerConstant, isIntegerConstant);
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isIntegerConstant, isIntegerConstant);
    }

    @Test
    public void isMethod() {
        Uri isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Cursor isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }
}
