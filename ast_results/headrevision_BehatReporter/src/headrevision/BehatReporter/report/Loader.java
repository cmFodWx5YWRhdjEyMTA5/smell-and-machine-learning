// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.json.Reader;
import headrevision.BehatReporter.json.ReaderException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface {

    private LoaderException isVariable;

    public JsonNode isMethod(String isParameter) {
        JsonNode isVariable = null;
        InputStream isVariable = null;
        try {
            isNameExpr = isMethod(isNameExpr);
        } catch (LoaderException isParameter) {
            isNameExpr = isNameExpr;
            return isNameExpr;
        }
        Reader isVariable = new Reader(isNameExpr);
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (ReaderException isParameter) {
            isNameExpr = new LoaderException(isNameExpr);
        }
        return isNameExpr;
    }

    public boolean isMethod() {
        return (isNameExpr != null);
    }

    public LoaderException isMethod() {
        return isNameExpr;
    }

    private InputStream isMethod(String isParameter) throws LoaderException {
        InputStream isVariable = null;
        try {
            isNameExpr = (new URL(isNameExpr)).isMethod();
        } catch (MalformedURLException isParameter) {
            throw (new LoaderException(isNameExpr));
        } catch (IOException isParameter) {
            throw (new LoaderException(isNameExpr));
        }
        return isNameExpr;
    }
}
