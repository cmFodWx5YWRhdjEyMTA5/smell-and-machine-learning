// isComment
package monakhv.android.samlib.utils;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;
import monakhv.samlib.db.entity.*;

/*isComment*/
public class isClassOrIsInterface extends OrmLiteConfigUtil {

    private static final Class<?>[] isVariable = new Class[] { Author.class, Book.class, Tag.class, Tag2Author.class, SelectedBook.class, GroupBook.class };

    public static void isMethod(String[] isParameter) throws Exception {
        isMethod("isStringConstant", isNameExpr);
    }
}
