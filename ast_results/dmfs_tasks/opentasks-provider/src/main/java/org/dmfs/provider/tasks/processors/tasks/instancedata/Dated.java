// isComment
package org.dmfs.provider.tasks.processors.tasks.instancedata;

import android.content.ContentValues;
import org.dmfs.jems.single.Single;
import org.dmfs.jems.single.decorators.DelegatingSingle;
import org.dmfs.optional.Optional;
import org.dmfs.provider.tasks.utils.Zipped;
import org.dmfs.rfc5545.DateTime;
import java.util.TimeZone;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingSingle<ContentValues> {

    public isConstructor(Optional<DateTime> isParameter, String isParameter, String isParameter, Single<ContentValues> isParameter) {
        super(new Zipped<>(isNameExpr, isNameExpr, (isParameter, isParameter) -> {
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod() ? isNameExpr.isMethod() : isNameExpr.isMethod(isNameExpr.isMethod()).isMethod());
            return isNameExpr;
        }));
    }
}
