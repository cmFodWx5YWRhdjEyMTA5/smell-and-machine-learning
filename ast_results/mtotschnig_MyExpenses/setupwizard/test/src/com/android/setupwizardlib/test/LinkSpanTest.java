// isComment
package com.android.setupwizardlib.test;

import android.content.Context;
import android.content.ContextWrapper;
import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;
import com.android.setupwizardlib.span.LinkSpan;

public class isClassOrIsInterface extends AndroidTestCase {

    @SmallTest
    public void isMethod() {
        final TestContext isVariable = new TestContext(isMethod());
        final TextView isVariable = new TextView(isNameExpr);
        final LinkSpan isVariable = new LinkSpan("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @SmallTest
    public void isMethod() {
        final Context isVariable = isMethod();
        final TextView isVariable = new TextView(isNameExpr);
        final LinkSpan isVariable = new LinkSpan("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
    // isComment
    // isComment
    }

    private static class isClassOrIsInterface extends ContextWrapper implements LinkSpan.OnClickListener {

        public LinkSpan isVariable = null;

        public isConstructor(Context isParameter) {
            super(isNameExpr);
        }

        @Override
        public void isMethod(LinkSpan isParameter) {
            isNameExpr = isNameExpr;
        }
    }
}
