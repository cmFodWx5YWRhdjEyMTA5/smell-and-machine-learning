// isComment
package com.madgag.agit.matchers;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface extends TypeSafeMatcher<CharSequence> {

    private final Matcher<String> isVariable;

    public isConstructor(Matcher<String> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(CharSequence isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    public void isMethod(Description isParameter) {
        isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr);
    }

    @Factory
    public static <T> Matcher<CharSequence> isMethod(Matcher<String> isParameter) {
        return new CharSequenceMatcher(isNameExpr);
    }
}
