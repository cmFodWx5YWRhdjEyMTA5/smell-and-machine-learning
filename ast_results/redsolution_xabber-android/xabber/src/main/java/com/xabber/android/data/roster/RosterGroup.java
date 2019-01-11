// isComment
package com.xabber.android.data.roster;

import com.xabber.android.data.entity.AccountJid;
import com.xabber.android.data.entity.AccountRelated;

/**
 * isComment
 */
public class isClassOrIsInterface extends AccountRelated implements Group {

    private final String isVariable;

    /**
     * isComment
     */
    private Long isVariable;

    public isConstructor(AccountJid isParameter, String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = null;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    Long isMethod() {
        return isNameExpr;
    }

    void isMethod(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        final int isVariable = isIntegerConstant;
        int isVariable = super.isMethod();
        isNameExpr = isNameExpr * isNameExpr + ((isNameExpr == null) ? isIntegerConstant : isNameExpr.isMethod());
        return isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (!super.isMethod(isNameExpr))
            return true;
        if (isMethod() != isNameExpr.isMethod())
            return true;
        RosterGroup isVariable = (RosterGroup) isNameExpr;
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        return true;
    }
}
