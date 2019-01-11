// isComment
package de.schildbach.wallet.data;

import java.util.List;
import java.util.Set;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

/**
 * isComment
 */
@Dao
public interface isClassOrIsInterface {

    @Insert(onConflict = isNameExpr.isFieldAccessExpr)
    void isMethod(AddressBookEntry isParameter);

    @Query("isStringConstant")
    void isMethod(String isParameter);

    @Query("isStringConstant")
    String isMethod(String isParameter);

    @Query("isStringConstant")
    List<AddressBookEntry> isMethod(String isParameter);

    @Query("isStringConstant")
    LiveData<List<AddressBookEntry>> isMethod();

    @Query("isStringConstant")
    LiveData<List<AddressBookEntry>> isMethod(Set<String> isParameter);
}
