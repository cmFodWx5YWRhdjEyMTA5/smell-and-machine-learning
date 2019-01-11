// isComment
package org.totschnig.myexpenses.test.misc;

import android.util.SparseArray;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.totschnig.myexpenses.util.CategoryTree;

public class isClassOrIsInterface extends TestCase {

    public void isMethod() {
        CategoryTree isVariable = new CategoryTree("isStringConstant");
        isNameExpr.isMethod(true, isNameExpr.isMethod("isStringConstant", isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(true, isNameExpr.isMethod("isStringConstant", isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(true, isNameExpr.isMethod("isStringConstant", isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(true, isNameExpr.isMethod("isStringConstant", isIntegerConstant, isIntegerConstant));
        // isComment
        isNameExpr.isMethod(true, isNameExpr.isMethod("isStringConstant", isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        SparseArray<CategoryTree> isVariable = isNameExpr.isMethod();
        CategoryTree isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        CategoryTree isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        try {
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isIntegerConstant);
            isNameExpr.isMethod("isStringConstant");
        } catch (UnsupportedOperationException isParameter) {
        }
    }
}
