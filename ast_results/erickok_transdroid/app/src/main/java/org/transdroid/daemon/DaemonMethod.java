// isComment
package org.transdroid.daemon;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum DaemonMethod {

    Retrieve(isIntegerConstant),
    AddByUrl(isIntegerConstant),
    AddByMagnetUrl(isIntegerConstant),
    AddByFile(isIntegerConstant),
    Remove(isIntegerConstant),
    Pause(isIntegerConstant),
    PauseAll(isIntegerConstant),
    Resume(isIntegerConstant),
    ResumeAll(isIntegerConstant),
    Stop(isIntegerConstant),
    StopAll(isIntegerConstant),
    Start(isIntegerConstant),
    StartAll(isIntegerConstant),
    GetFileList(isIntegerConstant),
    SetFilePriorities(isIntegerConstant),
    SetTransferRates(isIntegerConstant),
    SetLabel(isIntegerConstant),
    SetDownloadLocation(isIntegerConstant),
    GetTorrentDetails(isIntegerConstant),
    SetTrackers(isIntegerConstant),
    SetAlternativeMode(isIntegerConstant),
    GetStats(isIntegerConstant),
    ForceRecheck(isIntegerConstant);

    private int isVariable;

    private static final Map<Integer, DaemonMethod> isVariable = new HashMap<>();

    static {
        for (DaemonMethod isVariable : isNameExpr.isMethod(DaemonMethod.class)) isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
    }

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public static DaemonMethod isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
