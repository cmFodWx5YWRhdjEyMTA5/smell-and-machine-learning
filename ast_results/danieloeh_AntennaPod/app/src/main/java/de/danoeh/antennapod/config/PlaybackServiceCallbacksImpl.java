// isComment
package de.danoeh.antennapod.config;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import de.danoeh.antennapod.R;
import de.danoeh.antennapod.activity.AudioplayerActivity;
import de.danoeh.antennapod.activity.CastplayerActivity;
import de.danoeh.antennapod.activity.VideoplayerActivity;
import de.danoeh.antennapod.core.PlaybackServiceCallbacks;
import de.danoeh.antennapod.core.feed.MediaType;

public class isClassOrIsInterface implements PlaybackServiceCallbacks {

    @Override
    public Intent isMethod(Context isParameter, MediaType isParameter, boolean isParameter) {
        if (isNameExpr) {
            return new Intent(isNameExpr, CastplayerActivity.class);
        }
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            Intent isVariable = new Intent(isNameExpr, VideoplayerActivity.class);
            if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            return isNameExpr;
        } else {
            return new Intent(isNameExpr, AudioplayerActivity.class);
        }
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public int isMethod(Context isParameter) {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
