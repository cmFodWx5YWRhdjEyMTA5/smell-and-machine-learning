// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import headrevision.BehatReporter.test.AbstractParserTest;
import junit.framework.Assert;

public class isClassOrIsInterface extends AbstractParserTest {

    public void isMethod() {
        OutlineExampleParser isVariable = new OutlineExampleParser(isMethod("isStringConstant"));
        try {
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        } catch (ParserException isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }

    public void isMethod() {
        OutlineExampleParser isVariable = new OutlineExampleParser(isMethod("isStringConstant"));
        try {
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        } catch (ParserException isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }
}
