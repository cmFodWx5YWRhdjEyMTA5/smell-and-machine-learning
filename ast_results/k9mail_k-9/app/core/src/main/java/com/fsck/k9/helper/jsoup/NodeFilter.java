// isComment
package com.fsck.k9.helper.jsoup;

import android.support.annotation.NonNull;
import org.jsoup.nodes.Node;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    /**
     * isComment
     */
    enum HeadFilterDecision {

        /**
         * isComment
         */
        CONTINUE,
        /**
         * isComment
         */
        SKIP_CHILDREN,
        /**
         * isComment
         */
        SKIP_ENTIRELY,
        /**
         * isComment
         */
        REMOVE,
        /**
         * isComment
         */
        STOP
    }

    /**
     * isComment
     */
    enum TailFilterDecision {

        /**
         * isComment
         */
        CONTINUE,
        /**
         * isComment
         */
        REMOVE,
        /**
         * isComment
         */
        STOP
    }

    /**
     * isComment
     */
    @NonNull
    HeadFilterDecision isMethod(Node isParameter, int isParameter);

    /**
     * isComment
     */
    @NonNull
    TailFilterDecision isMethod(Node isParameter, int isParameter);
}
