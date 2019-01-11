// isComment
package org.addhen.smssync.presentation.model.mapper;

import org.addhen.smssync.domain.entity.LogEntity;
import org.addhen.smssync.presentation.model.LogModel;
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

    public LogEntity isMethod(LogModel isParameter) {
        LogEntity isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = new LogEntity();
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    public LogModel isMethod(LogEntity isParameter) {
        LogModel isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = new LogModel();
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    public List<LogModel> isMethod(List<LogEntity> isParameter) {
        List<LogModel> isVariable = new ArrayList<>();
        LogModel isVariable;
        for (LogEntity isVariable : isNameExpr) {
            isNameExpr = isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }
}
