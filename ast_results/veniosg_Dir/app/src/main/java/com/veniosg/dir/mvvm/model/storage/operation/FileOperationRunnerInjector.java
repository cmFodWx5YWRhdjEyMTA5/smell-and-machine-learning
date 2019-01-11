// isComment
package com.veniosg.dir.mvvm.model.storage.operation;

import android.content.Context;
import com.veniosg.dir.android.ui.toast.ToastDisplayer;
import com.veniosg.dir.mvvm.model.storage.access.ExternalStorageAccessManager;

public abstract class isClassOrIsInterface {

    private isConstructor() {
    }

    /**
     * isComment
     */
    public static FileOperationRunner isMethod(Context isParameter) {
        return new FileOperationRunner(new ExternalStorageAccessManager(isNameExpr), new ToastDisplayer(isNameExpr));
    }
}
