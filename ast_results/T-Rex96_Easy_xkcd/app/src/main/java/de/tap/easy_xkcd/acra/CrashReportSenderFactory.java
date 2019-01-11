// isComment
package de.tap.easy_xkcd.acra;

import android.content.Context;
import org.acra.config.ACRAConfiguration;
import org.acra.sender.ReportSender;
import org.acra.sender.ReportSenderFactory;
import androidx.annotation.NonNull;

public class isClassOrIsInterface implements ReportSenderFactory {

    @NonNull
    @Override
    public ReportSender isMethod(@NonNull Context isParameter, @NonNull ACRAConfiguration isParameter) {
        return new CrashReportSender(isNameExpr);
    }
}
