// isComment
package de.westnordost.streetcomplete.quests;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import de.westnordost.streetcomplete.R;
import de.westnordost.streetcomplete.util.TextChangedWatcher;

public abstract class isClassOrIsInterface extends AbstractQuestFormAnswerFragment {

    public static final String isVariable = "isStringConstant";

    @Override
    public void isMethod(View isParameter, @Nullable Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isMethod().isMethod(new TextChangedWatcher(this::checkIsFormComplete));
    }

    @Override
    protected void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr, isMethod());
        isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return !isMethod().isMethod();
    }

    private String isMethod() {
        return isMethod().isMethod().isMethod();
    }

    protected abstract EditText isMethod();
}
