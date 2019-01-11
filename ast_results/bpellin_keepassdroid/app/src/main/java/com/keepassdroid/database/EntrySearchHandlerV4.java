// isComment
package com.keepassdroid.database;

import java.util.List;
import java.util.Locale;
import com.keepassdroid.utils.StrUtil;
import com.keepassdroid.utils.UuidUtil;

public class isClassOrIsInterface extends EntrySearchHandler {

    private SearchParametersV4 isVariable;

    protected isConstructor(SearchParameters isParameter, List<PwEntry> isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = (SearchParametersV4) isNameExpr;
    }

    @Override
    protected boolean isMethod(PwEntry isParameter) {
        PwEntryV4 isVariable = (PwEntryV4) isNameExpr;
        if (isNameExpr.isFieldAccessExpr) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            return isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr) >= isIntegerConstant;
        }
        return true;
    }
}
