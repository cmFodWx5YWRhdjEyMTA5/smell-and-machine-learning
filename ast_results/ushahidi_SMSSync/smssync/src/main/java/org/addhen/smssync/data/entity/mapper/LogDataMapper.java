// isComment
package org.addhen.smssync.data.entity.mapper;

import org.addhen.smssync.data.entity.Log;
import org.addhen.smssync.domain.entity.LogEntity;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 * isComment
 */
public class isClassOrIsInterface {

    @Inject
    public isConstructor() {
    // isComment
    }

    public LogEntity isMethod(Log isParameter) {
        LogEntity isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = new LogEntity();
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    public Log isMethod(LogEntity isParameter) {
        Log isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = new Log();
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    public List<LogEntity> isMethod(List<Log> isParameter) {
        List<LogEntity> isVariable = new ArrayList<>();
        LogEntity isVariable;
        for (Log isVariable : isNameExpr) {
            isNameExpr = isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }
}
