// isComment
package org.sickstache.task;

import org.sickstache.helper.Preferences;

public class isClassOrIsInterface extends SickTask<Void, Void, Boolean> {

    protected String[] isVariable;

    public isConstructor(Preferences isParameter, String isParameter) {
        this(isNameExpr, new String[] { isNameExpr });
    }

    public isConstructor(Preferences isParameter, String[] isParameter) {
        super(isNameExpr);
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
                return isNameExpr.isMethod().isMethod(isNameExpr[isIntegerConstant]);
            else
                return isNameExpr.isMethod().isMethod(isNameExpr);
        } catch (Exception isParameter) {
            isNameExpr = isNameExpr;
            return null;
        }
    }
}
