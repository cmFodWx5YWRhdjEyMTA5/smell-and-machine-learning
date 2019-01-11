// isComment
package monakhv.android.samlib;

import android.content.Context;
import android.support.v4.app.Fragment;
import monakhv.android.samlib.data.DataExportImport;
import monakhv.android.samlib.data.SettingsHelper;
import monakhv.samlib.db.AuthorController;
import monakhv.samlib.service.*;
import rx.Subscription;

/**
 * isComment
 */
public class isClassOrIsInterface extends Fragment {

    public interface isClassOrIsInterface {

        SettingsHelper isMethod();

        DataExportImport isMethod();

        AuthorController isMethod();

        SamlibOperation isMethod();

        AuthorSearchService isMethod();

        GuiEventBus isMethod();

        BookDownloadService isMethod();

        void isMethod(Subscription isParameter);
    }

    private DaggerCaller isVariable;

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        if (!(isNameExpr instanceof DaggerCaller)) {
            throw new IllegalStateException("isStringConstant");
        }
        isNameExpr = (DaggerCaller) isNameExpr;
    }

    protected SettingsHelper isMethod() {
        return isNameExpr.isMethod();
    }

    protected AuthorController isMethod() {
        return isNameExpr.isMethod();
    }

    protected SamlibOperation isMethod() {
        return isNameExpr.isMethod();
    }

    protected GuiEventBus isMethod() {
        return isNameExpr.isMethod();
    }

    protected AuthorSearchService isMethod() {
        return isNameExpr.isMethod();
    }

    protected BookDownloadService isMethod() {
        return isNameExpr.isMethod();
    }

    protected void isMethod(Subscription isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
