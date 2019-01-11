// isComment
package org.wordpress.android.ui.stats.models;

import org.wordpress.android.ui.stats.StatsConstants;
import org.wordpress.android.ui.stats.StatsUtils;
import java.io.Serializable;

public class isClassOrIsInterface extends SingleItemModel implements Serializable {

    private final String isVariable;

    public isConstructor(long isParameter, String isParameter, String isParameter, String isParameter, int isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, null);
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(long isParameter, long isParameter, String isParameter, String isParameter, int isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, null);
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    public isConstructor(long isParameter, String isParameter, String isParameter, String isParameter, String isParameter) {
        super(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr, isIntegerConstant, isNameExpr, null);
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }
}
