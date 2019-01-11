// isComment
package li.klass.fhem.util.io;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import java.io.File;
import li.klass.fhem.testutil.MockitoRule;
import static com.google.common.base.Preconditions.checkArgument;
import static org.assertj.core.api.Assertions.assertThat;

public class isClassOrIsInterface {

    @Rule
    public MockitoRule isVariable = new MockitoRule();

    @InjectMocks
    public FileSystemService isVariable;

    @Test
    public void isMethod() {
        // isComment
        File isVariable = new File(isNameExpr.isMethod("isStringConstant"));
        // isComment
        File isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        // isComment
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod() + isNameExpr.isFieldAccessExpr + "isStringConstant");
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        File isVariable = new File(isNameExpr.isMethod("isStringConstant"));
        isMethod(isMethod(new File(isNameExpr, "isStringConstant")).isMethod());
        // isComment
        File isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        // isComment
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod());
    }

    private File isMethod(File isParameter) {
        if (isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod());
        }
        isNameExpr.isMethod();
        return isNameExpr;
    }
}
