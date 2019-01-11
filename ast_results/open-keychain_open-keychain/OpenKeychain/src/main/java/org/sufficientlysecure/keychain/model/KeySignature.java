// isComment
package org.sufficientlysecure.keychain.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.KeySignaturesModel;

@AutoValue
public abstract class isClassOrIsInterface implements KeySignaturesModel {

    public static final Factory<KeySignature> isVariable = new Factory<>(AutoValue_KeySignature::new);

    public static final Mapper<KeySignature> isVariable = new Mapper<>(isNameExpr);

    public static InsertKeySignature isMethod(SupportSQLiteDatabase isParameter) {
        return new InsertKeySignature(isNameExpr);
    }

    public void isMethod(InsertKeySignature isParameter) {
        isNameExpr.isMethod(isMethod(), isMethod());
    }

    public static KeySignature isMethod(long isParameter, long isParameter) {
        return new AutoValue_KeySignature(isNameExpr, isNameExpr);
    }
}
