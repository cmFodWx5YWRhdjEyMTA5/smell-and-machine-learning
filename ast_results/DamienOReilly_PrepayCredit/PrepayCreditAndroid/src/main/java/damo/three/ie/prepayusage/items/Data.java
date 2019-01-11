// isComment
package damo.three.ie.prepayusage.items;

import damo.three.ie.prepayusage.BasicUsageItem;
import damo.three.ie.util.NumberUtils;
import java.text.ParseException;
import java.util.List;

public class isClassOrIsInterface extends BasicUsageItem {

    private float isVariable;

    public isConstructor(String isParameter, String isParameter) throws ParseException {
        super("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isMethod(isNameExpr);
    }

    @Override
    public void isMethod(String isParameter) throws ParseException {
        isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod();
    }

    @Override
    public Number isMethod() {
        return isNameExpr;
    }

    private String isMethod(float isParameter) {
        if (isNameExpr < isIntegerConstant) {
            return isNameExpr.isMethod(isNameExpr) + "isStringConstant";
        }
        return isNameExpr.isMethod(isNameExpr / isIntegerConstant) + "isStringConstant";
    }

    @Override
    public String isMethod(List<Number> isParameter) {
        float isVariable = isIntegerConstant;
        for (Number isVariable : isNameExpr) {
            isNameExpr += isNameExpr.isMethod();
        }
        return isMethod(isNameExpr);
    }
}
