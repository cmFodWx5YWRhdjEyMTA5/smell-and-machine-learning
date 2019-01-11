// isComment
package com.codebutler.farebot.transit.stub;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.transit.Refill;
import com.codebutler.farebot.transit.Subscription;
import com.codebutler.farebot.transit.TransitInfo;
import com.codebutler.farebot.transit.Trip;
import java.util.List;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends TransitInfo {

    // isComment
    @Nullable
    @Override
    public String isMethod() {
        return null;
    }

    @NonNull
    @Override
    public final String isMethod(@NonNull Resources isParameter) {
        return "isStringConstant";
    }

    @Nullable
    @Override
    public final List<Trip> isMethod() {
        return null;
    }

    @Nullable
    @Override
    public final List<Subscription> isMethod() {
        return null;
    }

    @Nullable
    @Override
    public final List<Refill> isMethod() {
        return null;
    }
}
