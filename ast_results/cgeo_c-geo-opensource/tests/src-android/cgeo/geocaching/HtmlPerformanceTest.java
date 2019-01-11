// isComment
package cgeo.geocaching;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.utils.Log;
import cgeo.geocaching.utils.TextUtils;
import android.os.SystemClock;
import android.test.AndroidTestCase;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.apache.commons.lang3.StringEscapeUtils;

public class isClassOrIsInterface extends AndroidTestCase {

    private String isVariable;

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = "isStringConstant";
    }

    public void isMethod() {
        isMethod(isMethod()).isMethod("isStringConstant");
        isMethod(isMethod()).isMethod("isStringConstant");
    }

    private String isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    private String isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod() {
        final int isVariable = isIntegerConstant;
        isMethod("isStringConstant", new Runnable() {

            @Override
            public void isMethod() {
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                    isMethod();
                }
            }
        });
        isMethod("isStringConstant", new Runnable() {

            @Override
            public void isMethod() {
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                    isMethod();
                }
            }
        });
    }

    @SuppressFBWarnings("isStringConstant")
    private static long isMethod(final String isParameter, final Runnable isParameter) {
        isNameExpr.isMethod();
        final long isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
        final long isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr + "isStringConstant" + (isNameExpr - isNameExpr) + "isStringConstant");
        return isNameExpr - isNameExpr;
    }
}
