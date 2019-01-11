// isComment
package org.dmfs.opentaskspal.views;

import android.content.ContentProviderClient;
import org.dmfs.android.contentpal.View;
import org.dmfs.android.contentpal.views.BaseView;
import org.dmfs.android.contentpal.views.DelegatingView;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends DelegatingView<TaskContract.Tasks> {

    public isConstructor(String isParameter, ContentProviderClient isParameter) {
        super(new BaseView<TaskContract.Tasks>(isNameExpr, isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)));
    }
}
