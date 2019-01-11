// isComment
package com.codebutler.farebot.card.desfire.raw;

import android.support.annotation.NonNull;
import com.codebutler.farebot.card.desfire.DesfireApplication;
import com.codebutler.farebot.card.desfire.DesfireFile;
import com.google.auto.value.AutoValue;
import com.google.common.base.Function;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static RawDesfireApplication isMethod(int isParameter, @NonNull List<RawDesfireFile> isParameter) {
        return new AutoValue_RawDesfireApplication(isNameExpr, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<RawDesfireApplication> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawDesfireApplication.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    public DesfireApplication isMethod() {
        List<DesfireFile> isVariable = isMethod(isMethod(isMethod(), new Function<RawDesfireFile, DesfireFile>() {

            @Override
            public DesfireFile isMethod(RawDesfireFile isParameter) {
                return isNameExpr.isMethod();
            }
        }));
        return isNameExpr.isMethod(isMethod(), isNameExpr);
    }

    public abstract int isMethod();

    @NonNull
    public abstract List<RawDesfireFile> isMethod();
}
