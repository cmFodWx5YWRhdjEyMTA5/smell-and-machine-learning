// isComment
package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.DataCharacter;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() {
        int[][] isVariable = { { isIntegerConstant }, { isIntegerConstant, isIntegerConstant } };
        String isVariable = "isStringConstant";
        isMethod(isNameExpr, isNameExpr);
    }

    private static void isMethod(int[][] isParameter, String isParameter) {
        BitArray isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    private static BitArray isMethod(int[][] isParameter) {
        List<ExpandedPair> isVariable = new ArrayList<>();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; ++isNameExpr) {
            int[] isVariable = isNameExpr[isNameExpr];
            DataCharacter isVariable;
            if (isNameExpr == isIntegerConstant) {
                isNameExpr = null;
            } else {
                isNameExpr = new DataCharacter(isNameExpr[isIntegerConstant], isIntegerConstant);
            }
            DataCharacter isVariable;
            if (isNameExpr == isIntegerConstant) {
                isNameExpr = new DataCharacter(isNameExpr[isIntegerConstant], isIntegerConstant);
            } else if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
                isNameExpr = new DataCharacter(isNameExpr[isIntegerConstant], isIntegerConstant);
            } else {
                isNameExpr = null;
            }
            ExpandedPair isVariable = new ExpandedPair(isNameExpr, isNameExpr, null, true);
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr);
    }
}
