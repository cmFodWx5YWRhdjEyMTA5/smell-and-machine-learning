// isComment
package de.grobox.transportr.data;

import androidx.room.TypeConverter;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.Set;
import de.schildbach.pte.NetworkId;
import de.schildbach.pte.dto.LocationType;
import de.schildbach.pte.dto.Product;

public class isClassOrIsInterface {

    @TypeConverter
    public static String isMethod(@Nullable NetworkId isParameter) {
        if (isNameExpr == null)
            return null;
        return isNameExpr.isMethod();
    }

    @Nullable
    @TypeConverter
    public static NetworkId isMethod(String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            return null;
        }
    }

    @TypeConverter
    public static String isMethod(LocationType isParameter) {
        return isNameExpr.isMethod();
    }

    @TypeConverter
    public static LocationType isMethod(String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            return isNameExpr.isFieldAccessExpr;
        }
    }

    @Nullable
    @TypeConverter
    public static String isMethod(Set<Product> isParameter) {
        if (isNameExpr == null)
            return null;
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @TypeConverter
    public static Set<Product> isMethod(@Nullable String isParameter) {
        if (isNameExpr == null)
            return null;
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @TypeConverter
    public static Date isMethod(Long isParameter) {
        return isNameExpr == null ? null : new Date(isNameExpr);
    }

    @TypeConverter
    public static Long isMethod(Date isParameter) {
        return isNameExpr == null ? null : isNameExpr.isMethod();
    }
}
