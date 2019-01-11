// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Joiner;

public class isClassOrIsInterface extends ItemParser {

    public isConstructor(JsonNode isParameter) {
        super(isNameExpr, null);
    }

    public boolean isMethod() throws ParserException {
        return isMethod("isStringConstant") && isMethod("isStringConstant");
    }

    @Override
    public boolean isMethod() throws ParserException {
        return true;
    }

    public String isMethod() throws ParserException {
        List<String> isVariable = new ArrayList<String>();
        Map<String, String> isVariable = isMethod("isStringConstant");
        for (Entry<String, String> isVariable : isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod());
        }
        return isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr);
    }
}
