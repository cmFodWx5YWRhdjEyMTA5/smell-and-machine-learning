// isComment
package com.btchip.comm;

import java.util.concurrent.Future;
import com.btchip.BTChipException;

public interface isClassOrIsInterface {

    Future<byte[]> isMethod(byte[] isParameter) throws BTChipException;

    void isMethod() throws BTChipException;

    void isMethod(boolean isParameter);
}
