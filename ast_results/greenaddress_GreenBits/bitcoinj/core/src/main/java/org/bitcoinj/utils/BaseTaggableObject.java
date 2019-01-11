// isComment
package org.bitcoinj.utils;

import com.google.common.collect.Maps;
import com.google.protobuf.ByteString;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * isComment
 */
public class isClassOrIsInterface implements TaggableObject {

    @Nullable
    protected Map<String, ByteString> isVariable;

    /**
     * isComment
     */
    @Override
    @Nullable
    public synchronized ByteString isMethod(String isParameter) {
        if (isNameExpr == null)
            return null;
        else
            return isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public ByteString isMethod(String isParameter) {
        ByteString isVariable = isMethod(isNameExpr);
        if (isNameExpr == null)
            throw new IllegalArgumentException("isStringConstant" + isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public synchronized void isMethod(String isParameter, ByteString isParameter) {
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        if (isNameExpr == null)
            isNameExpr = new HashMap<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public synchronized Map<String, ByteString> isMethod() {
        if (isNameExpr != null)
            return isNameExpr.isMethod(isNameExpr);
        else
            return isNameExpr.isMethod();
    }
}
