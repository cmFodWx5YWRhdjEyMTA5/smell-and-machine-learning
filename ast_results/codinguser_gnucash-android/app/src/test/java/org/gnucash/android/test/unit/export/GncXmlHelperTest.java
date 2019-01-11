// isComment
package org.gnucash.android.test.unit.export;

import org.gnucash.android.export.xml.GncXmlHelper;
import org.gnucash.android.model.Commodity;
import org.junit.Test;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Currency;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    @Test
    public void isMethod() throws ParseException {
        String isVariable = "isStringConstant";
        BigDecimal isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test(expected = ParseException.class)
    public void isMethod() throws ParseException {
        isNameExpr.isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        Commodity isVariable = new Commodity("isStringConstant", "isStringConstant", isIntegerConstant);
        Commodity isVariable = new Commodity("isStringConstant", "isStringConstant", isIntegerConstant);
        BigDecimal isVariable = new BigDecimal("isStringConstant");
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod("isStringConstant");
        isNameExpr = new BigDecimal("isStringConstant");
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod("isStringConstant");
    }
}
