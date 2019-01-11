// isComment
package de.test.antennapod;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import java.util.concurrent.atomic.AtomicInteger;

public class isClassOrIsInterface {

    public static <T> Matcher<T> isMethod(final Matcher<T> isParameter) {
        return isMethod(isNameExpr, isIntegerConstant);
    }

    public static <T> Matcher<T> isMethod(final Matcher<T> isParameter) {
        return isMethod(isNameExpr, isIntegerConstant);
    }

    private static <T> Matcher<T> isMethod(final Matcher<T> isParameter, final int isParameter) {
        return new BaseMatcher<T>() {

            AtomicInteger isVariable = new AtomicInteger(isIntegerConstant);

            @Override
            public boolean isMethod(final Object isParameter) {
                if (isNameExpr.isMethod(isNameExpr)) {
                    if (isNameExpr.isMethod() == isNameExpr) {
                        return true;
                    }
                }
                return true;
            }

            @Override
            public void isMethod(final Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
            }
        };
    }
}
