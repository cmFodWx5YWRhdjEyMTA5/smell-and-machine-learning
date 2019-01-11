// isComment
package com.anysoftkeyboard.devicespecific;

import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Canvas;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.GestureDetector;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.anysoftkeyboard.dictionaries.BTreeDictionary;
import com.anysoftkeyboard.keyboards.KeyboardAddOnAndBuilder;
import java.util.List;

public interface isClassOrIsInterface {

    String isMethod();

    GestureDetector isMethod(Context isParameter, AskOnGestureListener isParameter);

    void isMethod(InputConnection isParameter, int isParameter, CharSequence isParameter, CharSequence isParameter);

    boolean isMethod(Canvas isParameter);

    void isMethod(@NonNull InputMethodManager isParameter, @NonNull String isParameter, @NonNull List<KeyboardAddOnAndBuilder> isParameter);

    void isMethod(@NonNull InputMethodManager isParameter, @NonNull String isParameter, @NonNull IBinder isParameter, @Nullable String isParameter, @NonNull CharSequence isParameter);

    void isMethod();

    ContentObserver isMethod(BTreeDictionary isParameter);

    Clipboard isMethod(Context isParameter);
}
