// isComment
package com.madgag.agit.weblaunchers;

import static com.madgag.agit.GitIntents.sourceUriFrom;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import android.net.Uri;
import com.google.inject.Inject;
import com.madgag.agit.InjectedTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(InjectedTestRunner.class)
public class isClassOrIsInterface {

    @Inject
    GoogleCodeWebLaunchActivity isVariable;

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        isMethod(isMethod(isNameExpr), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        String isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr, isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        String isVariable = isMethod("isStringConstant" + "isStringConstant");
        isMethod(isNameExpr, isMethod("isStringConstant"));
    }

    private String isMethod(String isParameter) {
        return isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }
}
