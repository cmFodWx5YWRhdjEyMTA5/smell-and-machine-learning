// isComment
package com.vrem.wifianalyzer.navigation;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.MainActivity;
import com.vrem.wifianalyzer.gestures.GestureOnTouchListener;
import com.vrem.wifianalyzer.gestures.SwipeOnGestureListener;

public class isClassOrIsInterface extends GestureOnTouchListener {

    public isConstructor(@NonNull MainActivity isParameter) {
        super(isNameExpr, new SwipeOnGestureListener(new NavigationSwipe(isNameExpr)));
    }
}
