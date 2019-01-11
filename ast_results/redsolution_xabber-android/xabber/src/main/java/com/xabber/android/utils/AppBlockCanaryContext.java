// isComment
package com.xabber.android.utils;

import com.github.moduth.blockcanary.BlockCanaryContext;
import com.xabber.android.BuildConfig;

public class isClassOrIsInterface extends BlockCanaryContext {

    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public int isMethod() {
        return isIntegerConstant;
    }
}
