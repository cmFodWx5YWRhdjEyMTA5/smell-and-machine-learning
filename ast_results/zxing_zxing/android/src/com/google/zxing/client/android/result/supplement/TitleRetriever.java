// isComment
package com.google.zxing.client.android.result.supplement;

import android.text.Html;
import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.history.HistoryManager;
import com.google.zxing.client.result.URIParsedResult;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * isComment
 */
final class isClassOrIsInterface extends SupplementalInfoRetriever {

    private static final Pattern isVariable = isNameExpr.isMethod("isStringConstant");

    private static final int isVariable = isIntegerConstant;

    private final String isVariable;

    isConstructor(TextView isParameter, URIParsedResult isParameter, HistoryManager isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    @Override
    void isMethod() {
        CharSequence isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant);
        } catch (IOException isParameter) {
            // isComment
            return;
        }
        if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
            Matcher isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod()) {
                String isVariable = isNameExpr.isMethod(isIntegerConstant);
                if (isNameExpr != null && !isNameExpr.isMethod()) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod();
                    if (isNameExpr.isMethod() > isNameExpr) {
                        isNameExpr = isNameExpr.isMethod(isIntegerConstant, isNameExpr) + "isStringConstant";
                    }
                    isMethod(isNameExpr, null, new String[] { isNameExpr }, isNameExpr);
                }
            }
        }
    }
}
