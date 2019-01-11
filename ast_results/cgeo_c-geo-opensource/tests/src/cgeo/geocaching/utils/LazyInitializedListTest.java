// isComment
package cgeo.geocaching.utils;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

public class isClassOrIsInterface {

    private static final class isClassOrIsInterface extends LazyInitializedList<String> {

        @Override
        public List<String> isMethod() {
            return new ArrayList<>();
        }
    }

    @Test
    public void isMethod() {
        final LazyInitializedList<String> isVariable = new MockedLazyInitializedList();
        isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod(isIntegerConstant);
        int isVariable = isIntegerConstant;
        for (final String isVariable : isNameExpr) {
            isMethod(isNameExpr).isMethod("isStringConstant");
            isNameExpr++;
        }
        isMethod(isNameExpr).isMethod(isIntegerConstant);
    }
}
