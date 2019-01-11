// isComment
package com.sensirion.smartgadget.view.history.graph.value_formatter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

/**
 * isComment
 */
public class isClassOrIsInterface extends Format {

    @NonNull
    @Override
    public StringBuffer isMethod(final Object isParameter, @NonNull final StringBuffer isParameter, @Nullable final FieldPosition isParameter) {
        return isNameExpr;
    }

    @Nullable
    @Override
    public Object isMethod(final String isParameter, @Nullable final ParsePosition isParameter) {
        return null;
    }
}
