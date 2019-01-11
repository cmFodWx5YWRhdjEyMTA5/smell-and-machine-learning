// isComment
package de.azapps.mirakel.settings.model_settings.special_list.dialogfragments.editfragments;

import android.support.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import de.azapps.mirakel.model.list.meta.SpecialListsTagProperty;
import de.azapps.mirakel.model.tags.Tag;

public class isClassOrIsInterface extends SetPropertyFragment<SpecialListsTagProperty> {

    public static TagPropertyFragment isMethod(SpecialListsTagProperty isParameter) {
        return isMethod(new TagPropertyFragment(), isNameExpr);
    }

    @NonNull
    @Override
    protected Map<String, Integer> isMethod() {
        Map<String, Integer> isVariable = new HashMap<>();
        for (Tag isVariable : isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod(), (int) isNameExpr.isMethod());
        }
        return isNameExpr;
    }
}
