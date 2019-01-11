// isComment
package cgeo.geocaching;

import cgeo.geocaching.activity.AbstractActionBarActivity;
import cgeo.geocaching.models.Image;
import cgeo.geocaching.ui.ImagesList;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import io.reactivex.disposables.CompositeDisposable;
import org.apache.commons.collections4.CollectionUtils;

public class isClassOrIsInterface extends AbstractActionBarActivity {

    private List<Image> isVariable;

    private ImagesList isVariable;

    private final CompositeDisposable isVariable = new CompositeDisposable();

    @Override
    public void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        final Bundle isVariable = isMethod().isMethod();
        String isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        if (isNameExpr == null || isNameExpr == null) {
            isMethod("isStringConstant");
            isMethod();
            return;
        }
        // isComment
        isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isNameExpr = new ImagesList(this, isNameExpr, null);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isMethod();
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr));
    }

    @Override
    public void isMethod() {
        // isComment
        isNameExpr.isMethod();
        super.isMethod();
    }

    public static void isMethod(final Context isParameter, final String isParameter, final List<Image> isParameter) {
        final Intent isVariable = new Intent(isNameExpr, ImagesActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        // isComment
        final ArrayList<Image> isVariable = new ArrayList<>(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final ContextMenu isParameter, final View isParameter, final ContextMenuInfo isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return true;
        }
        return super.isMethod(isNameExpr);
    }
}
