// isComment
package com.madgag.agit.operations;

import static com.madgag.agit.operations.JGitAPIExceptions.exceptionWithFriendlyMessageFor;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        RuntimeException isVariable = isMethod(new NullPointerException());
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }
}
