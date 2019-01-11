// isComment
package de.tum.in.tumcampusapp.component.other.wifimeasurement;

import java.util.List;
import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.other.wifimeasurement.model.WifiMeasurement;

@Dao
public interface isClassOrIsInterface {

    @Nullable
    @Query("isStringConstant")
    List<WifiMeasurement> isMethod();

    @Query("isStringConstant")
    void isMethod();

    @Insert
    void isMethod(WifiMeasurement isParameter);
}
