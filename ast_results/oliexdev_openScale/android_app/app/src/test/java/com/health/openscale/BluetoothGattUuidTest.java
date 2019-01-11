// isComment
package com.health.openscale;

import com.health.openscale.core.bluetooth.BluetoothGattUuid;
import org.junit.Test;
import java.util.UUID;
import static junit.framework.Assert.assertEquals;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant)));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant)));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant)));
        final UUID isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr));
    }
}
