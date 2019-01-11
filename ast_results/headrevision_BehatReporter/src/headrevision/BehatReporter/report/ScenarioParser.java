// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemParser {

    public isConstructor(JsonNode isParameter) {
        super(isNameExpr, new StepParserFactory());
    }

    @Override
    public boolean isMethod() throws ParserException {
        return isMethod() != null;
    }

    @Override
    public String isMethod() throws ParserException {
        return isMethod("isStringConstant");
    }
}
