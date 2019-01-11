// isComment
package com.madgag.agit.matchers;

import android.widget.Checkable;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface extends TypeSafeMatcher<Checkable> {

    private final boolean isVariable;

    public isConstructor(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    protected boolean isMethod(Checkable isParameter) {
        return isNameExpr.isMethod() == isNameExpr;
    }

    public void isMethod(Description isParameter) {
        isNameExpr.isMethod(isNameExpr ? "isStringConstant" : "isStringConstant");
    }

    public static Matcher<Checkable> isMethod() {
        return new IsCheckedMatcher(true);
    }

    public static Matcher<Checkable> isMethod() {
        return new IsCheckedMatcher(true);
    }
}
