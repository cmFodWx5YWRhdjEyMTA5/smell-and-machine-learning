// isComment
package jp.redmine.redmineclient.parser;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.SQLException;
import jp.redmine.redmineclient.entity.IMasterRecord;
import jp.redmine.redmineclient.entity.TypeConverter;

public abstract class isClassOrIsInterface<CON, ITEM> extends BaseParser<CON, ITEM> {

    private ITEM isVariable = null;

    private int isVariable;

    protected abstract String isMethod();

    protected abstract ITEM isMethod();

    protected abstract void isMethod(CON isParameter, ITEM isParameter) throws XmlPullParserException, IOException, SQLException;

    protected void isMethod(CON isParameter) throws XmlPullParserException, IOException, SQLException {
        isNameExpr = null;
        isNameExpr = isIntegerConstant;
    }

    @Override
    protected void isMethod(CON isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isMethod(isMethod())) {
            isNameExpr = isMethod();
            isNameExpr = isNameExpr.isMethod();
        } else if (isNameExpr != null) {
            isMethod(isNameExpr, isNameExpr);
        }
    }

    @Override
    protected void isMethod(CON isParameter) throws XmlPullParserException, IOException, SQLException {
        if (isMethod(isMethod()) && isNameExpr == isNameExpr.isMethod()) {
            isMethod(isNameExpr, isNameExpr);
            isNameExpr = null;
            isNameExpr = isIntegerConstant;
        }
    }

    protected boolean isMethod(String isParameter) throws XmlPullParserException, IOException {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    protected void isMethod(IMasterRecord isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isNameExpr.isMethod(isMethod("isStringConstant"));
    }

    protected Integer isMethod(String isParameter) {
        return isMethod("isStringConstant", isNameExpr);
    }

    protected Integer isMethod(String isParameter, String isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr);
    }

    protected Long isMethod(String isParameter) {
        return isMethod("isStringConstant", isNameExpr);
    }

    protected Long isMethod(String isParameter, String isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr) ? null : isNameExpr.isMethod(isNameExpr);
    }

    protected String isMethod(String isParameter) {
        return isMethod("isStringConstant", isNameExpr);
    }

    protected String isMethod(String isParameter, String isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr) ? null : isNameExpr;
    }

    protected BigDecimal isMethod(String isParameter) {
        return isMethod("isStringConstant", isNameExpr);
    }

    protected BigDecimal isMethod(String isParameter, String isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr) ? null : new BigDecimal(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    protected Integer isMethod() throws XmlPullParserException, IOException {
        String isVariable = isMethod();
        return isNameExpr.isMethod(isNameExpr);
    }

    protected Long isMethod() throws XmlPullParserException, IOException {
        String isVariable = isMethod();
        return isNameExpr.isMethod(isNameExpr) ? null : isNameExpr.isMethod(isNameExpr);
    }

    protected BigDecimal isMethod() throws XmlPullParserException, IOException {
        String isVariable = isMethod();
        return isNameExpr.isMethod(isNameExpr) ? null : new BigDecimal(isNameExpr, isNameExpr.isFieldAccessExpr);
    }
}
