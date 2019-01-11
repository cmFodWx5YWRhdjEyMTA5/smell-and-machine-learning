// isComment
package org.dmfs.opentaskspal.readdata;

import android.content.ContentUris;
import android.net.Uri;
import android.support.annotation.NonNull;
import org.dmfs.android.contentpal.Projection;
import org.dmfs.android.contentpal.RowDataSnapshot;
import org.dmfs.jems.single.Single;
import org.dmfs.tasks.contract.TaskContract.Tasks;

/**
 * isComment
 */
public final class isClassOrIsInterface implements Single<Uri> {

    public static final Projection<?> isVariable = isNameExpr.isFieldAccessExpr;

    private final RowDataSnapshot<Tasks> isVariable;

    private final String isVariable;

    public isConstructor(@NonNull String isParameter, @NonNull RowDataSnapshot<Tasks> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public Uri isMethod() {
        // isComment
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), new Id(isNameExpr).isMethod());
    }
}
