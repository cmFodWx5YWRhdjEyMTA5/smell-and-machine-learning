// isComment
package com.sismics.reader.ui.form.validator;

import android.content.Context;
import com.sismics.reader.R;

/**
 * isComment
 */
public class isClassOrIsInterface implements ValidatorType {

    @Override
    public boolean isMethod(String isParameter) {
        return isNameExpr.isMethod().isMethod() != isIntegerConstant;
    }

    @Override
    public String isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
