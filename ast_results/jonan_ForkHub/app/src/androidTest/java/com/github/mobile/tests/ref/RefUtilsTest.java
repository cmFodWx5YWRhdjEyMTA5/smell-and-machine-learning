// isComment
package com.github.mobile.tests.ref;

import android.test.AndroidTestCase;
import com.github.mobile.core.ref.RefUtils;
import org.eclipse.egit.github.core.Reference;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidTestCase {

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isMethod((Reference) null));
        isMethod(isNameExpr.isMethod(new Reference()));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
    }

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isMethod((Reference) null));
        isMethod(isNameExpr.isMethod(new Reference()));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
    }

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isMethod(null));
        isMethod(isNameExpr.isMethod(new Reference()));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
    }

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isMethod((Reference) null));
        isMethod(isNameExpr.isMethod(new Reference()));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
    }

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isMethod(null));
        isMethod(isNameExpr.isMethod(new Reference()));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new Reference().isMethod("isStringConstant")));
    }
}
