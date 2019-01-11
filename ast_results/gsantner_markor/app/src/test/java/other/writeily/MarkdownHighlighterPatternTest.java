// isComment
package other.writeily;

import net.gsantner.markor.format.markdown.MarkdownHighlighterPattern;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class isClassOrIsInterface {

    @Parameterized.Parameters(name = "isStringConstant")
    public static Collection<Object[]> isMethod() {
        return isNameExpr.isMethod(new Object[][] { { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant }, { isNameExpr.isFieldAccessExpr, "isStringConstant", isIntegerConstant } });
    }

    private final Pattern isVariable;

    private final String isVariable;

    private final int isVariable;

    public isConstructor(MarkdownHighlighterPattern isParameter, String isParameter, int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    @Test
    public void isMethod() {
        int isVariable = isIntegerConstant;
        for (Matcher isVariable = isNameExpr.isMethod(isNameExpr); isNameExpr.isMethod(); ) {
            isNameExpr++;
        }
        isMethod(isNameExpr).isMethod(isNameExpr);
    }
}
