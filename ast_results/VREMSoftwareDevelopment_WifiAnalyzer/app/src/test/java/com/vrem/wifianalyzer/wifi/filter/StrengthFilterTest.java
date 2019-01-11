// isComment
package com.vrem.wifianalyzer.wifi.filter;

import com.vrem.util.EnumUtils;
import com.vrem.wifianalyzer.wifi.model.Strength;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.IterableUtils;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Set<Strength> isVariable = isNameExpr.isMethod(Strength.class);
        isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, new MappingClosure());
    }

    private static class isClassOrIsInterface implements Closure<Strength> {

        @Override
        public void isMethod(Strength isParameter) {
            isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
        }
    }
}
