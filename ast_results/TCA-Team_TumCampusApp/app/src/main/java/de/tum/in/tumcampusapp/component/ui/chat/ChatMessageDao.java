// isComment
package de.tum.in.tumcampusapp.component.ui.chat;

import java.util.List;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.ui.chat.model.ChatMessage;

@Dao
public interface isClassOrIsInterface {

    @Query("isStringConstant")
    void isMethod();

    @Query("isStringConstant")
    List<ChatMessage> isMethod(int isParameter);

    @Query("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant")
    void isMethod(int isParameter);

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(ChatMessage isParameter);

    @Query("isStringConstant")
    void isMethod(String isParameter);

    @Query("isStringConstant")
    void isMethod();

    @Query("isStringConstant")
    List<ChatMessage> isMethod();

    @Query("isStringConstant")
    List<ChatMessage> isMethod(int isParameter);

    @Query("isStringConstant" + "isStringConstant")
    List<ChatMessage> isMethod(int isParameter);

    @Query("isStringConstant")
    int isMethod(int isParameter);
}
