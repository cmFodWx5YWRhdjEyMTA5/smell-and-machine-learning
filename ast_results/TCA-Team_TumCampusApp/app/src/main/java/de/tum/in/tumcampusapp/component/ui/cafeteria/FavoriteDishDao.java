// isComment
package de.tum.in.tumcampusapp.component.ui.cafeteria;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.CafeteriaMenu;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.FavoriteDish;

@Dao
public interface isClassOrIsInterface {

    @Insert
    void isMethod(FavoriteDish isParameter);

    @Query("isStringConstant" + "isStringConstant")
    List<String> isMethod(int isParameter, String isParameter);

    @Query("isStringConstant")
    List<FavoriteDish> isMethod(String isParameter);

    @Query("isStringConstant")
    int isMethod(int isParameter, String isParameter);

    @Query("isStringConstant")
    List<Integer> isMethod(int isParameter, String isParameter);

    @Query("isStringConstant")
    void isMethod(int isParameter, String isParameter);

    @Query("isStringConstant")
    List<FavoriteDish> isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    List<String> isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CafeteriaMenu> isMethod(String isParameter);

    @Query("isStringConstant")
    void isMethod();
}
