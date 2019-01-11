// isComment
package org.transdroid.daemon;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum TorrentsSortBy {

    Alphanumeric(isIntegerConstant),
    Status(isIntegerConstant),
    DateDone(isIntegerConstant),
    DateAdded(isIntegerConstant),
    UploadSpeed(isIntegerConstant),
    Ratio(isIntegerConstant),
    DownloadSpeed(isIntegerConstant),
    Percent(isIntegerConstant),
    Size(isIntegerConstant);

    private int isVariable;

    private static final Map<Integer, TorrentsSortBy> isVariable = new HashMap<Integer, TorrentsSortBy>();

    static {
        for (TorrentsSortBy isVariable : isNameExpr.isMethod(TorrentsSortBy.class)) isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
    }

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public static TorrentsSortBy isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
