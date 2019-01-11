// isComment
package org.sufficientlysecure.keychain.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import android.os.Parcelable;
import android.support.annotation.CheckResult;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.keyimport.HkpKeyserverAddress;
import org.sufficientlysecure.keychain.pgp.WrappedUserAttribute;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract long isMethod();

    public abstract ArrayList<CertifyAction> isMethod();

    @Nullable
    public abstract HkpKeyserverAddress isMethod();

    public static Builder isMethod(long isParameter) {
        return new AutoValue_CertifyActionsParcel.Builder().isMethod(isNameExpr).isMethod(new ArrayList<CertifyAction>());
    }

    @AutoValue.Builder
    public abstract static class isClassOrIsInterface {

        abstract Builder isMethod(long isParameter);

        public abstract Builder isMethod(ArrayList<CertifyAction> isParameter);

        public abstract Builder isMethod(HkpKeyserverAddress isParameter);

        abstract ArrayList<CertifyAction> isMethod();

        public void isMethod(CertifyAction isParameter) {
            isMethod().isMethod(isNameExpr);
        }

        public void isMethod(Collection<CertifyAction> isParameter) {
            isMethod().isMethod(isNameExpr);
        }

        public abstract CertifyActionsParcel isMethod();
    }

    @AutoValue
    public abstract static class isClassOrIsInterface implements Parcelable {

        public abstract long isMethod();

        @Nullable
        public abstract ArrayList<String> isMethod();

        @Nullable
        public abstract ArrayList<WrappedUserAttribute> isMethod();

        public static CertifyAction isMethod(long isParameter, List<String> isParameter) {
            return new AutoValue_CertifyActionsParcel_CertifyAction(isNameExpr, new ArrayList<>(isNameExpr), null);
        }

        public static CertifyAction isMethod(long isParameter, List<WrappedUserAttribute> isParameter) {
            return new AutoValue_CertifyActionsParcel_CertifyAction(isNameExpr, null, new ArrayList<>(isNameExpr));
        }

        @CheckResult
        public CertifyAction isMethod(ArrayList<String> isParameter) {
            if (isMethod() != null) {
                throw new IllegalStateException("isStringConstant");
            }
            ArrayList<String> isVariable = isMethod();
            if (isNameExpr == null) {
                throw new IllegalStateException("isStringConstant");
            }
            ArrayList<String> isVariable = new ArrayList<>(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            return new AutoValue_CertifyActionsParcel_CertifyAction(isMethod(), isNameExpr, null);
        }
    }
}
