// isComment
package pw.thedrhax.mosmetro;

import android.app.Application;
import android.content.Context;
import org.acra.ACRA;
import org.acra.annotation.AcraCore;
import org.acra.data.StringFormat;
import pw.thedrhax.mosmetro.acra.HockeySenderFactory;
import pw.thedrhax.util.Logger;
import static org.acra.ReportField.*;

@AcraCore(buildConfigClass = BuildConfig.class, reportSenderFactoryClasses = { HockeySenderFactory.class }, reportFormat = isNameExpr.isFieldAccessExpr, reportContent = { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr }, applicationLogFile = isNameExpr.isFieldAccessExpr, applicationLogFileLines = isIntegerConstant)
public class isClassOrIsInterface extends Application {

    @Override
    protected void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
        if (!isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
