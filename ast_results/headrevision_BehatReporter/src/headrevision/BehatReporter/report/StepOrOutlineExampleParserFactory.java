// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemParserFactory {

    @Override
    public ItemParser isMethod(JsonNode isParameter) {
        StepParser isVariable = new StepParser(isNameExpr);
        OutlineExampleParser isVariable = new OutlineExampleParser(isNameExpr);
        try {
            if (isNameExpr.isMethod()) {
                return isNameExpr;
            } else if (isNameExpr.isMethod()) {
                return isNameExpr;
            }
        } catch (ParserException isParameter) {
        }
        return null;
    }

    @Override
    public String isMethod() {
        throw (new UnsupportedOperationException());
    }
}
