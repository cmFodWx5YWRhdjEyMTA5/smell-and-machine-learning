// isComment
package org.sickstache.task;

import org.sickstache.helper.Preferences;

public class isClassOrIsInterface extends SickTask<Void, Void, Boolean> {

    protected String[] isVariable;

    protected Boolean isVariable;

    public isConstructor(Preferences isParameter, String isParameter, Boolean isParameter) {
        this(isNameExpr, new String[] { isNameExpr }, isNameExpr);
    }

    public isConstructor(Preferences isParameter, String[] isParameter, Boolean isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected Boolean isMethod(Void... isParameter) {
        try {
            if (isNameExpr.isFieldAccessExpr == isIntegerConstant)
                return isNameExpr.isMethod().isMethod(isNameExpr[isIntegerConstant], isNameExpr);
            else
                return isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
        } catch (Exception isParameter) {
            isNameExpr = isNameExpr;
            return null;
        }
    }
}
