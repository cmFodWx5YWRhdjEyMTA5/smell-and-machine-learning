// isComment
package net.grandcentrix.tray;

import net.grandcentrix.tray.core.AbstractTrayPreference;
import net.grandcentrix.tray.core.Preferences;
import net.grandcentrix.tray.core.TrayStorage;
import net.grandcentrix.tray.provider.ContentProviderStorage;
import android.content.Context;
import android.support.annotation.NonNull;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractTrayPreference<ContentProviderStorage> {

    public isConstructor(@NonNull final Context isParameter, @NonNull final String isParameter, final int isParameter, final TrayStorage.Type isParameter) {
        super(new ContentProviderStorage(isNameExpr, isNameExpr, isNameExpr), isNameExpr);
    }

    public isConstructor(@NonNull final Context isParameter, @NonNull final String isParameter, final int isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public void isMethod(final String isParameter, final TrayStorage.Type isParameter) {
        super.isMethod(new ContentProviderStorage(isMethod(), isNameExpr, isNameExpr));
    }

    public void isMethod(final String isParameter) {
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    protected Context isMethod() {
        return isMethod().isMethod();
    }
}
