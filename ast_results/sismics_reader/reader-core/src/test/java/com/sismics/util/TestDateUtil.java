// isComment
package com.sismics.util;

import com.sismics.reader.core.dao.file.rss.RssReader;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * isComment
 */
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr));
    }
}
