// isComment
package uk.org.ngo.squeezer.itemlist;

import android.app.Activity;
import android.content.Intent;
import uk.org.ngo.squeezer.framework.ItemView;
import uk.org.ngo.squeezer.model.Plugin;

public class isClassOrIsInterface extends PluginListActivity {

    @Override
    public ItemView<Plugin> isMethod() {
        return new RadioView(this);
    }

    public static void isMethod(Activity isParameter) {
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    public static void isMethod(Activity isParameter, Plugin isParameter) {
        final Intent isVariable = new Intent(isNameExpr, ApplicationListActivity.class);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
