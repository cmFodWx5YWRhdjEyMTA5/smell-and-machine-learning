// isComment
package es.usc.citius.servando.calendula.persistence.typeSerializers;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.field.types.BaseDataType;
import com.j256.ormlite.support.DatabaseResults;
import java.nio.charset.Charset;
import java.sql.SQLException;
import es.usc.citius.servando.calendula.util.security.SecurityProvider;

public class isClassOrIsInterface extends BaseDataType {

    private static final SecureStringPersister isVariable = new SecureStringPersister();

    private static Charset isVariable = isNameExpr.isMethod("isStringConstant");

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr, new Class<?>[] { String.class });
    }

    public static SecureStringPersister isMethod() {
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
        if (((String) isNameExpr).isMethod()) {
            return "isStringConstant";
        }
        return isNameExpr.isMethod().isMethod((String) isNameExpr);
    }

    @Override
    public Object isMethod(FieldType isParameter, Object isParameter) throws SQLException {
        if (isNameExpr == null) {
            return null;
        }
        if (((String) isNameExpr).isMethod()) {
            return "isStringConstant";
        }
        return isNameExpr.isMethod().isMethod((String) isNameExpr);
    }
}
