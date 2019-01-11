// isComment
package org.andstatus.app.origin;

import android.net.Uri;
import android.support.annotation.StringRes;
import org.andstatus.app.R;
import org.andstatus.app.context.ActorInTimeline;
import org.andstatus.app.context.MyContext;
import org.andstatus.app.data.MyQuery;
import org.andstatus.app.database.table.NoteTable;
import org.andstatus.app.util.MyLog;
import org.andstatus.app.util.UriUtils;

class isClassOrIsInterface extends Origin {

    isConstructor(MyContext isParameter, OriginType isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public int isMethod(@StringRes int isParameter) {
        int isVariable;
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
            default:
                isNameExpr = isNameExpr;
                break;
        }
        return isNameExpr;
    }

    @Override
    protected String isMethod(long isParameter) {
        if (isNameExpr == null) {
            return "isStringConstant";
        }
        final Uri isVariable = isMethod(isNameExpr.isMethod(isNameExpr));
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isFieldAccessExpr) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
            final String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            return isNameExpr.isMethod(isNameExpr, isNameExpr + "isStringConstant" + isNameExpr).isMethod();
        } else {
            return isNameExpr.isMethod(isNameExpr, "isStringConstant").isMethod();
        }
    }

    @Override
    public Uri isMethod(Uri isParameter) {
        Uri isVariable = isNameExpr;
        if (isNameExpr != null) {
            try {
                if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod().isMethod("isStringConstant", "isStringConstant"));
                }
            } catch (NullPointerException isParameter) {
                isNameExpr.isMethod(this, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant", isNameExpr);
            }
        }
        return isNameExpr;
    }
}
