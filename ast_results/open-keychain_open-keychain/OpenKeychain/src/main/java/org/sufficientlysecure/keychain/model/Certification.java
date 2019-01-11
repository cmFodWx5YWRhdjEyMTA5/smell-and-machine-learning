// isComment
package org.sufficientlysecure.keychain.model;

import java.util.Date;
import android.arch.persistence.db.SupportSQLiteDatabase;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.CertsModel;
import org.sufficientlysecure.keychain.pgp.CanonicalizedKeyRing.VerificationStatus;

@AutoValue
public abstract class isClassOrIsInterface implements CertsModel {

    public static final CertsModel.Factory<Certification> isVariable = new CertsModel.Factory<>(AutoValue_Certification::new, isNameExpr.isFieldAccessExpr);

    public static final SelectVerifyingCertDetailsMapper<CertDetails> isVariable = new SelectVerifyingCertDetailsMapper<>(AutoValue_Certification_CertDetails::new);

    public static Certification isMethod(long isParameter, long isParameter, long isParameter, long isParameter, VerificationStatus isParameter, Date isParameter, byte[] isParameter) {
        long isVariable = isNameExpr.isMethod() / isIntegerConstant;
        return new AutoValue_Certification(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public static InsertCert isMethod(SupportSQLiteDatabase isParameter) {
        return new InsertCert(isNameExpr, isNameExpr);
    }

    public void isMethod(InsertCert isParameter) {
        isNameExpr.isMethod(isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isMethod());
    }

    @AutoValue
    public abstract static class isClassOrIsInterface implements CertsModel.SelectVerifyingCertDetailsModel {
    }
}
