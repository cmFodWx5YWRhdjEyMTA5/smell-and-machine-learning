// isComment
package org.bitcoinj.jni;

import com.google.common.util.concurrent.FutureCallback;

/**
 * isComment
 */
public class isClassOrIsInterface implements FutureCallback {

    public long isVariable;

    @Override
    public native void isMethod(Object isParameter);

    @Override
    public native void isMethod(Throwable isParameter);
}
