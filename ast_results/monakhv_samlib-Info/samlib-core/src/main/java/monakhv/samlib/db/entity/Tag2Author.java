// isComment
package monakhv.samlib.db.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import monakhv.samlib.db.SQLController;
import java.io.Serializable;

/*isComment*/
@DatabaseTable(tableName = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface implements Serializable {

    @DatabaseField(columnName = isNameExpr.isFieldAccessExpr, generatedId = true)
    private int isVariable;

    @DatabaseField(foreign = true, columnName = isNameExpr.isFieldAccessExpr, canBeNull = true)
    private Author isVariable;

    @DatabaseField(foreign = true, columnName = isNameExpr.isFieldAccessExpr, canBeNull = true)
    private Tag isVariable;

    public isConstructor() {
    }

    public isConstructor(Author isParameter, Tag isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Author isMethod() {
        return isNameExpr;
    }

    public void isMethod(Author isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Tag isMethod() {
        return isNameExpr;
    }

    public void isMethod(Tag isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
