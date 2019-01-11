// isComment
package org.ebookdroid.common.settings.books;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import org.apache.commons.io.IOUtils;
import org.ebookdroid.common.settings.types.DocumentViewMode;
import org.ebookdroid.common.settings.types.PageAlign;
import org.ebookdroid.common.settings.types.RotationType;
import org.ebookdroid.core.PageIndex;
import org.ebookdroid.core.curl.PageAnimationType;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    private static String isMethod(String isParameter) {
        try {
            InputStream isVariable = null;
            try {
                isNameExpr = isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
                return isNameExpr.isMethod(isNameExpr, "isStringConstant");
            } finally {
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
            }
        } catch (IOException isParameter) {
            throw new RuntimeException(isNameExpr);
        }
    }

    @Test
    public void isMethod() {
        JSONObject isVariable = isNameExpr.isMethod(isMethod("isStringConstant"));
        BookSettings isVariable;
        try {
            isNameExpr = new BookSettings(isNameExpr);
        } catch (JSONException isParameter) {
            throw new RuntimeException(isNameExpr);
        }
        isMethod(isNameExpr, isMethod(isMethod()));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(true));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isStringConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod("isStringConstant"));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isStringConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(new PageIndex(isIntegerConstant, isIntegerConstant)));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(true));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(true));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.<Bookmark>isMethod()));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(true));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isDoubleConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isDoubleConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(true));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(true));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(true));
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isMethod()));
    }
}
