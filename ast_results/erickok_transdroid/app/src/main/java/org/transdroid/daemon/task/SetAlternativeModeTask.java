// isComment
package org.transdroid.daemon.task;

import org.transdroid.daemon.DaemonMethod;
import org.transdroid.daemon.IDaemonAdapter;
import android.os.Bundle;

public class isClassOrIsInterface extends DaemonTask {

    protected isConstructor(IDaemonAdapter isParameter, Bundle isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr);
    }

    public static SetAlternativeModeTask isMethod(IDaemonAdapter isParameter, boolean isParameter) {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return new SetAlternativeModeTask(isNameExpr, isNameExpr);
    }

    public boolean isMethod() {
        return isNameExpr.isMethod("isStringConstant");
    }
}
