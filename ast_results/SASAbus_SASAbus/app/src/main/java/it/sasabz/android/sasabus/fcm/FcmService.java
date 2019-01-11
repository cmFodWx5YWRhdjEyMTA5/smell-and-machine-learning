// isComment
package it.sasabz.android.sasabus.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import it.sasabz.android.sasabus.fcm.command.ConfigCommand;
import it.sasabz.android.sasabus.fcm.command.FcmCommand;
import it.sasabz.android.sasabus.fcm.command.LogoutCommand;
import it.sasabz.android.sasabus.fcm.command.NewsCommand;
import it.sasabz.android.sasabus.fcm.command.NotificationCommand;
import it.sasabz.android.sasabus.fcm.command.QrCodeCommand;
import it.sasabz.android.sasabus.fcm.command.SyncCommand;
import it.sasabz.android.sasabus.fcm.command.TestCommand;
import it.sasabz.android.sasabus.fcm.command.TrafficLightCommand;
import timber.log.Timber;

/**
 * isComment
 */
public class isClassOrIsInterface extends FirebaseMessagingService {

    private static final Map<String, FcmCommand> isVariable;

    static {
        Map<String, FcmCommand> isVariable = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", new TestCommand());
        isNameExpr.isMethod("isStringConstant", new SyncCommand());
        isNameExpr.isMethod("isStringConstant", new NotificationCommand());
        isNameExpr.isMethod("isStringConstant", new NewsCommand());
        isNameExpr.isMethod("isStringConstant", new TrafficLightCommand());
        isNameExpr.isMethod("isStringConstant", new ConfigCommand());
        isNameExpr.isMethod("isStringConstant", new LogoutCommand());
        isNameExpr.isMethod("isStringConstant", new QrCodeCommand());
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(RemoteMessage isParameter) {
        isNameExpr.isMethod("isStringConstant");
        String isVariable = isNameExpr.isMethod().isMethod("isStringConstant");
        FcmCommand isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr);
        } else {
            isNameExpr.isMethod(this, isNameExpr.isMethod());
        }
    }
}
