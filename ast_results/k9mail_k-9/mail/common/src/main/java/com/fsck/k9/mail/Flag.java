// isComment
package com.fsck.k9.mail;

/**
 * isComment
 */
public enum Flag {

    DELETED,
    SEEN,
    ANSWERED,
    FLAGGED,
    DRAFT,
    RECENT,
    FORWARDED,
    /**
     * isComment
     */
    X_DESTROYED,
    /**
     * isComment
     */
    X_SEND_FAILED,
    /**
     * isComment
     */
    X_SEND_IN_PROGRESS,
    /**
     * isComment
     */
    X_DOWNLOADED_FULL,
    /**
     * isComment
     */
    X_DOWNLOADED_PARTIAL,
    /**
     * isComment
     */
    X_REMOTE_COPY_STARTED,
    /**
     * isComment
     */
    X_MIGRATED_FROM_V50,
    /**
     * isComment
     */
    X_DRAFT_OPENPGP_INLINE,
    /**
     * isComment
     */
    X_SUBJECT_DECRYPTED
}
