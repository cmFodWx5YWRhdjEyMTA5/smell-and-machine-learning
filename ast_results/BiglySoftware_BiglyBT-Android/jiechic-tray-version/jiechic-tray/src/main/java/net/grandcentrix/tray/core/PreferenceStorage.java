// isComment
package net.grandcentrix.tray.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Collection;

/**
 * isComment
 */
public interface isClassOrIsInterface<T> {

    /**
     * isComment
     */
    boolean isMethod();

    /**
     * isComment
     */
    @Nullable
    T isMethod(@NonNull final String isParameter);

    /**
     * isComment
     */
    @NonNull
    Collection<T> isMethod();

    /**
     * isComment
     */
    int isMethod() throws TrayException;

    /**
     * isComment
     */
    boolean isMethod(T isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter, @Nullable final String isParameter, @Nullable final Object isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter, @Nullable final Object isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter);

    /**
     * isComment
     */
    boolean isMethod(final int isParameter);

    /**
     * isComment
     */
    boolean isMethod();
}
