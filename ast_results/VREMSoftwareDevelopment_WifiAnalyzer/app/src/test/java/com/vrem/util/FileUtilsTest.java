// isComment
package com.vrem.util;

import android.content.res.Resources;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Mock
    private Resources isVariable;

    @Test
    public void isMethod() {
        // isComment
        int isVariable = isIntegerConstant;
        String isVariable = "isStringConstant";
        InputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        // isComment
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        int isVariable = isIntegerConstant;
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(Exception.class);
        // isComment
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }
}
