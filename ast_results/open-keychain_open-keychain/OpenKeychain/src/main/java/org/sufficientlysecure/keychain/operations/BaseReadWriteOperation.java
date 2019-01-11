// isComment
package org.sufficientlysecure.keychain.operations;

import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import android.os.Parcelable;
import org.sufficientlysecure.keychain.daos.KeyWritableRepository;
import org.sufficientlysecure.keychain.pgp.Progressable;

public abstract class isClassOrIsInterface<T extends Parcelable> extends BaseOperation<T> {

    protected final KeyWritableRepository isVariable;

    isConstructor(Context isParameter, KeyWritableRepository isParameter, Progressable isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    protected isConstructor(Context isParameter, KeyWritableRepository isParameter, Progressable isParameter, AtomicBoolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }
}
