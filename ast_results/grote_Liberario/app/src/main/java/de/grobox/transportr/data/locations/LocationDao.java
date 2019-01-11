// isComment
package de.grobox.transportr.data.locations;

import java.util.List;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import de.schildbach.pte.NetworkId;
import de.schildbach.pte.dto.LocationType;
import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface isClassOrIsInterface {

    // isComment
    @Query("isStringConstant")
    LiveData<List<FavoriteLocation>> isMethod(NetworkId isParameter);

    @Insert(onConflict = isNameExpr)
    long isMethod(FavoriteLocation isParameter);

    @Nullable
    @Query("isStringConstant")
    FavoriteLocation isMethod(long isParameter);

    @Nullable
    @Query("isStringConstant")
    FavoriteLocation isMethod(NetworkId isParameter, LocationType isParameter, @Nullable String isParameter, int isParameter, int isParameter, @Nullable String isParameter, @Nullable String isParameter);

    // isComment
    @Query("isStringConstant")
    LiveData<HomeLocation> isMethod(NetworkId isParameter);

    @Insert(onConflict = isNameExpr)
    long isMethod(HomeLocation isParameter);

    /*isComment*/
    @Query("isStringConstant")
    int isMethod(NetworkId isParameter);

    // isComment
    @Query("isStringConstant")
    LiveData<WorkLocation> isMethod(NetworkId isParameter);

    @Insert(onConflict = isNameExpr)
    long isMethod(WorkLocation isParameter);

    /*isComment*/
    @Query("isStringConstant")
    int isMethod(NetworkId isParameter);
}
