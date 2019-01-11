// isComment
package de.tum.in.tumcampusapp.component.ui.tufilm;

import java.util.List;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.ui.tufilm.model.Kino;
import io.reactivex.Flowable;

@Dao
public interface isClassOrIsInterface {

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(Kino... isParameter);

    @Query("isStringConstant")
    Flowable<List<Kino>> isMethod();

    @Query("isStringConstant")
    String isMethod();

    @Query("isStringConstant")
    int isMethod(String isParameter);

    @Query("isStringConstant")
    int isMethod(String isParameter);

    @Query("isStringConstant")
    Flowable<Kino> isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod();
}
