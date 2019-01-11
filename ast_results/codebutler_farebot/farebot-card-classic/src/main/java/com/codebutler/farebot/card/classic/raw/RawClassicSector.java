// isComment
package com.codebutler.farebot.card.classic.raw;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.card.classic.ClassicBlock;
import com.codebutler.farebot.card.classic.ClassicSector;
import com.codebutler.farebot.card.classic.DataClassicSector;
import com.codebutler.farebot.card.classic.InvalidClassicSector;
import com.codebutler.farebot.card.classic.UnauthorizedClassicSector;
import com.google.auto.value.AutoValue;
import com.google.common.base.Function;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;

@AutoValue
public abstract class isClassOrIsInterface {

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    @NonNull
    public static TypeAdapter<RawClassicSector> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawClassicSector.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    public static RawClassicSector isMethod(int isParameter, @NonNull List<RawClassicBlock> isParameter) {
        return new AutoValue_RawClassicSector(isNameExpr, isNameExpr, isNameExpr, null);
    }

    @NonNull
    public static RawClassicSector isMethod(int isParameter, @NonNull String isParameter) {
        return new AutoValue_RawClassicSector(isNameExpr, isNameExpr, null, isNameExpr);
    }

    @NonNull
    public static RawClassicSector isMethod(int isParameter) {
        return new AutoValue_RawClassicSector(isNameExpr, isNameExpr, null, null);
    }

    @NonNull
    public ClassicSector isMethod() {
        switch(isMethod()) {
            case isNameExpr:
                List<ClassicBlock> isVariable = isMethod(isMethod(isMethod(), new Function<RawClassicBlock, ClassicBlock>() {

                    @Override
                    public ClassicBlock isMethod(RawClassicBlock isParameter) {
                        return isNameExpr.isMethod();
                    }
                }));
                return isNameExpr.isMethod(isMethod(), isNameExpr);
            case isNameExpr:
                return isNameExpr.isMethod(isMethod(), isMethod());
            case isNameExpr:
                return isNameExpr.isMethod(isMethod());
        }
        throw new RuntimeException("isStringConstant");
    }

    @NonNull
    public abstract String isMethod();

    public abstract int isMethod();

    @Nullable
    public abstract List<RawClassicBlock> isMethod();

    @Nullable
    public abstract String isMethod();
}
