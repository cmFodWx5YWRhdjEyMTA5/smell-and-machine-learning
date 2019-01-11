// isComment
package com.vrem.wifianalyzer.wifi.filter.adapter;

import com.vrem.util.EnumUtils;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.model.Security;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.IterableUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Mock
    private Settings isVariable;

    private SecurityAdapter isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new SecurityAdapter(isNameExpr.isMethod(Security.class));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod(Security.class), new ContainsClosure());
    }

    @Test
    public void isMethod() {
        // isComment
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        Set<Security> isVariable = isNameExpr.isMethod(Security.class);
        // isComment
        isNameExpr.isMethod(isNameExpr, new ToggleClosure());
        // isComment
        isNameExpr.isMethod(isNameExpr, new RemovedClosure());
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod() - isIntegerConstant)));
    }

    @Test
    public void isMethod() {
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        Set<Security> isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    private class isClassOrIsInterface implements Closure<Security> {

        @Override
        public void isMethod(Security isParameter) {
            isMethod(isNameExpr.isMethod(isNameExpr));
        }
    }

    private class isClassOrIsInterface implements Closure<Security> {

        @Override
        public void isMethod(Security isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private class isClassOrIsInterface implements Closure<Security> {

        @Override
        public void isMethod(Security isParameter) {
            isMethod(isNameExpr.isMethod(isNameExpr));
        }
    }
}
