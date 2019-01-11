// isComment
package com.anysoftkeyboard.ui.settings.wordseditor;

import android.support.annotation.NonNull;
import com.anysoftkeyboard.RobolectricFragmentTestCase;

public class isClassOrIsInterface extends RobolectricFragmentTestCase<AbbreviationDictionaryEditorFragment> {

    @NonNull
    @Override
    protected AbbreviationDictionaryEditorFragment isMethod() {
        return new AbbreviationDictionaryEditorFragment();
    }
}
