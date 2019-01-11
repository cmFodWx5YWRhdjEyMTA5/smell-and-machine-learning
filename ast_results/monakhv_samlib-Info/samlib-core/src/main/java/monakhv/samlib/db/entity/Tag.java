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
    private int isVariable;

    @DatabaseField(columnName = isNameExpr.isFieldAccessExpr, canBeNull = true)
    private String isVariable;

    @DatabaseField(columnName = isNameExpr.isFieldAccessExpr, canBeNull = true)
    private String isVariable;

    public isConstructor() {
    }

    public isConstructor(String isParameter) {
        this();
        isMethod(isNameExpr);
    }

    private void isMethod(String isParameter) {
        String isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        isMethod(isNameExpr);
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
