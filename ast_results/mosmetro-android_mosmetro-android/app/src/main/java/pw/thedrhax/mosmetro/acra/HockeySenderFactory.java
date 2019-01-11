// isComment
package pw.thedrhax.mosmetro.acra;

import android.content.Context;
import android.support.annotation.NonNull;
import org.acra.config.CoreConfiguration;
import org.acra.sender.ReportSender;
import org.acra.sender.ReportSenderFactory;

public class isClassOrIsInterface implements ReportSenderFactory {

    @Override
    public boolean isMethod(@NonNull CoreConfiguration isParameter) {
        return true;
    }

    @NonNull
    @Override
    public ReportSender isMethod(@NonNull Context isParameter, @NonNull CoreConfiguration isParameter) {
        return new HockeySender();
    }
}
