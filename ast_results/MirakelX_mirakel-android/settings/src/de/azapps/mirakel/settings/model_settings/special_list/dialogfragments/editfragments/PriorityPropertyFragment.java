// isComment
package de.azapps.mirakel.settings.model_settings.special_list.dialogfragments.editfragments;

import android.support.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import de.azapps.mirakel.model.list.meta.SpecialListsPriorityProperty;

public class isClassOrIsInterface extends SetPropertyFragment<SpecialListsPriorityProperty> {

    public static PriorityPropertyFragment isMethod(final SpecialListsPriorityProperty isParameter) {
        return isMethod(new PriorityPropertyFragment(), isNameExpr);
    }

    @NonNull
    @Override
    protected Map<String, Integer> isMethod() {
        final Map<String, Integer> isVariable = new HashMap<>(isIntegerConstant);
        for (int isVariable = -isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
        }
        return isNameExpr;
    }
}
