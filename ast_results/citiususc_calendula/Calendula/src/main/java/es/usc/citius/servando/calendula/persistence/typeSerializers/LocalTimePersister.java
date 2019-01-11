// isComment
package es.usc.citius.servando.calendula.persistence.typeSerializers;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.field.types.BaseDataType;
import com.j256.ormlite.support.DatabaseResults;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import java.sql.SQLException;

public class isClassOrIsInterface extends BaseDataType {

    private static final LocalTimePersister isVariable = new LocalTimePersister();

    String isVariable = "isStringConstant";

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr, new Class<?>[] { LocalTime.class });
    }

    public static LocalTimePersister isMethod() {
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
        return isNameExpr.isMethod(isNameExpr).isMethod((String) isNameExpr);
    }

    @Override
    public Object isMethod(FieldType isParameter, Object isParameter) throws SQLException {
        return ((LocalTime) isNameExpr).isMethod(isNameExpr);
    }
}
