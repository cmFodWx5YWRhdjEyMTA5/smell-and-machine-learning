// isComment
package org.openobservatory.ooniprobe.test.suite;

import org.openobservatory.ooniprobe.R;
import org.openobservatory.ooniprobe.common.PreferenceManager;
import org.openobservatory.ooniprobe.test.test.AbstractTest;
import org.openobservatory.ooniprobe.test.test.HttpHeaderFieldManipulation;
import org.openobservatory.ooniprobe.test.test.HttpInvalidRequestLine;
import java.util.ArrayList;
import androidx.annotation.Nullable;

public class isClassOrIsInterface extends AbstractSuite {

    public static final String isVariable = "isStringConstant";

    public isConstructor() {
        super(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant", "isStringConstant", isIntegerConstant);
    }

    @Override
    public AbstractTest[] isMethod(@Nullable PreferenceManager isParameter) {
        if (super.isMethod(isNameExpr) == null) {
            ArrayList<AbstractTest> isVariable = new ArrayList<>();
            if (isNameExpr == null || isNameExpr.isMethod())
                isNameExpr.isMethod(new HttpHeaderFieldManipulation());
            if (isNameExpr == null || isNameExpr.isMethod())
                isNameExpr.isMethod(new HttpInvalidRequestLine());
            super.isMethod(isNameExpr.isMethod(new AbstractTest[isIntegerConstant]));
        }
        return super.isMethod(isNameExpr);
    }
}
