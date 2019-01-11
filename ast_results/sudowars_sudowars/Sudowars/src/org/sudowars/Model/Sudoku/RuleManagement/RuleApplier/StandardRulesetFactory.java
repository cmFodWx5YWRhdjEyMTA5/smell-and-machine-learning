// isComment
package org.sudowars.Model.Sudoku.RuleManagement.RuleApplier;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import org.sudowars.Model.Sudoku.Field.FieldStructure;
import org.sudowars.Model.Sudoku.Field.SquareStructure;
import org.sudowars.Model.Sudoku.RuleManagement.DependencyGroup;
import org.sudowars.Model.Sudoku.RuleManagement.DependencyManager;
import org.sudowars.Model.Sudoku.RuleManagement.NoDuplicatesRule;
import org.sudowars.Model.Sudoku.RuleManagement.Rule;
import org.sudowars.Model.Sudoku.RuleManagement.UpperLimitRule;

/**
 * isComment
 */
public class isClassOrIsInterface implements Serializable {

    private static final long isVariable = -isStringConstant;

    private static StandardRulesetFactory isVariable;

    /**
     * isComment
     */
    public static StandardRulesetFactory isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new StandardRulesetFactory();
        }
        return isNameExpr;
    }

    private isConstructor() {
    }

    private DependencyManager isMethod(int isParameter) {
        FieldStructure isVariable = new SquareStructure(isNameExpr * isNameExpr);
        Rule isVariable = new NoDuplicatesRule(new UpperLimitRule(isNameExpr * isNameExpr));
        List<DependencyGroup> isVariable = new LinkedList<DependencyGroup>();
        isNameExpr.isMethod((new RowRuleApplier()).isMethod(isNameExpr, isNameExpr));
        isNameExpr.isMethod((new ColumnRuleApplier()).isMethod(isNameExpr, isNameExpr));
        isNameExpr.isMethod((new BlockRuleApplier(isNameExpr)).isMethod(isNameExpr, isNameExpr));
        return new StandardDependencyManager(isNameExpr);
    }

    /**
     * isComment
     */
    public DependencyManager isMethod() {
        return isMethod(isIntegerConstant);
    }

    /**
     * isComment
     */
    public DependencyManager isMethod() {
        return isMethod(isIntegerConstant);
    }

    /**
     * isComment
     */
    public boolean isMethod(DependencyManager isParameter) {
        return isNameExpr instanceof StandardDependencyManager;
    }

    private class isClassOrIsInterface extends DependencyManager {

        /**
         * isComment
         */
        private static final long isVariable = isStringConstant;

        private isConstructor(List<DependencyGroup> isParameter) {
            super(isNameExpr);
        }
    }
}
