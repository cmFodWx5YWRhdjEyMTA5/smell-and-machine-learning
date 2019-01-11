// isComment
package com.f2prateek.dfg.prefs;

import java.lang.annotation.Retention;
import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * isComment
 */
@Qualifier
@Retention(isNameExpr)
public @interface BackgroundColorOption {

    enum Option {

        VIBRANT,
        VIBRANT_DARK,
        VIBRANT_LIGHT,
        MUTED,
        MUTED_DARK,
        MUTED_LIGHT,
        CUSTOM
    }
}
