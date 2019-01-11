// isComment
package de.grobox.transportr.data.searches;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.List;
import de.schildbach.pte.NetworkId;
import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    LiveData<List<StoredSearch>> isMethod(NetworkId isParameter);

    @Nullable
    @Query("isStringConstant")
    StoredSearch isMethod(NetworkId isParameter, long isParameter, @Nullable Long isParameter, long isParameter);

    @Insert(onConflict = isNameExpr)
    long isMethod(StoredSearch isParameter);

    @Query("isStringConstant")
    void isMethod(long isParameter, Date isParameter);

    @Query("isStringConstant")
    boolean isMethod(long isParameter);

    @Query("isStringConstant")
    void isMethod(long isParameter, boolean isParameter);

    @Delete
    void isMethod(StoredSearch isParameter);
}
