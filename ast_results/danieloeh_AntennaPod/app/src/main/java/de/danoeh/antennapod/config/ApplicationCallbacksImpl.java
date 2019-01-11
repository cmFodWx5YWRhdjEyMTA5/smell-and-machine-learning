// isComment
package de.danoeh.antennapod.config;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import de.danoeh.antennapod.PodcastApp;
import de.danoeh.antennapod.activity.StorageErrorActivity;
import de.danoeh.antennapod.core.ApplicationCallbacks;

public class isClassOrIsInterface implements ApplicationCallbacks {

    @Override
    public Application isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public Intent isMethod(Context isParameter) {
        return new Intent(isNameExpr, StorageErrorActivity.class);
    }
}
