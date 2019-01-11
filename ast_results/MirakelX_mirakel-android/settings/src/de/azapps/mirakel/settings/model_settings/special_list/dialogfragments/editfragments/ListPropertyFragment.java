// isComment
package de.azapps.mirakel.settings.model_settings.special_list.dialogfragments.editfragments;

import android.support.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import de.azapps.mirakel.model.list.ListMirakel;
import de.azapps.mirakel.model.list.meta.SpecialListsListProperty;

public class isClassOrIsInterface extends SetPropertyFragment<SpecialListsListProperty> {

    public static ListPropertyFragment isMethod(final SpecialListsListProperty isParameter) {
        return isMethod(new ListPropertyFragment(), isNameExpr);
    }

    @NonNull
    @Override
    protected Map<String, Integer> isMethod() {
        Map<String, Integer> isVariable = new HashMap<>();
        for (ListMirakel isVariable : isNameExpr.isMethod(true)) {
            isNameExpr.isMethod(isNameExpr.isMethod(), (int) isNameExpr.isMethod());
        }
        return isNameExpr;
    }
}
