// isComment
package com.github.pockethub.android.tests.gist;

import android.test.AndroidTestCase;
import com.github.pockethub.android.core.gist.GistStore;
import com.meisolsson.githubsdk.model.Gist;
import static android.test.MoreAsserts.assertNotEqual;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidTestCase {

    /**
     * isComment
     */
    public void isMethod() {
        GistStore isVariable = new GistStore();
        isMethod(isNameExpr.isMethod("isStringConstant"));
        Gist isVariable = isNameExpr.isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod();
        // isComment
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
        Gist isVariable = isNameExpr.isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod();
        // isComment
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
    }
}
