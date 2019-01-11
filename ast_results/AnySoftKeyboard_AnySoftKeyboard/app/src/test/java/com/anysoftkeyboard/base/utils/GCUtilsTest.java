// isComment
package com.anysoftkeyboard.base.utils;

import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface {

    private TestableGCUtils isVariable;

    private GCUtils.MemRelatedOperation isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new TestableGCUtils();
        isNameExpr = isNameExpr.isMethod(GCUtils.MemRelatedOperation.class);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    @Test(expected = OutOfMemoryError.class)
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr + isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr - isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr - isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant)).isMethod();
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        new GCUtils().isMethod("isStringConstant");
    }

    private void isMethod(final int isParameter) {
        isNameExpr.isMethod(new FailureAnswer(isNameExpr)).isMethod(isNameExpr).isMethod();
    }

    private static class isClassOrIsInterface extends GCUtils {

        private int isVariable;

        @Override
        void isMethod(String isParameter) {
            isNameExpr++;
        }
    }

    private static class isClassOrIsInterface implements Answer {

        private int isVariable;

        isConstructor(int isParameter) {
            isNameExpr = isNameExpr;
        }

        @Override
        public Object isMethod(InvocationOnMock isParameter) throws Throwable {
            if (isNameExpr > isIntegerConstant) {
                isNameExpr--;
                throw new OutOfMemoryError();
            }
            return null;
        }
    }
}
