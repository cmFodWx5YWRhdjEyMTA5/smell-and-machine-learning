// isComment
package uk.org.ngo.squeezer.itemlist;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import uk.org.ngo.squeezer.R;
import uk.org.ngo.squeezer.framework.BaseListActivity;
import uk.org.ngo.squeezer.framework.ItemView;
import uk.org.ngo.squeezer.model.Plugin;
import uk.org.ngo.squeezer.service.ISqueezeService;

/*isComment*/
public class isClassOrIsInterface extends BaseListActivity<Plugin> {

    @Override
    public ItemView<Plugin> isMethod() {
        return new RadioView(this);
    }

    @Override
    protected void isMethod(@NonNull ISqueezeService isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr, this);
    }

    public static void isMethod(Activity isParameter) {
        final Intent isVariable = new Intent(isNameExpr, RadioListActivity.class);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
