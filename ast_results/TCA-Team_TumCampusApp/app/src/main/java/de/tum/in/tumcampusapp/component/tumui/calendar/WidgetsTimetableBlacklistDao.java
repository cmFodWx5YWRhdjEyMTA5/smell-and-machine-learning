// isComment
package de.tum.in.tumcampusapp.component.tumui.calendar;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.tumui.calendar.model.WidgetsTimetableBlacklist;

@Dao
public interface isClassOrIsInterface {

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(WidgetsTimetableBlacklist isParameter);

    @Delete
    void isMethod(WidgetsTimetableBlacklist isParameter);

    @Query("isStringConstant")
    void isMethod();
}
