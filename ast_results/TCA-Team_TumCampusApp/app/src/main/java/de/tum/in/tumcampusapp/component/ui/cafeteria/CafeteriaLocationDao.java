// isComment
package de.tum.in.tumcampusapp.component.ui.cafeteria;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.Location;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    String isMethod(int isParameter);

    @Query("isStringConstant")
    List<Location> isMethod(String isParameter);

    @Query("isStringConstant")
    boolean isMethod();

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(Location isParameter);

    @Query("isStringConstant")
    void isMethod();
}
