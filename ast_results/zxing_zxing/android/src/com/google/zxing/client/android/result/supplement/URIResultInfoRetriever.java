// isComment
package com.google.zxing.client.android.result.supplement;

import android.content.Context;
import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.history.HistoryManager;
import com.google.zxing.client.android.R;
import com.google.zxing.client.result.URIParsedResult;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

final class isClassOrIsInterface extends SupplementalInfoRetriever {

    private static final int isVariable = isIntegerConstant;

    private final URIParsedResult isVariable;

    private final String isVariable;

    isConstructor(TextView isParameter, URIParsedResult isParameter, HistoryManager isParameter, Context isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    void isMethod() throws IOException {
        URI isVariable;
        try {
            isNameExpr = new URI(isNameExpr.isMethod());
        } catch (URISyntaxException isParameter) {
            return;
        }
        URI isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isIntegerConstant;
        while (isNameExpr++ < isNameExpr && !isNameExpr.isMethod(isNameExpr)) {
            isMethod(isNameExpr.isMethod(), null, new String[] { isNameExpr + "isStringConstant" + isNameExpr }, isNameExpr.isMethod());
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
    }
}
