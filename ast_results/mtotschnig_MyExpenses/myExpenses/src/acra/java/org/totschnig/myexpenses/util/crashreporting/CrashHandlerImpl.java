// isComment
package org.totschnig.myexpenses.util.crashreporting;

import android.content.Context;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.config.ACRAConfigurationException;
import org.acra.config.CoreConfigurationBuilder;
import org.acra.config.DialogConfigurationBuilder;
import org.acra.config.MailSenderConfigurationBuilder;
import org.acra.data.StringFormat;
import org.totschnig.myexpenses.BuildConfig;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.util.Utils;
import timber.log.Timber;

public class isClassOrIsInterface extends CrashHandler {

    @Override
    public void isMethod(MyApplication isParameter) {
        CoreConfigurationBuilder isVariable = new CoreConfigurationBuilder(isNameExpr).isMethod(true).isMethod(BuildConfig.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true).isMethod(isNameExpr.isFieldAccessExpr, true).isMethod("isStringConstant", "isStringConstant").isMethod(DialogConfigurationBuilder.class).isMethod(true).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(MailSenderConfigurationBuilder.class).isMethod(true).isMethod(true).isMethod("isStringConstant");
        try {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        } catch (ACRAConfigurationException isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    void isMethod(Context isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(String isParameter, String isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
    }
}
