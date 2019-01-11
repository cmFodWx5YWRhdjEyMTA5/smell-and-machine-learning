// isComment
package com.anysoftkeyboard.devicespecific;

import android.annotation.TargetApi;
import android.database.ContentObserver;
import android.os.Build;
import com.anysoftkeyboard.dictionaries.BTreeDictionary;
import com.anysoftkeyboard.dictionaries.DictionaryContentObserverAPI16;

@TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
public class isClassOrIsInterface extends DeviceSpecificV14 {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public ContentObserver isMethod(BTreeDictionary isParameter) {
        return new DictionaryContentObserverAPI16(isNameExpr);
    }
}
