// isComment
package de.tum.in.tumcampusapp.component.ui.studyroom;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
import de.tum.in.tumcampusapp.component.ui.studyroom.model.StudyRoom;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    List<StudyRoom> isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod();

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(StudyRoom... isParameter);
}
