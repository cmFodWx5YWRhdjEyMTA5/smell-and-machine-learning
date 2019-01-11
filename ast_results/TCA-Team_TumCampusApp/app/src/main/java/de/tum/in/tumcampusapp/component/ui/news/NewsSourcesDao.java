// isComment
package de.tum.in.tumcampusapp.component.ui.news;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
import de.tum.in.tumcampusapp.component.ui.news.model.NewsSources;

@Dao
public interface isClassOrIsInterface {

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(NewsSources isParameter);

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(List<NewsSources> isParameter);

    @Query("isStringConstant")
    List<NewsSources> isMethod(String isParameter);

    @Query("isStringConstant")
    NewsSources isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod();
}
