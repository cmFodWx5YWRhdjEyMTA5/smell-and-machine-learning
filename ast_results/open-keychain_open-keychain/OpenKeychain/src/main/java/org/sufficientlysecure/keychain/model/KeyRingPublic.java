// isComment
package org.sufficientlysecure.keychain.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.KeyRingsPublicModel;
import org.sufficientlysecure.keychain.KeysModel.InsertKey;

@AutoValue
public abstract class isClassOrIsInterface implements KeyRingsPublicModel {

    public static final Factory<KeyRingPublic> isVariable = new Factory<>(AutoValue_KeyRingPublic::new);

    public static final Mapper<KeyRingPublic> isVariable = new Mapper<>(isNameExpr);

    public static KeyRingPublic isMethod(long isParameter, byte[] isParameter) {
        return new AutoValue_KeyRingPublic(isNameExpr, isNameExpr);
    }

    public static InsertKeyRingPublic isMethod(SupportSQLiteDatabase isParameter) {
        return new InsertKeyRingPublic(isNameExpr);
    }

    public void isMethod(InsertKeyRingPublic isParameter) {
        isNameExpr.isMethod(isMethod(), isMethod());
    }
}
