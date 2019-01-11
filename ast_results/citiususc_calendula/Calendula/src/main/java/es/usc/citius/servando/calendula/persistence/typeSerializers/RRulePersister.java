// isComment
package es.usc.citius.servando.calendula.persistence.typeSerializers;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.field.types.BaseDataType;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;
import es.usc.citius.servando.calendula.persistence.RepetitionRule;

public class isClassOrIsInterface extends BaseDataType {

    private static final RRulePersister isVariable = new RRulePersister();

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr, new Class<?>[] { RepetitionRule.class });
    }

    public static RRulePersister isMethod() {
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
        String isVariable = (String) isNameExpr;
        if (isNameExpr.isMethod("isStringConstant")) {
            String[] isVariable = isNameExpr.isMethod("isStringConstant");
            RepetitionRule isVariable = new RepetitionRule(isNameExpr[isIntegerConstant]);
            isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
        }
        return new RepetitionRule((String) isNameExpr);
    }

    @Override
    public Object isMethod(FieldType isParameter, Object isParameter) throws SQLException {
        RepetitionRule isVariable = (RepetitionRule) isNameExpr;
        String isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod() != null) {
            isNameExpr += "isStringConstant" + isNameExpr.isMethod();
        }
        return isNameExpr;
    }
}
