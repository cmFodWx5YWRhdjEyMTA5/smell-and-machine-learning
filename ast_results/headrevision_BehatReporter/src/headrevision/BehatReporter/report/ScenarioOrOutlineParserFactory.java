// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemParserFactory {

    @Override
    public ItemParser isMethod(JsonNode isParameter) {
        OutlineParser isVariable = new OutlineParser(isNameExpr);
        try {
            if (isNameExpr.isMethod()) {
                return isNameExpr;
            }
        } catch (ParserException isParameter) {
            return null;
        }
        return new ScenarioParser(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
