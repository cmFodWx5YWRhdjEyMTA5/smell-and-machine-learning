// isComment
package au.id.micolous.metrodroid.transit.erg.record;

import au.id.micolous.metrodroid.transit.erg.ErgTransitData;
import au.id.micolous.metrodroid.util.Utils;
import java.util.Arrays;
import java.util.Locale;

/**
 * isComment
 */
public class isClassOrIsInterface extends ErgRecord {

    static final byte[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant };

    private String isVariable;

    protected isConstructor() {
    }

    public static ErgPreambleRecord isMethod(byte[] isParameter) {
        ErgPreambleRecord isVariable = new ErgPreambleRecord();
        // isComment
        if (!isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr)) {
            throw new IllegalArgumentException("isStringConstant");
        }
        // isComment
        if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant), isNameExpr)) {
            isNameExpr.isFieldAccessExpr = null;
        } else {
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant));
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isMethod().isMethod(), isMethod() == null ? "isStringConstant" : isMethod());
    }
}
