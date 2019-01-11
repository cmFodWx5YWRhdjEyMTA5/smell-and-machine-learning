// isComment
package org.totschnig.myexpenses.test.misc;

import android.support.v4.util.Pair;
import android.test.InstrumentationTestCase;
import android.util.SparseArray;
import junit.framework.Assert;
import org.totschnig.myexpenses.fortest.test.R;
import org.totschnig.myexpenses.util.CategoryTree;
import org.totschnig.myexpenses.util.Result;
import org.totschnig.myexpenses.util.Utils;
import java.util.ArrayList;

public class isClassOrIsInterface extends InstrumentationTestCase {

    private Result<Pair<CategoryTree, ArrayList<String>>> isMethod(int isParameter) {
        return isMethod(isNameExpr);
    }

    private Result<Pair<CategoryTree, ArrayList<String>>> isMethod(int isParameter) {
        return isNameExpr.isMethod(isMethod().isMethod().isMethod().isMethod(isNameExpr));
    }

    /*isComment*/
    public void isMethod() {
        Result<Pair<CategoryTree, ArrayList<String>>> isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true, isNameExpr.isMethod());
        CategoryTree isVariable = isNameExpr.isMethod().isFieldAccessExpr;
        SparseArray<CategoryTree> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod());
        ArrayList<String> isVariable = isNameExpr.isMethod().isFieldAccessExpr;
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
    }

    public void isMethod() {
        Result<Pair<CategoryTree, ArrayList<String>>> isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true, isNameExpr.isMethod());
        CategoryTree isVariable = isNameExpr.isMethod().isFieldAccessExpr;
        SparseArray<CategoryTree> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod());
        ArrayList<String> isVariable = isNameExpr.isMethod().isFieldAccessExpr;
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
    }

    public void isMethod() {
        Result<Pair<CategoryTree, ArrayList<String>>> isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }

    public void isMethod() {
        Result<Pair<CategoryTree, ArrayList<String>>> isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod().isMethod()).isMethod("isStringConstant"));
    }

    public void isMethod() {
        Result<Pair<CategoryTree, ArrayList<String>>> isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod().isMethod()).isMethod("isStringConstant"));
    }

    public void isMethod() {
        Result isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }
}
