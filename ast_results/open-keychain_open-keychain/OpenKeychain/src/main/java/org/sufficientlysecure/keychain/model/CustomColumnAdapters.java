// isComment
package org.sufficientlysecure.keychain.model;

import java.util.Date;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.ColumnAdapter;
import org.sufficientlysecure.keychain.model.AutocryptPeer.GossipOrigin;
import org.sufficientlysecure.keychain.pgp.CanonicalizedKeyRing.VerificationStatus;
import org.sufficientlysecure.keychain.pgp.CanonicalizedSecretKey.SecretKeyType;

public final class isClassOrIsInterface {

    private isConstructor() {
    }

    static final ColumnAdapter<Date, Long> isVariable = new ColumnAdapter<Date, Long>() {

        @NonNull
        @Override
        public Date isMethod(Long isParameter) {
            // isComment
            return new Date(isNameExpr * isIntegerConstant);
        }

        @Override
        public Long isMethod(@NonNull Date isParameter) {
            return isNameExpr.isMethod() / isIntegerConstant;
        }
    };

    static final ColumnAdapter<GossipOrigin, Long> isVariable = new ColumnAdapter<GossipOrigin, Long>() {

        @NonNull
        @Override
        public GossipOrigin isMethod(Long isParameter) {
            switch(isNameExpr.isMethod()) {
                case isIntegerConstant:
                    return isNameExpr.isFieldAccessExpr;
                case isIntegerConstant:
                    return isNameExpr.isFieldAccessExpr;
                case isIntegerConstant:
                    return isNameExpr.isFieldAccessExpr;
                default:
                    throw new IllegalArgumentException("isStringConstant");
            }
        }

        @Override
        public Long isMethod(@NonNull GossipOrigin isParameter) {
            switch(isNameExpr) {
                case isNameExpr:
                    return isStringConstant;
                case isNameExpr:
                    return isStringConstant;
                case isNameExpr:
                    return isStringConstant;
                default:
                    throw new IllegalArgumentException("isStringConstant");
            }
        }
    };

    public static final ColumnAdapter<SecretKeyType, Long> isVariable = new ColumnAdapter<SecretKeyType, Long>() {

        @NonNull
        @Override
        public SecretKeyType isMethod(Long isParameter) {
            return isNameExpr == null ? isNameExpr.isFieldAccessExpr : isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public Long isMethod(@NonNull SecretKeyType isParameter) {
            return (long) isNameExpr.isMethod();
        }
    };

    public static final ColumnAdapter<VerificationStatus, Long> isVariable = new ColumnAdapter<VerificationStatus, Long>() {

        @NonNull
        @Override
        public VerificationStatus isMethod(Long isParameter) {
            if (isNameExpr == null) {
                return isNameExpr.isFieldAccessExpr;
            }
            switch(isNameExpr.isMethod()) {
                case isIntegerConstant:
                    return isNameExpr.isFieldAccessExpr;
                case isIntegerConstant:
                    return isNameExpr.isFieldAccessExpr;
                case isIntegerConstant:
                    return isNameExpr.isFieldAccessExpr;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override
        public Long isMethod(@NonNull VerificationStatus isParameter) {
            switch(isNameExpr) {
                case isNameExpr:
                    return isStringConstant;
                case isNameExpr:
                    return isStringConstant;
                case isNameExpr:
                    return isStringConstant;
                default:
                    throw new IllegalArgumentException();
            }
        }
    };
}
