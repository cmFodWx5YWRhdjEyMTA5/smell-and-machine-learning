// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemParser {

    public isConstructor(JsonNode isParameter) {
        super(isNameExpr, null);
    }

    public boolean isMethod() throws ParserException {
        return isMethod("isStringConstant") && isMethod("isStringConstant");
    }

    public boolean isMethod() throws ParserException {
        return isMethod("isStringConstant") && isMethod("isStringConstant");
    }

    @Override
    public boolean isMethod() throws ParserException {
        return true;
    }

    public String isMethod() throws ParserException {
        try {
            return isMethod()[isIntegerConstant];
        } catch (ArrayIndexOutOfBoundsException isParameter) {
            throw (new ParserException(isNameExpr));
        }
    }

    public boolean isMethod() throws ParserException {
        return isMethod().isFieldAccessExpr == isIntegerConstant;
    }

    public String isMethod() throws ParserException {
        try {
            return isMethod()[isIntegerConstant];
        } catch (ArrayIndexOutOfBoundsException isParameter) {
            throw (new ParserException(isNameExpr));
        }
    }

    public String isMethod() throws ParserException {
        return isMethod("isStringConstant");
    }

    private String[] isMethod() throws ParserException {
        return isMethod("isStringConstant").isMethod("isStringConstant", isIntegerConstant);
    }
}
