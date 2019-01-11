// isComment
package org.addhen.smssync.presentation.model.mapper;

import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.domain.entity.FilterEntity;
import org.addhen.smssync.presentation.model.FilterModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 * isComment
 */
@ActivityScope
public class isClassOrIsInterface {

    @Inject
    public isConstructor() {
    // isComment
    }

    /**
     * isComment
     */
    public FilterEntity isMethod(FilterModel isParameter) {
        FilterEntity isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = new FilterEntity();
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod()));
        }
        return isNameExpr;
    }

    public FilterModel isMethod(FilterEntity isParameter) {
        FilterModel isVariable = null;
        if (isNameExpr != null) {
            isNameExpr = new FilterModel();
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod()));
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public List<FilterModel> isMethod(List<FilterEntity> isParameter) {
        List<FilterModel> isVariable = new ArrayList<>();
        FilterModel isVariable;
        for (FilterEntity isVariable : isNameExpr) {
            isNameExpr = isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    public FilterModel.Status isMethod(FilterEntity.Status isParameter) {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
    }

    public FilterEntity.Status isMethod(FilterModel.Status isParameter) {
        return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
    }
}
