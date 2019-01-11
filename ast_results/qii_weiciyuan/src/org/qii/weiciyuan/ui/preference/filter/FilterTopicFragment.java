// isComment
package org.qii.weiciyuan.ui.preference.filter;

import org.qii.weiciyuan.support.database.FilterDBTask;
import java.util.Collection;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFilterFragment {

    @Override
    protected List<String> isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(Collection<String> isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    protected List<String> isMethod(Collection<String> isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }
}
