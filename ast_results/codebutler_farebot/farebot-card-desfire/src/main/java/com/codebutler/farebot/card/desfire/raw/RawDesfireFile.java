// isComment
package com.codebutler.farebot.card.desfire.raw;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.codebutler.farebot.base.util.ByteArray;
import com.codebutler.farebot.card.desfire.DesfireFile;
import com.codebutler.farebot.card.desfire.DesfireFileSettings;
import com.codebutler.farebot.card.desfire.InvalidDesfireFile;
import com.codebutler.farebot.card.desfire.RecordDesfireFile;
import com.codebutler.farebot.card.desfire.StandardDesfireFile;
import com.codebutler.farebot.card.desfire.UnauthorizedDesfireFile;
import com.codebutler.farebot.card.desfire.ValueDesfireFile;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import static com.codebutler.farebot.card.desfire.DesfireFileSettings.BACKUP_DATA_FILE;
import static com.codebutler.farebot.card.desfire.DesfireFileSettings.CYCLIC_RECORD_FILE;
import static com.codebutler.farebot.card.desfire.DesfireFileSettings.LINEAR_RECORD_FILE;
import static com.codebutler.farebot.card.desfire.DesfireFileSettings.STANDARD_DATA_FILE;
import static com.codebutler.farebot.card.desfire.DesfireFileSettings.VALUE_FILE;

@AutoValue
public abstract class isClassOrIsInterface {

    @NonNull
    public static RawDesfireFile isMethod(int isParameter, @NonNull RawDesfireFileSettings isParameter, @NonNull byte[] isParameter) {
        return new AutoValue_RawDesfireFile(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr), null);
    }

    @NonNull
    public static RawDesfireFile isMethod(int isParameter, @NonNull RawDesfireFileSettings isParameter, @NonNull String isParameter) {
        Error isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return new AutoValue_RawDesfireFile(isNameExpr, isNameExpr, null, isNameExpr);
    }

    @NonNull
    public static RawDesfireFile isMethod(int isParameter, @NonNull RawDesfireFileSettings isParameter, @NonNull String isParameter) {
        Error isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return new AutoValue_RawDesfireFile(isNameExpr, isNameExpr, null, isNameExpr);
    }

    @NonNull
    public static TypeAdapter<RawDesfireFile> isMethod(@NonNull Gson isParameter) {
        return new AutoValue_RawDesfireFile.GsonTypeAdapter(isNameExpr);
    }

    @NonNull
    public DesfireFile isMethod() {
        Error isVariable = isMethod();
        if (isNameExpr != null) {
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                return isNameExpr.isMethod(isMethod(), isMethod().isMethod(), isNameExpr.isMethod());
            } else {
                return isNameExpr.isMethod(isMethod(), isMethod().isMethod(), isNameExpr.isMethod());
            }
        }
        ByteArray isVariable = isMethod();
        if (isNameExpr == null) {
            throw new RuntimeException("isStringConstant");
        }
        DesfireFileSettings isVariable = isMethod().isMethod();
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
            case isNameExpr:
                return isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr.isMethod());
            case isNameExpr:
            case isNameExpr:
                return isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr.isMethod());
            case isNameExpr:
                return isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr.isMethod());
            default:
                throw new RuntimeException("isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod()));
        }
    }

    public abstract int isMethod();

    public abstract RawDesfireFileSettings isMethod();

    @Nullable
    public abstract ByteArray isMethod();

    @Nullable
    public abstract Error isMethod();

    @AutoValue
    public abstract static class isClassOrIsInterface {

        public static final int isVariable = isIntegerConstant;

        public static final int isVariable = isIntegerConstant;

        public static final int isVariable = isIntegerConstant;

        @NonNull
        static Error isMethod(int isParameter, @NonNull String isParameter) {
            return new AutoValue_RawDesfireFile_Error(isNameExpr, isNameExpr);
        }

        @NonNull
        public static TypeAdapter<Error> isMethod(@NonNull Gson isParameter) {
            return new AutoValue_RawDesfireFile_Error.GsonTypeAdapter(isNameExpr);
        }

        public abstract int isMethod();

        @Nullable
        public abstract String isMethod();
    }
}
