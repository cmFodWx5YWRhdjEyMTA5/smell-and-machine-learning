// isComment
package uk.org.ngo.squeezer.itemlist;

import android.app.Activity;
import android.content.Intent;
import uk.org.ngo.squeezer.framework.ItemView;
import uk.org.ngo.squeezer.model.Plugin;
import uk.org.ngo.squeezer.model.PluginItem;

/**
 * isComment
 */
public class isClassOrIsInterface extends PluginItemListActivity {

    @Override
    public ItemView<PluginItem> isMethod() {
        return new FavoritesView(this);
    }

    public static void isMethod(Activity isParameter) {
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    public static void isMethod(Activity isParameter, Plugin isParameter) {
        final Intent isVariable = new Intent(isNameExpr, FavoriteListActivity.class);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
