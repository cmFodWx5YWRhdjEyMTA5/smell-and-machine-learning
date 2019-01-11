// isComment
package com.health.openscale.core.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import android.database.Cursor;
import com.health.openscale.core.datatypes.ScaleUser;
import java.util.List;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    List<ScaleUser> isMethod();

    @Query("isStringConstant")
    ScaleUser isMethod(int isParameter);

    @Insert
    long isMethod(ScaleUser isParameter);

    @Insert
    void isMethod(List<ScaleUser> isParameter);

    @Update
    void isMethod(ScaleUser isParameter);

    @Delete
    void isMethod(ScaleUser isParameter);

    // isComment
    @Query("isStringConstant")
    Cursor isMethod();
}
