// isComment
package monakhv.samlib.db;

import com.j256.ormlite.dao.Dao;
import monakhv.samlib.db.entity.*;

/*isComment*/
public interface isClassOrIsInterface {

    Dao<Author, Integer> isMethod();

    Dao<Book, Integer> isMethod();

    Dao<Tag, Integer> isMethod();

    Dao<Tag2Author, Integer> isMethod();

    Dao<SelectedBook, Integer> isMethod();

    Dao<GroupBook, Integer> isMethod();
}
