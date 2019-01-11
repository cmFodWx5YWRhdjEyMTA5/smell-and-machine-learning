// isComment
package com.health.openscale.core.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import android.database.Cursor;
import com.health.openscale.core.datatypes.ScaleMeasurement;
import java.util.Date;
import java.util.List;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    ScaleMeasurement isMethod(Date isParameter, int isParameter);

    @Query("isStringConstant")
    ScaleMeasurement isMethod(int isParameter);

    @Query("isStringConstant")
    ScaleMeasurement isMethod(int isParameter, int isParameter);

    @Query("isStringConstant")
    ScaleMeasurement isMethod(int isParameter, int isParameter);

    @Query("isStringConstant")
    List<ScaleMeasurement> isMethod(int isParameter);

    @Query("isStringConstant")
    List<ScaleMeasurement> isMethod(Date isParameter, Date isParameter, int isParameter);

    @Query("isStringConstant")
    ScaleMeasurement isMethod(int isParameter);

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    long isMethod(ScaleMeasurement isParameter);

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(List<ScaleMeasurement> isParameter);

    @Update
    void isMethod(ScaleMeasurement isParameter);

    @Query("isStringConstant")
    void isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod(int isParameter);

    // isComment
    @Query("isStringConstant")
    Cursor isMethod(long isParameter);
}
