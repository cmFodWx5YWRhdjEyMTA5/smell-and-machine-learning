// isComment
package de.tum.in.tumcampusapp.utils.sync;

import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.utils.sync.model.Sync;

@Dao
public interface isClassOrIsInterface {

    @Nullable
    @Query("isStringConstant")
    String isMethod(String isParameter, int isParameter);

    @Query("isStringConstant")
    void isMethod();

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(Sync isParameter);
}
