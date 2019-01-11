// isComment
package uk.org.ngo.squeezer.framework;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.support.annotation.NonNull;
import uk.org.ngo.squeezer.Preferences;
import uk.org.ngo.squeezer.itemlist.action.PlayableItemAction;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T extends PlaylistItem> extends BaseItemView<T> implements OnSharedPreferenceChangeListener {

    private final Preferences isVariable;

    @NonNull
    protected PlayableItemAction isVariable;

    public isConstructor(ItemListActivity isParameter) {
        super(isNameExpr);
        isNameExpr = new Preferences(isNameExpr);
        isNameExpr.isMethod(this);
        isNameExpr = isMethod();
    }

    @Override
    public void isMethod(SharedPreferences isParameter, String isParameter) {
        isNameExpr = isMethod();
    }

    private final PlayableItemAction isMethod() {
        final PlayableItemAction.Type isVariable = isNameExpr.isMethod(isMethod());
        return isNameExpr.isMethod(isMethod(), isNameExpr);
    }

    @Override
    public void isMethod(int isParameter, T isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
