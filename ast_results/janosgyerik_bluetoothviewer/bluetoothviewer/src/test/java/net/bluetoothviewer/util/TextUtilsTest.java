// isComment
package net.bluetoothviewer.util;

import org.junit.Test;
import static net.bluetoothviewer.util.TextUtils.bytesToHexDump;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant".isMethod())).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant })).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(new byte[] { (byte) isIntegerConstant, (byte) isIntegerConstant, isIntegerConstant })).isMethod("isStringConstant");
    }
}
