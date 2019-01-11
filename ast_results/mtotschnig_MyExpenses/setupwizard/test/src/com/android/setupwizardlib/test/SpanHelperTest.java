// isComment
package com.android.setupwizardlib.test;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.text.Annotation;
import android.text.SpannableStringBuilder;
import com.android.setupwizardlib.span.SpanHelper;

public class isClassOrIsInterface extends AndroidTestCase {

    @SmallTest
    public void isMethod() {
        SpannableStringBuilder isVariable = new SpannableStringBuilder("isStringConstant");
        Annotation isVariable = new Annotation("isStringConstant", "isStringConstant");
        Annotation isVariable = new Annotation("isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        final Object[] isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(), Object.class);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr, isNameExpr[isIntegerConstant]);
    }
}
