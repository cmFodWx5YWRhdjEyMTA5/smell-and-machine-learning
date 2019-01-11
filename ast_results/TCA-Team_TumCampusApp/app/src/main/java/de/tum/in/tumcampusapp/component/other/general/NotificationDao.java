// isComment
package de.tum.in.tumcampusapp.component.other.general;

import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.ui.alarm.model.FcmNotification;

@Dao
public interface isClassOrIsInterface {

    @Nullable
    @Query("isStringConstant")
    FcmNotification isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod();

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(FcmNotification isParameter);
}
