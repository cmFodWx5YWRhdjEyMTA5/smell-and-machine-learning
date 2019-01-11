// isComment
package de.danoeh.antennapod.config;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import org.shredzone.flattr4j.oauth.AccessToken;
import de.danoeh.antennapod.BuildConfig;
import de.danoeh.antennapod.activity.FlattrAuthActivity;
import de.danoeh.antennapod.activity.MainActivity;
import de.danoeh.antennapod.core.FlattrCallbacks;

public class isClassOrIsInterface implements FlattrCallbacks {

    private static final String isVariable = "isStringConstant";

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Intent isMethod(Context isParameter) {
        return new Intent(isNameExpr, FlattrAuthActivity.class);
    }

    @Override
    public PendingIntent isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr, isIntegerConstant, new Intent(isNameExpr, MainActivity.class), isIntegerConstant);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(AccessToken isParameter) {
        FlattrAuthActivity isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        } else {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
    }
}
