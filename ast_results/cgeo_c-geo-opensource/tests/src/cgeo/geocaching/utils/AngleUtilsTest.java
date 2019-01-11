// isComment
package cgeo.geocaching.utils;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(-isDoubleConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(-isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(-isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(-isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(-isNameExpr.isFieldAccessExpr)).isMethod(isDoubleConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant, -isIntegerConstant)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod(-isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant)).isMethod(-isDoubleConstant);
        isMethod(isNameExpr.isMethod(-isIntegerConstant, isIntegerConstant)).isMethod(-isDoubleConstant);
        isMethod(isNameExpr.isMethod(-isIntegerConstant, isIntegerConstant)).isMethod(-isDoubleConstant);
        isMethod(isNameExpr.isMethod(isIntegerConstant, -isIntegerConstant)).isMethod(-isDoubleConstant);
    }
}
