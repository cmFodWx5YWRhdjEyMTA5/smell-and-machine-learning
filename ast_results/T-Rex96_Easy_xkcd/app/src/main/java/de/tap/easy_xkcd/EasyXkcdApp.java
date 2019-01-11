// isComment
package de.tap.easy_xkcd;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.tap.xkcd_reader.BuildConfig;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;
import timber.log.Timber;

@ReportsCrashes(mailTo = "isStringConstant", mode = isNameExpr.isFieldAccessExpr, reportDialogClass = de.tap.easy_xkcd.acra.CrashReportActivity.class, reportSenderFactoryClasses = de.tap.easy_xkcd.acra.CrashReportSenderFactory.class, customReportContent = { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr })
public class isClassOrIsInterface extends Application {

    @Override
    protected void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(new Timber.DebugTree());
        } else {
            isNameExpr.isMethod(new NoDebugTree());
        }
    }

    private class isClassOrIsInterface extends Timber.DebugTree {

        @Override
        protected void isMethod(final int isParameter, final String isParameter, final String isParameter, final Throwable isParameter) {
            // isComment
            if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
        }
    }
}
