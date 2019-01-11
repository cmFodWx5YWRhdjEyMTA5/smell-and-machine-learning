// isComment
package com.sensirion.smartgadget.persistence.history_database.table;

import android.support.annotation.NonNull;
import com.sensirion.database_library.database_object.AbstractDatabaseObject;
import com.sensirion.database_library.database_object.DatabaseObjectType;
import java.util.Arrays;
import java.util.List;

public abstract class isClassOrIsInterface extends AbstractDatabaseObject {

    isConstructor(final String isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public String isMethod(final String isParameter) {
        return isMethod(isNameExpr.isMethod(new String[] { isNameExpr }));
    }

    /**
     * isComment
     */
    public String isMethod(@NonNull final List<String> isParameter) {
        final StringBuilder isVariable = new StringBuilder();
        isNameExpr.isMethod('isStringConstant');
        for (int isVariable = isNameExpr.isMethod() - isIntegerConstant; isNameExpr >= isIntegerConstant; isNameExpr--) {
            isNameExpr.isMethod(isMethod(isNameExpr.isMethod(isNameExpr)));
            if (isNameExpr > isIntegerConstant) {
                isNameExpr.isMethod("isStringConstant");
            }
        }
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr.isMethod("isStringConstant", isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isMethod());
    }

    /**
     * isComment
     */
    public abstract int isMethod();

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public abstract int isMethod();
}
