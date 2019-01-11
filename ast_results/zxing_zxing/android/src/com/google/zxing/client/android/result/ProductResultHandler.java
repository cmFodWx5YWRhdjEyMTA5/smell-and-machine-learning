// isComment
package com.google.zxing.client.android.result;

import com.google.zxing.Result;
import com.google.zxing.client.android.R;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ProductParsedResult;
import android.app.Activity;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ResultHandler {

    private static final int[] isVariable = { isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr };

    public isConstructor(Activity isParameter, ParsedResult isParameter, Result isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public int isMethod() {
        return isMethod() ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr - isIntegerConstant;
    }

    @Override
    public int isMethod(int isParameter) {
        return isNameExpr[isNameExpr];
    }

    @Override
    public void isMethod(int isParameter) {
        String isVariable = isMethod(isMethod());
        switch(isNameExpr) {
            case isIntegerConstant:
                isMethod(isNameExpr);
                break;
            case isIntegerConstant:
                isMethod(isNameExpr);
                break;
            case isIntegerConstant:
                isMethod(isMethod(isNameExpr));
                break;
        }
    }

    private static String isMethod(ParsedResult isParameter) {
        if (isNameExpr instanceof ProductParsedResult) {
            return ((ProductParsedResult) isNameExpr).isMethod();
        }
        if (isNameExpr instanceof ExpandedProductParsedResult) {
            return ((ExpandedProductParsedResult) isNameExpr).isMethod();
        }
        throw new IllegalArgumentException(isNameExpr.isMethod().isMethod());
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
