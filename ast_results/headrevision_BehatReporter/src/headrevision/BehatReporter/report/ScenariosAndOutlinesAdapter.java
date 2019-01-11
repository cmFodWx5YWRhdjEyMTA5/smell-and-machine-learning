// isComment
package headrevision.BehatReporter.report;

import headrevision.BehatReporter.R;
import headrevision.BehatReporter.json.ParserException;
import headrevision.BehatReporter.ui.Message;
import headrevision.BehatReporter.ui.ResultColor;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemsAdapter {

    public isConstructor(Activity isParameter, int isParameter, List<JsonNode> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public ItemParserFactory isMethod() {
        return new ScenarioOrOutlineParserFactory();
    }

    @Override
    public ItemsAdapterFactory isMethod(JsonNode isParameter) {
        try {
            if ((new OutlineParser(isNameExpr)).isMethod()) {
                return new StepsAndOutlineExamplesAdapterFactory();
            }
        } catch (ParserException isParameter) {
            return null;
        }
        return new StepsAdapterFactory();
    }

    @Override
    protected List<List<JsonNode>> isMethod(List<JsonNode> isParameter) {
        List<List<JsonNode>> isVariable = new ArrayList<List<JsonNode>>();
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    protected List<String> isMethod(List<List<JsonNode>> isParameter) {
        List<String> isVariable = new ArrayList<String>();
        isNameExpr.isMethod(isMethod(new ScenariosAndOutlinesAdapterFactory()));
        return isNameExpr;
    }

    @Override
    protected void isMethod(View isParameter, int isParameter, int isParameter) {
        JsonNode isVariable = isMethod(isNameExpr, isNameExpr);
        ItemParser isVariable = isMethod().isMethod(isNameExpr);
        try {
            Result isVariable = isNameExpr.isMethod();
            isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr);
        } catch (ParserException isParameter) {
            isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
        }
    }

    private void isMethod(String isParameter, Result isParameter, View isParameter) {
        TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr, isNameExpr, true);
    }
}
