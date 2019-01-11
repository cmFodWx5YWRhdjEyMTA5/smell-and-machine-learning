// isComment
package com.anysoftkeyboard.devicespecific;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Canvas;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.GestureDetector;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.anysoftkeyboard.dictionaries.BTreeDictionary;
import com.anysoftkeyboard.dictionaries.DictionaryContentObserver;
import com.anysoftkeyboard.keyboards.KeyboardAddOnAndBuilder;
import java.util.List;

@TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
public class isClassOrIsInterface implements DeviceSpecific {

    public isConstructor() {
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public GestureDetector isMethod(Context isParameter, AskOnGestureListener isParameter) {
        return new AskV8GestureDetector(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(InputConnection isParameter, int isParameter, CharSequence isParameter, CharSequence isParameter) {
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
    }

    @Override
    public boolean isMethod(Canvas isParameter) {
        return true;
    }

    @Override
    public void isMethod(@NonNull InputMethodManager isParameter, @NonNull String isParameter, @NonNull List<KeyboardAddOnAndBuilder> isParameter) {
    // isComment
    }

    @Override
    public void isMethod(@NonNull InputMethodManager isParameter, @NonNull String isParameter, @NonNull IBinder isParameter, @Nullable String isParameter, @NonNull CharSequence isParameter) {
    // isComment
    }

    @Override
    public void isMethod() {
    /*isComment*/
    }

    @Override
    public ContentObserver isMethod(BTreeDictionary isParameter) {
        return new DictionaryContentObserver(isNameExpr);
    }

    @Override
    public Clipboard isMethod(Context isParameter) {
        return new ClipboardV3(isNameExpr);
    }
}
