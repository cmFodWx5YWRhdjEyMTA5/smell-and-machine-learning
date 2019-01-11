// isComment
package org.totschnig.myexpenses.provider.filter;

import android.content.Context;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.provider.DatabaseConstants;

public class isClassOrIsInterface extends Criteria {

    public isConstructor(String isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public String isMethod(Context isParameter) {
        return isNameExpr.isMethod("isStringConstant", isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    private String isMethod(Context isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
