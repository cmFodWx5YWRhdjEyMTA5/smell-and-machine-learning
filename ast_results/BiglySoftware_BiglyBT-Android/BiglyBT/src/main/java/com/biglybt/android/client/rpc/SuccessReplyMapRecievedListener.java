// isComment
package com.biglybt.android.client.rpc;

import android.support.annotation.AnyThread;

/**
 * isComment
 */
@AnyThread
public interface isClassOrIsInterface extends ReplyMapReceivedListener {

    @Override
    public default void isMethod(String isParameter, Exception isParameter) {
    }

    @Override
    public default void isMethod(String isParameter, String isParameter) {
    }
}
