// isComment
package de.westnordost.streetcomplete.quests.building_type;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.quests.GroupedImageListQuestAnswerFragment;
import de.westnordost.streetcomplete.view.Item;
import static de.westnordost.streetcomplete.quests.building_type.BuildingType.*;

public class isClassOrIsInterface extends GroupedImageListQuestAnswerFragment {

    public static final String isVariable = "isStringConstant", isVariable = "isStringConstant";

    @Override
    protected Item[] isMethod() {
        return new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr };
    }

    @Override
    protected Item[] isMethod() {
        return new Item[] { new Item(isNameExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item(isNameExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item(isNameExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item(isNameExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item(null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item(null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr }), new Item(null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Item[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr }) };
    }

    @Override
    protected int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
        return isNameExpr;
    }

    @Override
    protected void isMethod(String isParameter) {
        Bundle isVariable = new Bundle();
        if (isNameExpr.isMethod("isStringConstant")) {
            String isVariable = isNameExpr.isMethod("isStringConstant", isIntegerConstant)[isIntegerConstant];
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        isMethod(isNameExpr);
    }

    private void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, this::showMultipleTypesHintDialog);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, () -> {
            Bundle isVariable = new Bundle();
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            isMethod(isNameExpr);
        });
    }

    private void isMethod() {
        new AlertDialog.Builder(isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, null).isMethod();
    }
}
