// isComment
package headrevision.BehatReporter.report;

import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemParserFactory {

    @Override
    public ItemParser isMethod(JsonNode isParameter) {
        return new StepParser(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
