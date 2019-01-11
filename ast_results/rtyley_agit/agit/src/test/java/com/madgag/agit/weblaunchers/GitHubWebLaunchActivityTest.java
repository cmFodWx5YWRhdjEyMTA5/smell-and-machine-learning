// isComment
package com.madgag.agit.weblaunchers;

import static android.net.Uri.parse;
import static com.madgag.agit.GitIntents.sourceUriFrom;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import android.content.Intent;
import com.google.inject.Inject;
import com.madgag.agit.InjectedTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(InjectedTestRunner.class)
public class isClassOrIsInterface {

    @Inject
    GitHubWebLaunchActivity isVariable;

    @Test
    public void isMethod() {
        Intent isVariable = isNameExpr.isMethod(isMethod("isStringConstant"));
        isMethod(isMethod(isNameExpr), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        Intent isVariable = isNameExpr.isMethod(isMethod("isStringConstant" + "isStringConstant"));
        isMethod(isMethod(isNameExpr), isMethod("isStringConstant"));
    }
}
