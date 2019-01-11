// isComment
package com.android.setupwizardlib.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * isComment
 */
@Retention(isNameExpr.isFieldAccessExpr)
public @interface VisibleForTesting {

    /**
     * isComment
     */
    enum Visibility {

        /**
         * isComment
         */
        PROTECTED,
        /**
         * isComment
         */
        PACKAGE,
        /**
         * isComment
         */
        PRIVATE
    }

    /**
     * isComment
     */
    Visibility visibility() default isNameExpr.isFieldAccessExpr;
}
