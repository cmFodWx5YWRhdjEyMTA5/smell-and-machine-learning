// isComment
package monakhv.samlib.db.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import monakhv.samlib.db.SQLController;
import java.io.Serializable;

/**
 * isComment
 */
@DatabaseTable(tableName = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface implements Serializable {

    @DatabaseField(columnName = isNameExpr.isFieldAccessExpr, generatedId = true)
    protected int isVariable;

    @DatabaseField(columnName = isNameExpr.isFieldAccessExpr, foreign = true, canBeNull = true, unique = true)
    private Book isVariable;

    public isConstructor() {
    }

    public isConstructor(Book isParameter) {
        isNameExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Book isMethod() {
        return isNameExpr;
    }

    public void isMethod(Book isParameter) {
        isNameExpr = isNameExpr;
    }
}
