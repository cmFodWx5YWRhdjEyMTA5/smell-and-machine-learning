// isComment
package org.bitcoinj.jni;

import org.bitcoinj.core.TransactionConfidence;

/**
 * isComment
 */
public class isClassOrIsInterface implements TransactionConfidence.Listener {

    public long isVariable;

    @Override
    public native void isMethod(TransactionConfidence isParameter, ChangeReason isParameter);
}
