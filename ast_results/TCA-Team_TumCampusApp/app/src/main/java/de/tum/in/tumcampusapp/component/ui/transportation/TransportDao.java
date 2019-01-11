// isComment
package de.tum.in.tumcampusapp.component.ui.transportation;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.ui.transportation.model.TransportFavorites;
import de.tum.in.tumcampusapp.component.ui.transportation.model.WidgetsTransport;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    boolean isMethod(String isParameter);

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(TransportFavorites isParameter);

    @Query("isStringConstant")
    void isMethod(String isParameter);

    @Query("isStringConstant")
    WidgetsTransport isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod(int isParameter);

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(WidgetsTransport isParameter);

    @Query("isStringConstant")
    void isMethod();
}
