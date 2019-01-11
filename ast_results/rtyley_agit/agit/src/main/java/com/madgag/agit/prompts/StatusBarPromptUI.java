// isComment
package com.madgag.agit.prompts;

import com.google.inject.Inject;
import com.madgag.agit.guice.RepositoryScoped;
import com.madgag.agit.operation.lifecycle.RepoNotifications;
import com.madgag.android.blockingprompt.PromptUI;
import com.madgag.android.blockingprompt.ResponseInterface;

@RepositoryScoped
public class isClassOrIsInterface implements PromptUI {

    @Inject
    RepoNotifications isVariable;

    public void isMethod(ResponseInterface isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
    }

    public void isMethod() {
        isNameExpr.isMethod();
    }
}
