// isComment
package cgeo.geocaching.location;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static cgeo.geocaching.location.UTMPoint.latLong2UTM;
import static java.lang.String.valueOf;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

/**
 * isComment
 */
@RunWith(Parameterized.class)
public class isClassOrIsInterface {

    private final double isVariable;

    private final double isVariable;

    private final int isVariable;

    private final String isVariable;

    private final double isVariable;

    private final double isVariable;

    @Parameterized.Parameters
    public static Collection<Object[]> isMethod() {
        return isNameExpr.isMethod(new Object[][] { // isComment
        { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, // isComment
        { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, // isComment
        { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isDoubleConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, { -isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, // isComment
        { isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isDoubleConstant, isIntegerConstant }, // isComment
        { -isDoubleConstant, -isDoubleConstant, isIntegerConstant, "isStringConstant", isIntegerConstant, isIntegerConstant }, // isComment
        { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isIntegerConstant, isIntegerConstant }, // isComment
        { isDoubleConstant, isDoubleConstant, isIntegerConstant, "isStringConstant", isIntegerConstant, isIntegerConstant } });
    }

    public isConstructor(final double isParameter, final double isParameter, final int isParameter, final String isParameter, final double isParameter, final double isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Test
    public void isMethod() throws Exception {
        final UTMPoint isVariable = isMethod(new Geopoint(this.isFieldAccessExpr, this.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod()).isMethod(this.isFieldAccessExpr, isMethod(isDoubleConstant));
        isMethod(isNameExpr.isMethod()).isMethod(this.isFieldAccessExpr, isMethod(isDoubleConstant));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        if ("isStringConstant".isMethod(this.isFieldAccessExpr)) {
            // isComment
            isMethod(isMethod(isNameExpr.isMethod())).isMethod(isNameExpr, "isStringConstant");
        } else {
            isMethod(isMethod(isNameExpr.isMethod())).isMethod(isNameExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        final Geopoint isVariable = new UTMPoint(this.isFieldAccessExpr, this.isFieldAccessExpr.isMethod(isIntegerConstant), this.isFieldAccessExpr, this.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(this.isFieldAccessExpr, isMethod(isDoubleConstant));
        isMethod(isNameExpr.isMethod()).isMethod(this.isFieldAccessExpr, isMethod(isDoubleConstant));
    }
}
