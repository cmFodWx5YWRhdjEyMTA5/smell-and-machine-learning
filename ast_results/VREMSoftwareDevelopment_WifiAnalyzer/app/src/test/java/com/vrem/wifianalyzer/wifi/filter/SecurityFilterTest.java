// isComment
package com.vrem.wifianalyzer.wifi.filter;

import com.vrem.util.EnumUtils;
import com.vrem.wifianalyzer.wifi.model.Security;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.IterableUtils;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Set<Security> isVariable = isNameExpr.isMethod(Security.class);
        isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, new MappingClosure());
    }

    private static class isClassOrIsInterface implements Closure<Security> {

        @Override
        public void isMethod(Security isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
        }
    }
}
