// isComment
package com.madgag.agit.matchers;

import org.eclipse.jgit.lib.AnyObjectId;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Repository;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface extends TypeSafeMatcher<Repository> {

    private final AnyObjectId isVariable;

    public isConstructor(AnyObjectId isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(Repository isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(Description isParameter) {
        isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr);
    }

    @Factory
    public static <T> Matcher<Repository> isMethod(String isParameter) {
        return new HasGitObjectMatcher(isNameExpr.isMethod(isNameExpr));
    }
}
