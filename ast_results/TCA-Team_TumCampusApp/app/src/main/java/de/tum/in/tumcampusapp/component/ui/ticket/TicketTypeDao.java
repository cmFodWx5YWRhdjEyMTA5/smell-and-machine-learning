// isComment
package de.tum.in.tumcampusapp.component.ui.ticket;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
import de.tum.in.tumcampusapp.component.ui.ticket.model.TicketType;

@Dao
public interface isClassOrIsInterface {

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(List<TicketType> isParameter);

    @Query("isStringConstant")
    List<TicketType> isMethod();

    @Query("isStringConstant")
    TicketType isMethod(int isParameter);

    @Query("isStringConstant")
    void isMethod();
}
