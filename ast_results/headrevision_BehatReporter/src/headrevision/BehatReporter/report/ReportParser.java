// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.ParserException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemParser {

    public isConstructor(JsonNode isParameter) {
        super(isNameExpr, new FeatureParserFactory());
    }

    @Override
    public boolean isMethod() throws ParserException {
        return true;
    }

    public Date isMethod() throws ParserException {
        SimpleDateFormat isVariable = new SimpleDateFormat("isStringConstant", isNameExpr.isFieldAccessExpr);
        Date isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isMethod("isStringConstant"));
        } catch (ParseException isParameter) {
            throw (new ParserException(isNameExpr));
        }
        return isNameExpr;
    }
}
