// isComment
package de.tum.in.tumcampusapp.component.ui.cafeteria;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import org.joda.time.DateTime;
import java.util.List;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.CafeteriaMenu;
import io.reactivex.Flowable;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    void isMethod();

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(CafeteriaMenu... isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    Flowable<List<String>> isMethod(int isParameter, String isParameter);

    @Query("isStringConstant")
    List<DateTime> isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CafeteriaMenu> isMethod(int isParameter, DateTime isParameter);
}
