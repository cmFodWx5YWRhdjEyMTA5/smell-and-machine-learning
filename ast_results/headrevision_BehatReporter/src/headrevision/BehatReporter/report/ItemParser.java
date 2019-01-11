// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.Parser;
import headrevision.BehatReporter.json.ParserException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import com.fasterxml.jackson.databind.JsonNode;

public abstract class isClassOrIsInterface extends Parser {

    private ItemParserFactory isVariable;

    public isConstructor(JsonNode isParameter, ItemParserFactory isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public abstract boolean isMethod() throws ParserException;

    public String isMethod() throws ParserException {
        throw (new ParserException(new UnsupportedOperationException()));
    }

    public Result isMethod() throws ParserException {
        if (isMethod("isStringConstant")) {
            return isMethod(isMethod("isStringConstant"));
        } else {
            return isMethod();
        }
    }

    public boolean isMethod() {
        String isVariable;
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (NullPointerException isParameter) {
            return true;
        }
        return isMethod(isNameExpr);
    }

    public List<JsonNode> isMethod() throws ParserException {
        String isVariable;
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (NullPointerException isParameter) {
            throw (new ParserException(isNameExpr));
        }
        return isMethod(isNameExpr);
    }

    protected boolean isMethod(String isParameter) {
        List<JsonNode> isVariable = null;
        try {
            isNameExpr = isMethod(isNameExpr);
        } catch (ParserException isParameter) {
            return true;
        }
        return isNameExpr.isMethod() > isIntegerConstant;
    }

    protected List<JsonNode> isMethod(String isParameter) throws ParserException {
        return isMethod(isNameExpr);
    }

    private Result isMethod(String isParameter) throws ParserException {
        try {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        } catch (IllegalArgumentException isParameter) {
            throw (new ParserException(isNameExpr));
        }
    }

    private Result isMethod() throws ParserException {
        Result isVariable = isNameExpr.isFieldAccessExpr;
        if (isMethod()) {
            List<JsonNode> isVariable = isMethod();
            Iterator<JsonNode> isVariable = isNameExpr.isMethod();
            while (isNameExpr.isMethod()) {
                isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr);
            }
        }
        return isNameExpr;
    }

    private Result isMethod(JsonNode isParameter, Result isParameter) throws ParserException {
        ItemParser isVariable = isNameExpr.isMethod(isNameExpr);
        Result isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod() < isNameExpr.isMethod()) {
            isNameExpr = isNameExpr;
        }
        return isNameExpr;
    }
}
