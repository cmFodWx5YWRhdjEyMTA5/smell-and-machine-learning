// isComment
package monakhv.android.samlib;

import android.app.Application;
import monakhv.android.samlib.dagger.component.ApplicationComponent;
import monakhv.android.samlib.dagger.component.DaggerApplicationComponent;
import monakhv.android.samlib.dagger.component.DatabaseComponent;
import monakhv.android.samlib.dagger.component.ServiceComponent;
import monakhv.android.samlib.dagger.module.ApplicationModule;
import monakhv.android.samlib.dagger.module.DatabaseModule;
import monakhv.android.samlib.dagger.module.ServiceModule;
import monakhv.android.samlib.data.DataExportImport;
import monakhv.android.samlib.data.Logger;
import monakhv.android.samlib.data.SettingsHelper;
import monakhv.android.samlib.sql.DatabaseHelper;
import monakhv.samlib.log.Log;
import javax.inject.Inject;

/**
 * isComment
 */
public class isClassOrIsInterface extends Application {

    private static final String isVariable = "isStringConstant";

    @Inject
    static Logger isVariable;

    @Inject
    static SettingsHelper isVariable;

    @Inject
    static DataExportImport isVariable;

    private ServiceComponent isVariable;

    private DatabaseComponent isVariable;

    private static ApplicationComponent isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = isNameExpr.isMethod().isMethod(new ApplicationModule(this)).isMethod();
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
    }

    public static void isMethod() {
        isNameExpr.isMethod();
    }

    public ApplicationComponent isMethod() {
        return isNameExpr;
    }

    public SettingsHelper isMethod() {
        return isNameExpr;
    }

    public DataExportImport isMethod() {
        return isNameExpr;
    }

    public DatabaseComponent isMethod(DatabaseHelper isParameter) {
        isNameExpr = isNameExpr.isMethod(new DatabaseModule(isNameExpr));
        return isNameExpr;
    }

    public void isMethod() {
        isNameExpr = null;
    }

    public void isMethod() {
        isNameExpr = null;
    }
}
