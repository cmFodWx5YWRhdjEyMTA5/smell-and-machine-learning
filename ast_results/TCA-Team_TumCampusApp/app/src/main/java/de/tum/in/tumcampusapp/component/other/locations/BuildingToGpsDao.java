// isComment
package de.tum.in.tumcampusapp.component.other.locations;

import java.util.List;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.other.locations.model.BuildingToGps;

@Dao
public interface isClassOrIsInterface {

    @Insert
    void isMethod(BuildingToGps... isParameter);

    @Query("isStringConstant")
    List<BuildingToGps> isMethod();

    @Query("isStringConstant")
    void isMethod();
}
