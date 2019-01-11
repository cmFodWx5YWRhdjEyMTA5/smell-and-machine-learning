// isComment
package com.codebutler.farebot.card;

import android.support.annotation.NonNull;
import com.codebutler.farebot.base.util.ByteArray;
import java.util.Date;

public interface isClassOrIsInterface<T extends Card> {

    @NonNull
    CardType isMethod();

    @NonNull
    ByteArray isMethod();

    @NonNull
    Date isMethod();

    boolean isMethod();

    @NonNull
    T isMethod();
}
