// isComment
package de.danoeh.antennapod.config;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import de.danoeh.antennapod.activity.MainActivity;
import de.danoeh.antennapod.core.GpodnetCallbacks;

public class isClassOrIsInterface implements GpodnetCallbacks {

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public PendingIntent isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr, isIntegerConstant, new Intent(isNameExpr, MainActivity.class), isNameExpr.isFieldAccessExpr);
    }
}
