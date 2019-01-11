// isComment
package com.madgag.agit.filepath;

import static com.google.common.base.Functions.compose;
import static com.google.common.collect.Lists.reverse;
import static com.google.common.collect.Lists.transform;
import static com.madgag.agit.filepath.ScoredPath.scoreFor;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import com.google.common.base.Functions;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
    }

    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    private void isMethod(String isParameter, String... isParameter) {
        List<String> isVariable = isMethod(isNameExpr);
        List<FilePath> isVariable = isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        List<FilePath> isVariable = isMethod(isNameExpr);
        List<ScoredPath> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isMethod(isNameExpr, isMethod(isNameExpr)));
        isMethod(isMethod(isNameExpr, isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)), isMethod(isNameExpr));
    }
}
