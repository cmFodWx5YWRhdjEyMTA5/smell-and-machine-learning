// isComment
package de.tum.in.tumcampusapp.component.ui.ticket;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
import de.tum.in.tumcampusapp.component.ui.ticket.model.Ticket;

@Dao
public interface isClassOrIsInterface {

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(Ticket... isParameter);

    @Query("isStringConstant")
    LiveData<List<Ticket>> isMethod();

    @Query("isStringConstant")
    Ticket isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod();
}
