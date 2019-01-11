// isComment
package de.tum.in.tumcampusapp.component.tumui.calendar;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import org.joda.time.DateTime;
import java.util.List;
import de.tum.in.tumcampusapp.component.tumui.calendar.model.CalendarItem;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    List<CalendarItem> isMethod();

    @Query("isStringConstant")
    List<CalendarItem> isMethod(DateTime isParameter);

    @Query("isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod(DateTime isParameter, DateTime isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod(DateTime isParameter, DateTime isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod(DateTime isParameter, DateTime isParameter, String isParameter);

    @Query("isStringConstant")
    List<CalendarItem> isMethod();

    @Query("isStringConstant")
    boolean isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod(String isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod(String isParameter);

    @Query("isStringConstant")
    void isMethod();

    @Query("isStringConstant")
    void isMethod(String isParameter);

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(CalendarItem... isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    List<String> isMethod(String isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    List<CalendarItem> isMethod(String isParameter);

    @Query("isStringConstant")
    CalendarItem isMethod(String isParameter);
}
