// isComment
package headrevision.BehatReporter.report;

import java.util.List;
import android.app.Activity;
import com.fasterxml.jackson.databind.JsonNode;

public class isClassOrIsInterface extends ItemsAdapterFactory {

    @Override
    public ItemsAdapter isMethod(Activity isParameter, int isParameter, List<JsonNode> isParameter) {
        return new StepsAndOutlineExamplesAdapter(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }
}
