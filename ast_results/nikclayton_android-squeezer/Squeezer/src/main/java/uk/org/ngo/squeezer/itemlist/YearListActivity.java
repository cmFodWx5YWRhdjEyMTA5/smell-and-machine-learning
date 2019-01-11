// isComment
package uk.org.ngo.squeezer.itemlist;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import uk.org.ngo.squeezer.framework.BaseListActivity;
import uk.org.ngo.squeezer.framework.ItemView;
import uk.org.ngo.squeezer.model.Year;
import uk.org.ngo.squeezer.service.ISqueezeService;

public class isClassOrIsInterface extends BaseListActivity<Year> {

    @Override
    public ItemView<Year> isMethod() {
        return new YearView(this);
    }

    @Override
    protected void isMethod(@NonNull ISqueezeService isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr, this);
    }

    public static void isMethod(Context isParameter) {
        final Intent isVariable = new Intent(isNameExpr, YearListActivity.class);
        isNameExpr.isMethod(isNameExpr);
    }
}
