// isComment
package de.schildbach.wallet.data;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/**
 * isComment
 */
@Database(entities = { AddressBookEntry.class }, version = isIntegerConstant, exportSchema = true)
public abstract class isClassOrIsInterface extends RoomDatabase {

    public abstract AddressBookDao isMethod();

    private static AppDatabase isVariable;

    public static AppDatabase isMethod(final Context isParameter) {
        if (isNameExpr == null) {
            synchronized (AppDatabase.class) {
                if (isNameExpr == null) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(), AppDatabase.class, "isStringConstant").isMethod(isNameExpr).isMethod().isMethod();
                }
            }
        }
        return isNameExpr;
    }

    private static final Migration isVariable = new Migration(isIntegerConstant, isIntegerConstant) {

        @Override
        public void isMethod(final SupportSQLiteDatabase isParameter) {
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
        }
    };
}
