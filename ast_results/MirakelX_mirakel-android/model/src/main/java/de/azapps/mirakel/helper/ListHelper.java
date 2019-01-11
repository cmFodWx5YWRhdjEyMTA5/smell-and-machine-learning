// isComment
package de.azapps.mirakel.helper;

import android.content.Intent;
import com.google.common.base.Optional;
import de.azapps.mirakel.DefinitionsHelper;
import de.azapps.mirakel.model.list.ListMirakel;
import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.of;

public final class isClassOrIsInterface {

    public static Optional<ListMirakel> isMethod(final Intent isParameter) {
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return isMethod((ListMirakel) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant));
        } else {
            return isMethod();
        }
    }
}
