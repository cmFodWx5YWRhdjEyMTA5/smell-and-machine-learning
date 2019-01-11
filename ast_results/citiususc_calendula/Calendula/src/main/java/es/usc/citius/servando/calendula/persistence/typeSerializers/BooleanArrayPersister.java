// isComment
package es.usc.citius.servando.calendula.persistence.typeSerializers;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.field.types.BaseDataType;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;

public class isClassOrIsInterface extends BaseDataType {

    private static final BooleanArrayPersister isVariable = new BooleanArrayPersister();

    String isVariable = "isStringConstant";

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr, new Class<?>[] { boolean[].class });
    }

    public static BooleanArrayPersister isMethod() {
        return isNameExpr;
    }

    @Override
    public Object isMethod(FieldType isParameter, String isParameter) throws SQLException {
        return isNameExpr;
    }

    @Override
    public Object isMethod(FieldType isParameter, DatabaseResults isParameter, int isParameter) throws SQLException {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Object isMethod(FieldType isParameter, Object isParameter, int isParameter) throws SQLException {
        if (isNameExpr == null) {
            return null;
        }
        return isMethod((String) isNameExpr);
    }

    @Override
    public Object isMethod(FieldType isParameter, Object isParameter) throws SQLException {
        if (isNameExpr == null) {
            return null;
        }
        return isMethod((boolean[]) isNameExpr);
    }

    private boolean[] isMethod(String isParameter) {
        String[] isVariable = isNameExpr.isMethod("isStringConstant");
        boolean[] isVariable = new boolean[isNameExpr.isFieldAccessExpr];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr[isNameExpr]);
        }
        return isNameExpr;
    }

    private String isMethod(boolean[] isParameter) {
        String isVariable = "isStringConstant";
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr += isNameExpr.isMethod(isNameExpr[isNameExpr]);
            if (isNameExpr < isNameExpr.isFieldAccessExpr - isIntegerConstant) {
                isNameExpr += "isStringConstant";
            }
        }
        return isNameExpr;
    }
}
