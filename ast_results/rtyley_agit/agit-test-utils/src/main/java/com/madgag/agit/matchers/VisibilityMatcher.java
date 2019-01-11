// isComment
package com.madgag.agit.matchers;

import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;
import android.view.View;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface extends TypeSafeMatcher<View> {

    private final int isVariable;

    public isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    protected boolean isMethod(View isParameter) {
        return isNameExpr.isMethod() == isNameExpr;
    }

    public void isMethod(Description isParameter) {
        String isVariable;
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = "isStringConstant";
                break;
            case isNameExpr:
                isNameExpr = "isStringConstant";
                break;
            case isNameExpr:
                isNameExpr = "isStringConstant";
                break;
            default:
                throw new RuntimeException("isStringConstant" + isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }

    public static Matcher<View> isMethod() {
        return new VisibilityMatcher(isNameExpr);
    }

    public static Matcher<View> isMethod() {
        return new VisibilityMatcher(isNameExpr);
    }
}
