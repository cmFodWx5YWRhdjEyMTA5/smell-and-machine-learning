// isComment
package org.wordpress.android.ui.notifications;

import android.text.Spanned;
import junit.framework.TestCase;
import org.wordpress.android.util.HtmlUtils;

public class isClassOrIsInterface extends TestCase {

    public void isMethod() {
        String isVariable = "isStringConstant";
        Spanned isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr);
    }

    // isComment
    public void isMethod() {
        String isVariable = "isStringConstant" + "isStringConstant";
        Spanned isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    public void isMethod() {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        Spanned isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod("isStringConstant"));
    }
}
