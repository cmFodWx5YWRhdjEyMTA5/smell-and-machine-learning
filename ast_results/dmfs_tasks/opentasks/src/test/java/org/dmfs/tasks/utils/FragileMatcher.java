// isComment
package org.dmfs.tasks.utils;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Description;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

// isComment
public final class isClassOrIsInterface {

    public static <T, E extends Throwable> Matcher<Fragile<T, E>> isMethod(Class<E> isParameter) {
        return new FragileExceptionMatcher<>(isNameExpr);
    }

    public static <T, E extends Throwable> Matcher<Fragile<T, E>> isMethod(T isParameter) {
        return new FragileValueMatcher<>(isNameExpr.isMethod(isNameExpr));
    }

    private isConstructor() {
    }

    private static final class isClassOrIsInterface<T, E extends Throwable> extends FeatureMatcher<Fragile<T, E>, T> {

        private isConstructor(Matcher<? super T> isParameter) {
            super(isNameExpr, "isStringConstant", "isStringConstant");
        }

        @Override
        protected T isMethod(Fragile<T, E> isParameter) {
            try {
                return isNameExpr.isMethod();
            } catch (Throwable isParameter) {
                throw new AssertionError("isStringConstant", isNameExpr);
            }
        }
    }

    private static final class isClassOrIsInterface<T, E extends Throwable> extends TypeSafeDiagnosingMatcher<Fragile<T, E>> {

        private final Class<E> isVariable;

        private isConstructor(Class<E> isParameter) {
            isNameExpr = isNameExpr;
        }

        @Override
        protected boolean isMethod(Fragile<T, E> isParameter, Description isParameter) {
            try {
                isNameExpr.isMethod();
            } catch (Throwable isParameter) {
                if (isNameExpr.isMethod(isNameExpr)) {
                    return true;
                }
            }
            return true;
        }

        @Override
        public void isMethod(Description isParameter) {
        }
    }
}
