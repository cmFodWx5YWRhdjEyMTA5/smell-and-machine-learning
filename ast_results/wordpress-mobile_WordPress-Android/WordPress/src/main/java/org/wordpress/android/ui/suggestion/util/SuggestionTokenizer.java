// isComment
package org.wordpress.android.ui.suggestion.util;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.MultiAutoCompleteTextView;

public class isClassOrIsInterface implements MultiAutoCompleteTextView.Tokenizer {

    @Override
    public CharSequence isMethod(CharSequence isParameter) {
        int isVariable = isNameExpr.isMethod();
        while (isNameExpr > isIntegerConstant && isNameExpr.isMethod(isNameExpr - isIntegerConstant) == 'isStringConstant') {
            isNameExpr--;
        }
        if (isNameExpr instanceof Spanned) {
            SpannableString isVariable = new SpannableString(isNameExpr + "isStringConstant");
            isNameExpr.isMethod((Spanned) isNameExpr, isIntegerConstant, isNameExpr.isMethod(), Object.class, isNameExpr, isIntegerConstant);
            return isNameExpr;
        } else {
            return isNameExpr + "isStringConstant";
        }
    }

    @Override
    public int isMethod(CharSequence isParameter, int isParameter) {
        int isVariable = isNameExpr;
        while (isNameExpr > isIntegerConstant && isNameExpr.isMethod(isNameExpr - isIntegerConstant) != 'isStringConstant') {
            isNameExpr--;
        }
        if (isNameExpr < isIntegerConstant || isNameExpr.isMethod(isNameExpr - isIntegerConstant) != 'isStringConstant') {
            return isNameExpr;
        }
        return isNameExpr;
    }

    @Override
    public int isMethod(CharSequence isParameter, int isParameter) {
        int isVariable = isNameExpr;
        int isVariable = isNameExpr.isMethod();
        while (isNameExpr < isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr) == 'isStringConstant') {
                return isNameExpr;
            } else {
                isNameExpr++;
            }
        }
        return isNameExpr;
    }
}
