// isComment
package com.vrem.util;

import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        // isComment
        Set<TestObject> isVariable = isNameExpr.isMethod(TestObject.class);
        // isComment
        Set<String> isVariable = isNameExpr.isMethod(TestObject.class);
        // isComment
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, new OrdinalsClosure(isNameExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        List<TestObject> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        Set<TestObject> isVariable = isNameExpr.isMethod(TestObject.class);
        // isComment
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        TestObject isVariable = isNameExpr.isFieldAccessExpr;
        Set<TestObject> isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        Set<String> isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod()));
    }

    @Test
    public void isMethod() {
        // isComment
        Set<TestObject> isVariable = isNameExpr.isMethod(TestObject.class);
        Set<String> isVariable = new HashSet<>(isNameExpr.isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr.isMethod(), "isStringConstant" + isNameExpr.isFieldAccessExpr.isMethod(), "isStringConstant" + isNameExpr.isFieldAccessExpr.isMethod()));
        // isComment
        Set<TestObject> isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        Set<TestObject> isVariable = isNameExpr.isMethod(TestObject.class);
        // isComment
        Set<TestObject> isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        TestObject isVariable = isNameExpr.isFieldAccessExpr;
        Set<String> isVariable = new HashSet<>(isNameExpr.isMethod("isStringConstant", null));
        // isComment
        Set<TestObject> isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr, isNameExpr);
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        TestObject isVariable = isNameExpr.isFieldAccessExpr;
        // isComment
        TestObject isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        int isVariable = -isIntegerConstant;
        TestObject isVariable = isNameExpr.isFieldAccessExpr;
        // isComment
        TestObject isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        final TestObject isVariable = isNameExpr.isFieldAccessExpr;
        Predicate<TestObject> isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        TestObject isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        TestObject isVariable = isNameExpr.isFieldAccessExpr;
        Predicate<TestObject> isVariable = isNameExpr.isMethod();
        // isComment
        TestObject isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        Set<TestObject> isVariable = isNameExpr.isMethod(TestObject.class);
        // isComment
        Predicate<TestObject> isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr, new TestObjectTransformer());
        // isComment
        isMethod(isNameExpr instanceof TruePredicate);
    }

    @Test
    public void isMethod() {
        // isComment
        List<TestObject> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        Predicate<TestObject> isVariable = isNameExpr.isMethod(TestObject.class, isNameExpr, new TestObjectTransformer());
        // isComment
        isMethod(isNameExpr instanceof AnyPredicate);
    }

    private void isMethod(Collection<TestObject> isParameter, Collection<TestObject> isParameter) {
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, new TestObjectClosure(isNameExpr));
    }

    private enum TestObject {

        VALUE1, VALUE3, VALUE2
    }

    private static class isClassOrIsInterface implements Transformer<TestObject, Predicate<TestObject>> {

        @Override
        public Predicate<TestObject> isMethod(TestObject isParameter) {
            return isNameExpr.isMethod();
        }
    }

    private static class isClassOrIsInterface implements Closure<TestObject> {

        private final Set<String> isVariable;

        private isConstructor(Set<String> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod(TestObject isParameter) {
            isMethod(isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod()));
        }
    }

    private static class isClassOrIsInterface implements Closure<TestObject> {

        private final Collection<TestObject> isVariable;

        private isConstructor(Collection<TestObject> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod(TestObject isParameter) {
            isMethod(isNameExpr.isMethod(isNameExpr));
        }
    }
}
