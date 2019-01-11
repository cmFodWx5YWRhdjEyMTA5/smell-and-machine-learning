// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemParser {

    public isConstructor(JsonNode isParameter) {
        super(isNameExpr, new StepOrOutlineExampleParserFactory());
    }

    public boolean isMethod() throws ParserException {
        return isMethod("isStringConstant");
    }

    @Override
    public boolean isMethod() throws ParserException {
        return isMethod() != null;
    }

    @Override
    public String isMethod() throws ParserException {
        return isMethod("isStringConstant");
    }

    @Override
    public boolean isMethod() {
        return isMethod("isStringConstant") && isMethod("isStringConstant");
    }

    @Override
    public List<JsonNode> isMethod() throws ParserException {
        List<JsonNode> isVariable = isMethod("isStringConstant");
        isNameExpr.isMethod(super.isMethod("isStringConstant"));
        return isNameExpr;
    }
}
