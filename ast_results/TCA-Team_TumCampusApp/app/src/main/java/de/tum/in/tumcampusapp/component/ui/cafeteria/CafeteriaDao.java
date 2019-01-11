// isComment
package de.tum.in.tumcampusapp.component.ui.cafeteria;

import java.util.List;
import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.ui.cafeteria.model.Cafeteria;
import io.reactivex.Flowable;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    Flowable<List<Cafeteria>> isMethod();

    @Nullable
    @Query("isStringConstant")
    Cafeteria isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod();

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(Cafeteria... isParameter);

    @Query("isStringConstant")
    String isMethod(int isParameter);
}
