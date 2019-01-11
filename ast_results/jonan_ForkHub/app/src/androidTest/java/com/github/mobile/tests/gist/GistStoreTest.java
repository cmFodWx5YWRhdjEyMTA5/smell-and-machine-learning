// isComment
package com.github.mobile.tests.gist;

import android.test.AndroidTestCase;
import com.github.mobile.core.gist.GistStore;
import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.service.GistService;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidTestCase {

    /**
     * isComment
     */
    public void isMethod() {
        GistStore isVariable = new GistStore(new GistService());
        isMethod(isNameExpr.isMethod("isStringConstant"));
        Gist isVariable = new Gist();
        isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
        Gist isVariable = new Gist();
        isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
    }
}
