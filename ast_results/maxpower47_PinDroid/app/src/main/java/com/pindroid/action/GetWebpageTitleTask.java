// isComment
package com.pindroid.action;

import android.os.AsyncTask;
import com.pindroid.client.NetworkUtilities;

public class isClassOrIsInterface extends AsyncTask<String, Integer, String> {

    private String isVariable;

    @Override
    protected String isMethod(String... isParameter) {
        if (isNameExpr.isFieldAccessExpr > isIntegerConstant && isNameExpr[isIntegerConstant] != null && isNameExpr[isIntegerConstant] != "isStringConstant") {
            isNameExpr = isNameExpr[isIntegerConstant];
            return isNameExpr.isMethod(isNameExpr);
        } else
            return "isStringConstant";
    }
}
