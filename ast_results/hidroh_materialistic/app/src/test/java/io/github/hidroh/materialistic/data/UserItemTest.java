// isComment
package io.github.hidroh.materialistic.data;

import android.os.Parcel;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.github.hidroh.materialistic.test.TestRunner;
import org.robolectric.RuntimeEnvironment;
import static junit.framework.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Parcel isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(new int[] { isIntegerConstant, isIntegerConstant, isIntegerConstant });
        isNameExpr.isMethod(new HackerNewsItem[] { new HackerNewsItem(isStringConstant), new HackerNewsItem(isStringConstant), new HackerNewsItem(isStringConstant) }, isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant);
        UserItem isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant)).isMethod(isIntegerConstant);
        Parcel isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isIntegerConstant);
    }
}
