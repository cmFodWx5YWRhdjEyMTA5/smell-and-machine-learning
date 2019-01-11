// isComment
package com.anysoftkeyboard.dictionaries.prefsprovider;

import android.content.Context;
import android.support.annotation.NonNull;
import com.anysoftkeyboard.dictionaries.BTreeDictionary;
import com.anysoftkeyboard.dictionaries.UserDictionary;
import com.anysoftkeyboard.dictionaries.content.AndroidUserDictionary;
import com.anysoftkeyboard.dictionaries.sqlite.FallbackUserDictionary;

class isClassOrIsInterface extends UserDictionary {

    private final BTreeDictionary.WordReadListener isVariable;

    public isConstructor(Context isParameter, String isParameter, BTreeDictionary.WordReadListener isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @NonNull
    @Override
    protected AndroidUserDictionary isMethod(Context isParameter, String isParameter) {
        return new TappedAndroidUserDictionary(isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    protected FallbackUserDictionary isMethod(Context isParameter, String isParameter) {
        return new TappedUserFallbackUserDictionary(isNameExpr, isNameExpr, isNameExpr);
    }
}
