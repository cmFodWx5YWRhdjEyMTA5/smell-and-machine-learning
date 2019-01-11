// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import headrevision.BehatReporter.test.AbstractParserTest;
import java.util.Date;
import junit.framework.Assert;

public class isClassOrIsInterface extends AbstractParserTest {

    @SuppressWarnings("isStringConstant")
    public void isMethod() {
        ReportParser isVariable = new ReportParser(isMethod("isStringConstant"));
        try {
            Date isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        } catch (ParserException isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }
}
