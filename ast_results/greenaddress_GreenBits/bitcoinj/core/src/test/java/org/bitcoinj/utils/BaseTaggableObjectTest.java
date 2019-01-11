// isComment
package org.bitcoinj.utils;

import com.google.protobuf.ByteString;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class isClassOrIsInterface {

    private BaseTaggableObject isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new BaseTaggableObject();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant").isMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod("isStringConstant");
    }
}
