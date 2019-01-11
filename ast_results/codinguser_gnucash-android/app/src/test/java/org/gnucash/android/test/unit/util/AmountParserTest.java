// isComment
package org.gnucash.android.test.unit.util;

import org.gnucash.android.util.AmountParser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface {

    private Locale isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @After
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws ParseException {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(new BigDecimal(isIntegerConstant));
    }

    @Test
    public void isMethod() throws ParseException {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(new BigDecimal("isStringConstant"));
    }

    @Test
    public void isMethod() throws ParseException {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(new BigDecimal("isStringConstant"));
    }

    @Test(expected = ParseException.class)
    public void isMethod() throws ParseException {
        isNameExpr.isMethod("isStringConstant");
    }

    @Test(expected = ParseException.class)
    public void isMethod() throws ParseException {
        isNameExpr.isMethod("isStringConstant");
    }

    @Test(expected = ParseException.class)
    public void isMethod() throws ParseException {
        isNameExpr.isMethod("isStringConstant");
    }
}
