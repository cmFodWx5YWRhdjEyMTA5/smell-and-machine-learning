// isComment
package com.fsck.k9.view;

import android.support.annotation.AttrRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import com.fsck.k9.ui.R;
import com.fsck.k9.mailstore.CryptoResultAnnotation;
import org.openintents.openpgp.OpenPgpDecryptionResult;
import org.openintents.openpgp.OpenPgpSignatureResult;

public enum MessageCryptoDisplayStatus {

    LOADING(true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    CANCELLED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    DISABLED(true, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null),
    UNENCRYPTED_SIGN_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    INCOMPLETE_SIGNED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNENCRYPTED_SIGN_VERIFIED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNENCRYPTED_SIGN_UNVERIFIED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null),
    UNENCRYPTED_SIGN_UNKNOWN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNENCRYPTED_SIGN_MISMATCH(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNENCRYPTED_SIGN_EXPIRED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNENCRYPTED_SIGN_REVOKED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNENCRYPTED_SIGN_INSECURE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_SIGN_VERIFIED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_SIGN_UNVERIFIED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null),
    ENCRYPTED_SIGN_UNKNOWN(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_SIGN_MISMATCH(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_SIGN_EXPIRED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_SIGN_REVOKED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_SIGN_INSECURE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_SIGN_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_INSECURE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_UNSIGNED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    INCOMPLETE_ENCRYPTED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ENCRYPTED_NO_PROVIDER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNSUPPORTED_ENCRYPTED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    UNSUPPORTED_SIGNED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    @AttrRes
    public final int isVariable;

    @DrawableRes
    public final int isVariable;

    @StringRes
    public final Integer isVariable;

    @StringRes
    public final Integer isVariable;

    public boolean isVariable;

    isConstructor(@AttrRes int isParameter, @DrawableRes int isParameter, @StringRes int isParameter, Integer isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(boolean isParameter, @AttrRes int isParameter, @DrawableRes int isParameter, @StringRes int isParameter, Integer isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(boolean isParameter, @AttrRes int isParameter, @DrawableRes int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = null;
        this.isFieldAccessExpr = null;
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    public static MessageCryptoDisplayStatus isMethod(CryptoResultAnnotation isParameter) {
        if (isNameExpr == null) {
            return isNameExpr;
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                return isMethod(isNameExpr);
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
        }
        throw new IllegalStateException("isStringConstant");
    }

    @NonNull
    private static MessageCryptoDisplayStatus isMethod(CryptoResultAnnotation isParameter) {
        OpenPgpSignatureResult isVariable = isNameExpr.isMethod();
        OpenPgpDecryptionResult isVariable = isNameExpr.isMethod();
        if (isNameExpr == null || isNameExpr == null) {
            throw new AssertionError("isStringConstant");
        }
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod()) {
            CryptoResultAnnotation isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod()) {
                isNameExpr = isNameExpr.isMethod();
                if (isNameExpr == null) {
                    throw new AssertionError("isStringConstant");
                }
            }
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr:
                return isMethod(isNameExpr);
            case isNameExpr.isFieldAccessExpr:
                return isMethod(isNameExpr);
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
        }
        throw new AssertionError("isStringConstant");
    }

    @NonNull
    private static MessageCryptoDisplayStatus isMethod(OpenPgpSignatureResult isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                switch(isNameExpr.isMethod()) {
                    case isNameExpr:
                        return isNameExpr;
                    case isNameExpr:
                        return isNameExpr;
                    case isNameExpr:
                        return isNameExpr;
                    case isNameExpr:
                        return isNameExpr;
                }
                throw new IllegalStateException("isStringConstant");
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            default:
                throw new IllegalStateException("isStringConstant");
        }
    }

    @NonNull
    private static MessageCryptoDisplayStatus isMethod(OpenPgpSignatureResult isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                switch(isNameExpr.isMethod()) {
                    case isNameExpr:
                        return isNameExpr;
                    case isNameExpr:
                        return isNameExpr;
                    case isNameExpr:
                        return isNameExpr;
                    case isNameExpr:
                        return isNameExpr;
                }
                throw new IllegalStateException("isStringConstant");
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr:
                return isNameExpr;
            default:
                throw new IllegalStateException("isStringConstant");
        }
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
        }
        return true;
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
        }
        return true;
    }

    public boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
                return true;
        }
        return true;
    }
}
