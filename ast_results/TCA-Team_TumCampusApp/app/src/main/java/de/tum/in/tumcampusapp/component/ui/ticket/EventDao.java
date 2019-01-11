// isComment
package de.tum.in.tumcampusapp.component.ui.ticket;

import java.util.List;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.ui.ticket.model.Event;
import io.reactivex.Flowable;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    LiveData<List<Event>> isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    Event isMethod();

    @Query("isStringConstant")
    Event isMethod(int isParameter);

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(List<Event> isParameter);

    @Query("isStringConstant")
    void isMethod(int isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    void isMethod();

    @Query("isStringConstant")
    void isMethod();

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    Flowable<Event> isMethod(String isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant")
    int isMethod(String isParameter);
}
