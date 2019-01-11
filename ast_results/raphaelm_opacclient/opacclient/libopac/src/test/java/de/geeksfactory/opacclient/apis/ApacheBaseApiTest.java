// isComment
package de.geeksfactory.opacclient.apis;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isNameExpr.<NameValuePair>isMethod(new BasicNameValuePair("isStringConstant", "isStringConstant"), new BasicNameValuePair("isStringConstant", "isStringConstant"), new BasicNameValuePair("isStringConstant", "isStringConstant"))), isMethod("isStringConstant"));
    }
}
