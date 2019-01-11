// isComment
package com.codebutler.farebot.transit;

import android.support.annotation.NonNull;
import com.codebutler.farebot.card.Card;

public interface isClassOrIsInterface<C extends Card, T extends TransitInfo> {

    boolean isMethod(@NonNull C isParameter);

    @NonNull
    TransitIdentity isMethod(@NonNull C isParameter);

    @NonNull
    T isMethod(@NonNull C isParameter);
}
