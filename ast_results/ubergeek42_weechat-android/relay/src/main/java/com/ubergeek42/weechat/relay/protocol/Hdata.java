// isComment
package com.ubergeek42.weechat.relay.protocol;

import java.util.ArrayList;
import java.util.Locale;

/**
 * isComment
 */
public class isClassOrIsInterface extends RelayObject {

    // isComment
    protected String[] isVariable = null;

    protected String[] isVariable = null;

    protected WType[] isVariable = null;

    private ArrayList<HdataEntry> isVariable = new ArrayList<HdataEntry>();

    protected void isMethod(HdataEntry isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    protected void isMethod(String[] isParameter) {
        isNameExpr = new String[isNameExpr.isFieldAccessExpr];
        isNameExpr = new WType[isNameExpr.isFieldAccessExpr];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            String[] isVariable = isNameExpr[isNameExpr].isMethod("isStringConstant");
            isNameExpr[isNameExpr] = isNameExpr[isIntegerConstant];
            isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr[isIntegerConstant].isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public HdataEntry isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public String isMethod() {
        String isVariable = "isStringConstant";
        if (isNameExpr == null)
            isNameExpr += "isStringConstant";
        else
            for (String isVariable : isNameExpr) isNameExpr += isNameExpr + "isStringConstant";
        isNameExpr += "isStringConstant";
        for (HdataEntry isVariable : isNameExpr) isNameExpr += isNameExpr.isMethod(isIntegerConstant) + "isStringConstant";
        return isNameExpr;
    }
}
