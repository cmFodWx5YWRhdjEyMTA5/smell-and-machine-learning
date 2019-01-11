// isComment
package org.dmfs.tasks.utils.permission.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import org.dmfs.iterators.ArrayIterator;
import java.util.Iterator;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Iterable<String> {

    private final Context isVariable;

    public isConstructor(Context isParameter) {
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public Iterator<String> isMethod() {
        try {
            PackageInfo isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            return new ArrayIterator<>(isNameExpr.isFieldAccessExpr);
        } catch (PackageManager.NameNotFoundException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }
}
