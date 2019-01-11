// isComment
package com.mehmetakiftutuncu.eshotroid.models;

import android.text.TextUtils;
import com.mehmetakiftutuncu.eshotroid.utilities.option.None;
import com.mehmetakiftutuncu.eshotroid.utilities.option.Option;
import com.mehmetakiftutuncu.eshotroid.utilities.option.Some;

public enum Direction {

    DEPARTURE("isStringConstant"), ARRIVAL("isStringConstant");

    public final String isVariable;

    isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public static Option<Direction> isMethod(String isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return new None<>();
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return new Some<>(isNameExpr);
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return new Some<>(isNameExpr);
        } else {
            return new None<>();
        }
    }
}
