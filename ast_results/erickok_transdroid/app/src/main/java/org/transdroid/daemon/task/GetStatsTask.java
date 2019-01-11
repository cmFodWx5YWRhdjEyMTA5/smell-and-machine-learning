// isComment
package org.transdroid.daemon.task;

import org.transdroid.daemon.DaemonMethod;
import org.transdroid.daemon.IDaemonAdapter;

public class isClassOrIsInterface extends DaemonTask {

    protected isConstructor(IDaemonAdapter isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, null, null);
    }

    public static GetStatsTask isMethod(IDaemonAdapter isParameter) {
        return new GetStatsTask(isNameExpr);
    }
}
