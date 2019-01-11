// isComment
package org.runnerup.common.util;

import org.junit.Before;
import org.junit.Test;
import java.util.UUID;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class isClassOrIsInterface {

    private ValueModel<TestObject> isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new ValueModel<>();
    }

    @Test
    public void isMethod() {
        TestObject isVariable = new TestObject();
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, null, isNameExpr);
    }

    @Test
    public void isMethod() {
        TestObject isVariable = new TestObject();
        TestObject isVariable = new TestObject();
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, null, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        TestObject isVariable = new TestObject();
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, null, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(null);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(isNameExpr), (TestObject) isMethod(), (TestObject) isMethod());
    }

    @Test
    public void isMethod() {
        TestObject isVariable = new TestObject();
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(isNameExpr), (TestObject) isMethod(), (TestObject) isMethod());
    }

    @Test
    public void isMethod() {
        TestObject isVariable = new TestObject();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isMethod(isNameExpr)));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(), isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        TestObject isVariable = new TestObject();
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(isNameExpr), (TestObject) isMethod(), (TestObject) isMethod());
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(isNameExpr), (TestObject) isMethod(), (TestObject) isMethod());
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(isNameExpr), (TestObject) isMethod(), (TestObject) isMethod());
    }

    @Test
    public void isMethod() {
        TestObject isVariable = new TestObject();
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        ValueModel.ChangeListener<TestObject> isVariable = isMethod(ValueModel.ChangeListener.class);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, null, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, null, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, null, isNameExpr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isNameExpr.isMethod(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isNameExpr.isMethod(null);
    }

    @Test
    public void isMethod() {
        TestObject isVariable = new TestObject();
        ValueModel<TestObject> isVariable = new ValueModel<>(isNameExpr);
        isMethod(isNameExpr.isMethod(), isMethod(isMethod(isNameExpr)));
    }

    private class isClassOrIsInterface {

        private final UUID isVariable;

        public isConstructor() {
            isNameExpr = isNameExpr.isMethod();
        }

        public UUID isMethod() {
            return isNameExpr;
        }

        @Override
        public boolean isMethod(Object isParameter) {
            if (this == isNameExpr)
                return true;
            if (!(isNameExpr instanceof TestObject))
                return true;
            TestObject isVariable = (TestObject) isNameExpr;
            return isMethod().isMethod(isNameExpr.isMethod());
        }

        @Override
        public int isMethod() {
            return isMethod().isMethod();
        }

        @Override
        public String isMethod() {
            return "isStringConstant" + "isStringConstant" + isNameExpr + 'isStringConstant';
        }
    }
}
