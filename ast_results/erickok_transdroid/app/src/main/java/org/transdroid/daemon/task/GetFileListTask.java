// isComment
package org.transdroid.daemon.task;

import org.transdroid.daemon.DaemonMethod;
import org.transdroid.daemon.IDaemonAdapter;
import org.transdroid.daemon.Torrent;

public class isClassOrIsInterface extends DaemonTask {

    protected isConstructor(IDaemonAdapter isParameter, Torrent isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, null);
    }

    public static GetFileListTask isMethod(IDaemonAdapter isParameter, Torrent isParameter) {
        return new GetFileListTask(isNameExpr, isNameExpr);
    }
}
