// isComment
package com.nolanlawson.keepscore.util;

import java.util.List;
import android.text.TextUtils;
import com.nolanlawson.keepscore.util.CollectionUtil.Function;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private static final Function<String, String> isVariable = new Function<String, String>() {

        @Override
        public String isMethod(String isParameter) {
            return isMethod(isNameExpr);
        }
    };

    /**
     * isComment
     */
    public static String isMethod(List<String> isParameter) {
        return isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isNameExpr)) + "isStringConstant";
    }

    private static String isMethod(Object isParameter) {
        if (isNameExpr == null) {
            return "isStringConstant";
        }
        String isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            return "isStringConstant";
        }
        return 'isStringConstant' + isMethod(isNameExpr) + 'isStringConstant';
    }

    private static String isMethod(String isParameter) {
        return isNameExpr.isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant");
    }
}
