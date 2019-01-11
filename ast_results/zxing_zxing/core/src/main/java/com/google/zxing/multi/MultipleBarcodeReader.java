// isComment
package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import java.util.Map;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    Result[] isMethod(BinaryBitmap isParameter) throws NotFoundException;

    Result[] isMethod(BinaryBitmap isParameter, Map<DecodeHintType, ?> isParameter) throws NotFoundException;
}
