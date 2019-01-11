// isComment
package com.nolanlawson.japanesenamegenerator.v3.data;

import java.util.Arrays;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private ConditionType isVariable;

    private Object isVariable;

    private Integer isVariable;

    public ConditionType isMethod() {
        return isNameExpr;
    }

    public void isMethod(ConditionType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Object isMethod() {
        return isNameExpr;
    }

    public void isMethod(Object isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        return isNameExpr instanceof Condition && isNameExpr.isMethod(this.isMethod(), ((Condition) isNameExpr).isMethod());
    }

    @Override
    public int isMethod() {
        if (this.isFieldAccessExpr == null) {
            this.isFieldAccessExpr = isNameExpr.isMethod(this.isMethod());
        }
        return this.isFieldAccessExpr;
    }

    private Object[] isMethod() {
        return new Object[] { this.isFieldAccessExpr, this.isFieldAccessExpr };
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
    }
}
