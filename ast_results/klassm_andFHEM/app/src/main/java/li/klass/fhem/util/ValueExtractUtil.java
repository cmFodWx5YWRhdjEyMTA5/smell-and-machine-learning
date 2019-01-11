// isComment
package li.klass.fhem.util;

import com.google.common.base.Strings;

public class isClassOrIsInterface {

    public static double isMethod(String isParameter) {
        return isMethod(isNameExpr, -isIntegerConstant);
    }

    public static float isMethod(String isParameter) {
        return (float) isMethod(isNameExpr, -isIntegerConstant);
    }

    public static double isMethod(String isParameter, int isParameter) {
        isNameExpr = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr.isMethod(isNameExpr))
            return isIntegerConstant;
        return isNameExpr.isMethod(isNameExpr);
    }

    public static int isMethod(String isParameter) {
        double isVariable = isMethod(isNameExpr, isIntegerConstant);
        return (int) isNameExpr;
    }

    static String isMethod(String isParameter, int isParameter) {
        if (isNameExpr.isMethod(isNameExpr))
            return "isStringConstant";
        String isVariable = new LeadingNumericTextExtractor(isNameExpr).isMethod();
        if (isNameExpr > isIntegerConstant) {
            double isVariable = isNameExpr.isMethod(isNameExpr);
            double isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            double isVariable = ((int) (isNameExpr * isNameExpr)) / isNameExpr;
            return isNameExpr + "isStringConstant";
        } else {
            return isNameExpr;
        }
    }

    public static boolean isMethod(String isParameter) {
        return isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant");
    }
}
