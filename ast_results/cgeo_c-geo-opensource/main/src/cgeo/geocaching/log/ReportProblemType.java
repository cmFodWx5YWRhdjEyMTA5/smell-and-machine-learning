// isComment
package cgeo.geocaching.log;

import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.R;
import cgeo.geocaching.enumerations.CacheType;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.list.UnmodifiableList;

/**
 * isComment
 */
public enum ReportProblemType {

    NO_PROBLEM("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    NEEDS_MAINTENANCE("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    LOG_FULL("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new LogType[] { isNameExpr.isFieldAccessExpr }, true),
    DAMAGED("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new LogType[] { isNameExpr.isFieldAccessExpr }, true),
    MISSING("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new LogType[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }),
    OTHER("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    ARCHIVE("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    public final String isVariable;

    public final LogType isVariable;

    public final int isVariable;

    public final int isVariable;

    public final List<LogType> isVariable;

    public final boolean isVariable;

    isConstructor(final String isParameter, final LogType isParameter, final int isParameter, final int isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, new LogType[] {});
    }

    isConstructor(final String isParameter, final LogType isParameter, final int isParameter, final int isParameter, final LogType[] isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, true);
    }

    isConstructor(final String isParameter, final LogType isParameter, final int isParameter, final int isParameter, final LogType[] isParameter, final boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = new UnmodifiableList<>(isNameExpr.isMethod(isNameExpr));
        this.isFieldAccessExpr = isNameExpr;
    }

    public boolean isMethod(final LogType isParameter, final CacheType isParameter) {
        for (final LogType isVariable : isNameExpr) {
            if (isNameExpr == isNameExpr) {
                return true;
            }
        }
        return !isNameExpr.isMethod() || isNameExpr;
    }

    public static ReportProblemType isMethod(final String isParameter) {
        for (final ReportProblemType isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
    }
}
