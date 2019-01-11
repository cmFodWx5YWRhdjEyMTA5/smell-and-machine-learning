// isComment
package org.sudowars.Model.Sudoku.RuleManagement.RuleApplier;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.sudowars.Model.Sudoku.Field.FieldStructure;
import org.sudowars.Model.Sudoku.RuleManagement.DependencyGroup;
import org.sudowars.Model.Sudoku.RuleManagement.Rule;

/**
 * isComment
 */
public class isClassOrIsInterface implements RuleApplier {

    /**
     * isComment
     */
    @Override
    public List<DependencyGroup> isMethod(FieldStructure isParameter, Rule isParameter) throws NullPointerException {
        if (isNameExpr == null || isNameExpr == null) {
            throw new IllegalArgumentException();
        }
        List<DependencyGroup> isVariable = new ArrayList<DependencyGroup>(isNameExpr.isMethod());
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            List<Integer> isVariable = new LinkedList<Integer>();
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                if (isNameExpr.isMethod(isNameExpr, isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
                }
            }
            isNameExpr.isMethod(new DependencyGroup(isNameExpr, isNameExpr));
        }
        return isNameExpr;
    }
}
