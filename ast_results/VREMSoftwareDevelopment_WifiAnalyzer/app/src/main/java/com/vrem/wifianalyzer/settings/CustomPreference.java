// isComment
package com.vrem.wifianalyzer.settings;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.preference.ListPreference;
import android.util.AttributeSet;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import java.util.ArrayList;
import java.util.List;

class isClassOrIsInterface extends ListPreference {

    isConstructor(@NonNull Context isParameter, AttributeSet isParameter, @NonNull List<Data> isParameter, @NonNull String isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod(isMethod(isNameExpr));
        isMethod(isMethod(isNameExpr));
        isMethod(isNameExpr);
    }

    @NonNull
    private CharSequence[] isMethod(@NonNull List<Data> isParameter) {
        return new ArrayList<>(isNameExpr.isMethod(isNameExpr, new ToCode())).isMethod(new CharSequence[] {});
    }

    @NonNull
    private CharSequence[] isMethod(@NonNull List<Data> isParameter) {
        return new ArrayList<>(isNameExpr.isMethod(isNameExpr, new ToName())).isMethod(new CharSequence[] {});
    }

    private static class isClassOrIsInterface implements Transformer<Data, String> {

        @Override
        public String isMethod(Data isParameter) {
            return isNameExpr.isMethod();
        }
    }

    private static class isClassOrIsInterface implements Transformer<Data, String> {

        @Override
        public String isMethod(Data isParameter) {
            return isNameExpr.isMethod();
        }
    }
}
