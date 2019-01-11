// isComment
package de.westnordost.streetcomplete.quests.surface;

import java.util.Map;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.quests.GroupedImageListQuestAnswerFragment;
import de.westnordost.streetcomplete.view.Item;
import static de.westnordost.streetcomplete.quests.surface.Surface.*;

public class isClassOrIsInterface extends GroupedImageListQuestAnswerFragment {

    @Override
    protected Item[] isMethod() {
        // isComment
        String isVariable = isMethod(isMethod().isMethod());
        switch(isNameExpr) {
            case "isStringConstant":
                return new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
            case "isStringConstant":
                return new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
            case "isStringConstant":
                return new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
            case "isStringConstant":
                return new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
            case "isStringConstant":
                return new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
        }
        throw new IllegalStateException("isStringConstant" + isNameExpr);
    }

    @Override
    protected Item[] isMethod() {
        // isComment
        return new Item[] { new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr }) };
    }

    private static String isMethod(Map<String, String> isParameter) {
        String isVariable = isNameExpr.isMethod("isStringConstant");
        // isComment
        if ("isStringConstant".isMethod(isNameExpr)) {
            if ("isStringConstant".isMethod(isNameExpr.isMethod("isStringConstant")))
                return "isStringConstant";
            if ("isStringConstant".isMethod(isNameExpr.isMethod("isStringConstant")))
                return "isStringConstant";
            if ("isStringConstant".isMethod(isNameExpr.isMethod("isStringConstant")))
                return "isStringConstant";
        }
        return isNameExpr;
    }
}
