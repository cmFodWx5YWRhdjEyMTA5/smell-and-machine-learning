// isComment
package org.sufficientlysecure.keychain.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.UserPacketsModel;
import org.sufficientlysecure.keychain.pgp.CanonicalizedKeyRing.VerificationStatus;

@AutoValue
public abstract class isClassOrIsInterface implements UserPacketsModel {

    public static final Factory<UserPacket> isVariable = new Factory<>(AutoValue_UserPacket::new);

    public static final SelectUserIdsByMasterKeyIdMapper<UserId> isVariable = isNameExpr.isMethod(AutoValue_UserPacket_UserId::new);

    public static final SelectUserAttributesByTypeAndMasterKeyIdMapper<UserAttribute> isVariable = isNameExpr.isMethod(AutoValue_UserPacket_UserAttribute::new);

    public static final UidStatusMapper<UidStatus> isVariable = isNameExpr.isMethod(AutoValue_UserPacket_UidStatus::new);

    public static UserPacket isMethod(long isParameter, int isParameter, Long isParameter, String isParameter, String isParameter, String isParameter, String isParameter, byte[] isParameter, boolean isParameter, boolean isParameter) {
        return new AutoValue_UserPacket(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public static InsertUserPacket isMethod(SupportSQLiteDatabase isParameter) {
        return new InsertUserPacket(isNameExpr);
    }

    public void isMethod(InsertUserPacket isParameter) {
        isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod());
    }

    @AutoValue
    public abstract static class isClassOrIsInterface implements SelectUserIdsByMasterKeyIdModel {

        public boolean isMethod() {
            return isMethod() == isNameExpr.isFieldAccessExpr;
        }

        @NonNull
        public VerificationStatus isMethod() {
            return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
        }
    }

    @AutoValue
    public abstract static class isClassOrIsInterface implements SelectUserAttributesByTypeAndMasterKeyIdModel {

        public boolean isMethod() {
            return isMethod() == isNameExpr.isFieldAccessExpr;
        }

        @NonNull
        public VerificationStatus isMethod() {
            return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
        }
    }

    @AutoValue
    public abstract static class isClassOrIsInterface implements UidStatusModel {

        public VerificationStatus isMethod() {
            return isNameExpr.isFieldAccessExpr.isMethod(isMethod());
        }
    }
}
