// isComment
package com.xabber.android.data.database.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.xabber.android.data.database.DatabaseManager;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractChatPropertyTable<Boolean> {

    static final String isVariable = "isStringConstant";

    private static VibroTable isVariable;

    public static VibroTable isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new VibroTable(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    private isConstructor(DatabaseManager isParameter) {
        super(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return isNameExpr;
    }

    @Override
    String isMethod() {
        return "isStringConstant";
    }

    @Override
    void isMethod(SQLiteStatement isParameter, Boolean isParameter) {
        isNameExpr.isMethod(isIntegerConstant, isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    @Override
    public void isMethod(SQLiteDatabase isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        switch(isNameExpr) {
            case isIntegerConstant:
                isMethod(isNameExpr, "isStringConstant", "isStringConstant");
                break;
            default:
                break;
        }
    }

    public static boolean isMethod(Cursor isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) != isIntegerConstant;
    }
}
