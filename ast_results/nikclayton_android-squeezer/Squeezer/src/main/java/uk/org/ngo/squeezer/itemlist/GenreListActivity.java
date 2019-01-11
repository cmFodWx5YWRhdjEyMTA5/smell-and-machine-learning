// isComment
package uk.org.ngo.squeezer.itemlist;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import uk.org.ngo.squeezer.framework.BaseListActivity;
import uk.org.ngo.squeezer.framework.ItemView;
import uk.org.ngo.squeezer.model.Genre;
import uk.org.ngo.squeezer.service.ISqueezeService;

public class isClassOrIsInterface extends BaseListActivity<Genre> {

    @Override
    public ItemView<Genre> isMethod() {
        return new GenreView(this);
    }

    @Override
    protected void isMethod(@NonNull ISqueezeService isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr, null, this);
    }

    public static void isMethod(Context isParameter) {
        final Intent isVariable = new Intent(isNameExpr, GenreListActivity.class);
        isNameExpr.isMethod(isNameExpr);
    }
}
