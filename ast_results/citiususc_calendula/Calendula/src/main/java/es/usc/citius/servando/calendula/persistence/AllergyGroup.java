// isComment
package es.usc.citius.servando.calendula.persistence;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * isComment
 */
@DatabaseTable(tableName = "isStringConstant")
public class isClassOrIsInterface implements Comparable<AllergyGroup> {

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    @DatabaseField(columnName = isNameExpr, generatedId = true)
    private Long isVariable;

    @DatabaseField(columnName = isNameExpr)
    private String isVariable;

    @DatabaseField(columnName = isNameExpr)
    private int isVariable;

    @DatabaseField(columnName = isNameExpr)
    private String isVariable;

    public isConstructor() {
    }

    public isConstructor(String isParameter, int isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
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
        this.isFieldAccessExpr = isNameExpr;
    }

    public Long isMethod() {
        return isNameExpr;
    }

    public void isMethod(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null || isMethod() != isNameExpr.isMethod())
            return true;
        AllergyGroup isVariable = (AllergyGroup) isNameExpr;
        if (isNameExpr != isNameExpr.isFieldAccessExpr)
            return true;
        if (isNameExpr != null ? !isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) : isNameExpr.isFieldAccessExpr != null)
            return true;
        if (isNameExpr != null ? !isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) : isNameExpr.isFieldAccessExpr != null)
            return true;
        return isNameExpr != null ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) : isNameExpr.isFieldAccessExpr == null;
    }

    @Override
    public int isMethod() {
        int isVariable = isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant;
        isNameExpr = isIntegerConstant * isNameExpr + (isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant);
        isNameExpr = isIntegerConstant * isNameExpr + isNameExpr;
        isNameExpr = isIntegerConstant * isNameExpr + (isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant);
        return isNameExpr;
    }

    @Override
    public int isMethod(AllergyGroup isParameter) {
        if (this.isFieldAccessExpr != isNameExpr.isFieldAccessExpr)
            return isNameExpr.isMethod(this.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
        else
            return this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}
